package br.com.cod3r.campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Conjunto de campos.
public class Tabuleiro implements CampoObserver {

	private final int linhas;
	private final int colunas;
	private final int minas;

	private final List<Campo> campos = new ArrayList<>();
	private final List<Consumer<ResultadoEvento>> observers = new ArrayList<>();

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	// Vai percorrer cada campo do tabuleiro e criar um tipo especifico para cada
	// campo.
	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}

	public void registrarObserver(Consumer<ResultadoEvento> observer) {
		observers.add(observer);
	}

	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		if (evento == CampoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservers(false);
		} else if (getObjetivoAlcancadoNoTabuleiro()) {
			notificarObservers(true);
		}

	}

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;

		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	// Usuario vai indicar campo a ser aberto, caso tenha uma mina todas as outras
	// minas serao abertas.
	public void campoAbertoPeloUsuario(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
				.ifPresent(c -> c.getAbrir());

	}

	// Usuario vai marcar.
	public void campoMarcadoPeloUsuario(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
				.ifPresent(c -> c.alterarMarcacao());
	}

	/*
	 * Verifica se o tabuleiro inteiro obteve o objetivo de abrir todos os campo ou
	 * marcar todas as mina foi alcancado.
	 */
	public boolean getObjetivoAlcancadoNoTabuleiro() {
		return campos.stream().allMatch(c -> c.getObjetivoAlcancadoNoCampo());
	}

	// Reinicia jogo inteiro.
	public void reiniciarJogo() {
		campos.stream().forEach(c -> c.reiniciarCampo());
		sortearMinas();
	}

	// Cria cada campo com sua linha e sua coluna.
	void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				Campo campo = new Campo(linha, coluna);
				campo.registrarObserver(this);
				campos.add(campo);
			}
		}
	}

	void associarVizinhos() {
		for (Campo c1 : campos) {
			for (Campo c2 : campos) {
				c1.getAdicionarVizinho(c2);
			}
		}
	}

	// Adiciona minas de forma aleatoria.
	void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();

		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while (minasArmadas < minas);
	}

	private void notificarObservers(boolean resultado) {
		observers.stream().forEach(o -> o.accept(new ResultadoEvento(resultado)));
	}

	private void mostrarMinas() {
		campos.stream().filter(c -> c.isMinado()).filter(c -> !c.isMarcado()).forEach(c -> c.setAberto(true));
	}
}
