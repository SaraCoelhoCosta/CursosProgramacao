package br.com.cod3r.campoMinado;

import br.com.cod3r.campoMinado.modelo.Tabuleiro;
import br.com.cod3r.campoMinado.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 4);
		new TabuleiroConsole(tabuleiro);
	}
}
