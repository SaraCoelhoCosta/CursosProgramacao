package estruturaControle;

import java.util.Scanner;

//OBJETIVO: Calcule a media dos alunos, e contar quantas notas validas existem. Para sair o usuario deve digitar -1.

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota = 1, total = 0;
		int notaValida = 0;

		System.out.println("Digite -1 para sair.");
		while (nota != -1) {

			// Solicita e le notas.
			System.out.print("Digite uma nota: ");
			nota = entrada.nextDouble();

			// Verifica se a nota e invalida.
			if (nota > 10 || nota < -1) {
				System.out.println("Nota invailda!\nDigite uma nota valida.\n");
			}

			// Verifica se a nota e valida.
			else if (nota <= 10 && nota >= 0) {
				// Acumula a soma das notas.
				total = total + nota;
				// Conta as notas validas.
				notaValida++;
			}

			// Sai e calcula media
			else {
				total = total / (double) notaValida;
				System.out.println("Media da classe = " + total + "\nAte mais!");
			}
		}

		entrada.close();
	}
}
