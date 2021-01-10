package br.com.cod3r.campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.campoMinado.excecao.ExplosaoException;

// Quadradinho do tabuleiro.
public class Campo {

	/* Localizacao no tabuleiro. */
	private final int linha;
	private final int coluna;

	/*
	 * Valor padrao 'false'. Campo ja foi aberto ou nao. Foi sinalizado pelo usuario
	 * ou nao. Tem mina ou nao.
	 */
	private boolean aberto;
	private boolean minado;
	private boolean sinalizado;

	private List<Campo> vizinhos = new ArrayList<>();

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
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

	// Vai verificar se os campos vizinhos ao escolhido tem mina.
	boolean getVerificaSeVizinhacaEstaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}

	// Calcula as minas que tem proximo ao campo.
	long getCalculaMinaNaVizinhaca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}

	// Verifica se campo foi sinalizado.
	public boolean isSinalizado() {
		return sinalizado;
	}

	// Altera a sinalizacao do campo.
	void alterarSinalizacao() {
		if (!aberto) {
			sinalizado = !sinalizado;
		}
	}

	// Coloca mina no campo.
	boolean isMinado() {
		return minado;
	}

	// Coloca mina no campo.
	void minar() {
		minado = true;
	}

	// Verifica se campo esta aberto.
	public boolean isAberto() {
		return aberto;
	}

	// Verifica se campo esta aberto.
	void setAberto(boolean aberto) {
			this.aberto = aberto;
	}

	// Abre campo.
	boolean getAbrir() {

		// Abre campo que esta fechado e sem sinalizacao.
		if (!aberto && !sinalizado) {
			aberto = true;

			// Se o campo aberto tiver mina lanca excecao.
			if (minado) {
				throw new ExplosaoException();
			}

			// Se nao tiver mina verifica vizinhos.
			else if (getVerificaSeVizinhacaEstaSegura()) {
				// Abre campos vizinhos enquanto nao tiver mina.
				vizinhos.forEach(v -> v.getAbrir());
			}
			return true;
		} else {
			return false;
		}
	}

	// Exibe no console.
	public String toString() {

		if (sinalizado) {
			return "X";
		}

		else if (aberto && minado) {
			return "*";
		}

		else if (aberto && getCalculaMinaNaVizinhaca() > 0) {
			return Long.toString(getCalculaMinaNaVizinhaca());
		}

		else if (aberto) {
			return " ";
		}

		else {
			return "?";
		}
	}

	/*
	 * Verifica se naquele campo o objetivo de abrir ou sinalizar uma mina foi
	 * alcancado.
	 */
	boolean getObjetivoAlcancadoNoCampo() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && sinalizado;
		return desvendado || protegido;
	}

	// Reinicia o campo.
	void reiniciarCampo() {
		aberto = false;
		sinalizado = false;
		minado = false;
	}

}
