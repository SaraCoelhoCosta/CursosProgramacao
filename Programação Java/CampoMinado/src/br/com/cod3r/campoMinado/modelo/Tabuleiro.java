package br.com.cod3r.campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.cod3r.campoMinado.excecao.ExplosaoException;

//Conjunto de campos.
public class Tabuleiro {

	private int quantidadeLinhas;
	private int quantidadeColunas;
	private int quantidadeMinas;

	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		if ((linhas > 0 && colunas > 0) && minas < linhas * colunas) {
			this.quantidadeLinhas = linhas;
			this.quantidadeColunas = colunas;
			this.quantidadeMinas = minas;

			gerarCampos();
			associarVizinhos();
			sortearMinas();
		}
	}

	// Usuario vai indicar campo a ser aberto, caso tenha uma mina todas as outras
	// minas serao abertas.
	public void abertoPeloUsuario(int linha, int coluna) {
		try {
			campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
					.ifPresent(c -> c.getAbrir());
		} catch (ExplosaoException explosao) {
			campos.forEach(c -> c.setAberto(true));
			throw explosao;
		}
	}

	// Usuario vai sinalizar.
	public void sinalizadoPeloUsuario(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
				.ifPresent(c -> c.alterarSinalizacao());
	}

	// Cria cada campo com sua linha e sua coluna.
	void gerarCampos() {
		for (int linha = 0; linha < quantidadeLinhas; linha++) {
			for (int coluna = 0; coluna < quantidadeColunas; coluna++) {
				campos.add(new Campo(linha, coluna));
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
		} while (minasArmadas < quantidadeMinas);
	}

	/*
	 * Verifica se o tabuleiro inteiro obteve o objetivo de abrir todos os campo ou
	 * sinalizar todas as mina foi alcancado.
	 */
	public boolean getObjetivoAlcancadoNoTabuleiro() {
		return campos.stream().allMatch(c -> c.getObjetivoAlcancadoNoCampo());
	}

	// Reinicia jogo inteiro.
	public void reiniciarJogo() {
		campos.stream().forEach(c -> c.reiniciarCampo());
		sortearMinas();
	}

	// Exibir tabuleiro no console.
	public String toString() {
		StringBuilder stringB = new StringBuilder();

		// Inidice das colunas para o tabuleiro.
		stringB.append("   ");
		for (int c = 0; c < quantidadeColunas; c++) {
			stringB.append(" ");
			stringB.append(c);
			stringB.append(" ");
		}
		
		stringB.append("\n");
		stringB.append("\n");
		
		int i = 0;
		for (int linha = 0; linha < quantidadeLinhas; linha++) {
			// Indice das linhas.
			stringB.append(linha);
			stringB.append("  ");

			for (int coluna = 0; coluna < quantidadeColunas; coluna++) {
				stringB.append(" ");
				stringB.append(campos.get(i));
				stringB.append(" ");
				i++;
			}
			stringB.append("\n");
		}
		return stringB.toString();

	}
}
