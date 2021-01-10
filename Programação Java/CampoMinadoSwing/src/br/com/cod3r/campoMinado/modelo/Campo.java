package br.com.cod3r.campoMinado.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Quadradinho do tabuleiro.
public class Campo {

	/* Localizacao no tabuleiro. */
	private final int linha;
	private final int coluna;

	/*
	 * Valor padrao 'false'. Campo ja foi aberto ou nao. Foi marcado pelo usuario ou
	 * nao. Tem mina ou nao.
	 */
	private boolean aberto;
	private boolean minado;
	private boolean marcado;

	private List<Campo> vizinhos = new ArrayList<>();
	private Set<CampoObserver> observers = new HashSet<>();
	// Nao preciso criar interface posso usar: private
	// List<BiConsumer<Campo,CampoEvento>> observers2 = new ArrayList<>();

	public void registrarObserver(CampoObserver observer) {
		observers.add(observer);
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	// Verifica se campo foi marcado.
	public boolean isMarcado() {
		return marcado;
	}

	// Verifica se campo esta aberto.
	public boolean isAberto() {
		return aberto;
	}

	// Calcula as minas que tem proximo ao campo.
	public int getCalculaMinaNaVizinhaca() {
		return (int) vizinhos.stream().filter(v -> v.minado).count();
	}

	// Vai verificar se os campos vizinhos ao escolhido tem mina.
	public boolean getVerificaSeVizinhacaEstaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}

	// Coloca mina no campo.
	public boolean isMinado() {
		return minado;
	}

	// Altera a marcacao do campo.
	public void alterarMarcacao() {
		if (!aberto) {
			marcado = !marcado;

			if (marcado) {
				notificarObservers(CampoEvento.MARCAR);
			} else {
				notificarObservers(CampoEvento.DESMARCAR);
			}
		}
	}

	// Abre campo.
	public boolean getAbrir() {

		// Abre campo que esta fechado e sem marcacao.
		if (!aberto && !marcado) {
			// Se o campo aberto tiver mina lanca excecao.
			if (minado) {
				notificarObservers(CampoEvento.EXPLODIR);
				return true;
			}
			setAberto(true);

			// Se nao tiver mina verifica vizinhos.
			if (getVerificaSeVizinhacaEstaSegura()) {
				// Abre campos vizinhos enquanto nao tiver mina.
				vizinhos.forEach(v -> v.getAbrir());
			}
			return true;
		} else {
			return false;
		}
	}

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	boolean getAdicionarVizinho(Campo vizinho) {
		/*
		 * Verifica se a linha e coluna podem ser vizinhas do campo escolhido, ou seja,
		 * diferente do campo escolhido.
		 */
		boolean linhaDiferente = this.linha != vizinho.linha;
		boolean colunaDiferente = this.coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;

		/*
		 * deltaGeral = 2, entao diagonal. Se deltaGeral = 1, entao vertical ou
		 * horizontal.
		 */
		int deltaLinha = Math.abs(this.linha - vizinho.linha);
		int deltaColuna = Math.abs(this.coluna - vizinho.coluna);
		int deltaGeral = deltaLinha + deltaColuna;

		/*
		 * Verifica se e um campo horizontal, vertical ou diagonal e cria o campo caso
		 * seja uma das opcoes.
		 */
		if (deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		}

		else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}

		else {
			return false;
		}

	}

	// Coloca mina no campo.
	void minar() {
		minado = true;
	}

	// Verifica se campo esta aberto.
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		if (aberto) {
			notificarObservers(CampoEvento.ABRIR);
		}
	}

	/*
	 * Verifica se naquele campo o objetivo de abrir ou marcar uma mina foi
	 * alcancado.
	 */
	boolean getObjetivoAlcancadoNoCampo() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}

	// Reinicia o campo.
	void reiniciarCampo() {
		aberto = false;
		marcado = false;
		minado = false;
		notificarObservers(CampoEvento.REINICIAR);
	}

	private void notificarObservers(CampoEvento evento) {
		observers.stream().forEach(o -> o.eventoOcorreu(this, evento));
	}
}
