package br.com.cod3r.campoMinado.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.campoMinado.excecao.ExplosaoException;
import br.com.cod3r.campoMinado.excecao.SairException;
import br.com.cod3r.campoMinado.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;

		executarJogo();
	}

	// Inicia jogo.
	private void executarJogo() {
		try {
			boolean continuar = true;
			String resposta;

			loopDoJogo();
			while (continuar) {

				System.out.print("Nova partida? (S/n): ");
				resposta = entrada.nextLine();

				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciarJogo();
					loopDoJogo();
				}
			}
		} catch (SairException sair) {
			System.out.println("Tchau!!!");
		} finally {
			entrada.close();
		}

	}

	// Vai executar enquanto o usuario estiver jogando.
	private void loopDoJogo() {
		try {
			while (!tabuleiro.getObjetivoAlcancadoNoTabuleiro()) {
				System.out.println(tabuleiro);
				String coordenadas = capturarValorDigitado(
						"\n1 - Abrir campo\n2 - (Des)Sinalizar\nPara acabar com o jogo digite \"sair\" a qualquer momento.\nOpcao: ");

				if ("1".equals(coordenadas)) {
					coordenadas = capturarValorDigitado("Digite (x,y): ");

					// Trata a entrada (Verifica se e valida).
					if (Arrays.stream(coordenadas.split(",")).count() == 2) {
						// Converte cordenadas em inteiro e separa a partir da virgula.
						Iterator<Integer> xy = Arrays.stream(coordenadas.split(","))
								.map(n -> Integer.parseInt(n.trim())).iterator();
						tabuleiro.abertoPeloUsuario(xy.next(), xy.next());
					} else {
						System.out.println("Digite coordenadas x,y apenas! Tente novamente.\n");
					}
				}

				else if ("2".equals(coordenadas)) {
					coordenadas = capturarValorDigitado("Digite (x,y): ");
					if (Arrays.stream(coordenadas.split(",")).count() == 2) {
						Iterator<Integer> xy = Arrays.stream(coordenadas.split(","))
								.map(n -> Integer.parseInt(n.trim())).iterator();
						tabuleiro.sinalizadoPeloUsuario(xy.next(), xy.next());
					} else {
						System.out.println("Digite coordenadas x,y apenas! Tente novamente.\n");
					}
				}

				else {
					System.out.println("Opcao invalida! Tente novamente.\n");
				}
			}
			System.out.println(tabuleiro);
			System.out.println("Voce ganhou!");
		} catch (ExplosaoException explosao) {
			System.out.println(tabuleiro);
			System.out.println("Voce perdeu!");
		}

	}

	// Verifica se valor e uma saida repentina.
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String coordenadas = entrada.nextLine();
		if ("sair".equalsIgnoreCase(coordenadas)) {
			throw new SairException();
		}
		return coordenadas;
	}
}
