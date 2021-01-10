package arraysCollections;

import java.util.Arrays;
import java.util.Scanner;

//Pegar quantidade de alunos e quantidades de notas por aluno, e calcular media final da turma.
public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita quantidade de alunos.
		System.out.print("Quantos alunos? ");
		int quantidadeAlunos = entrada.nextInt();

		// Solicita quantidade de notas por aluno.
		System.out.print("Quantas notas por aluno? ");
		int quantidadeNotas = entrada.nextInt();

		// Declaracao da matriz.
		double[][] notas = new double[quantidadeAlunos][quantidadeNotas];
		double soma = 0, mediaTurma;

		System.out.println();
		// Preechendo a matriz.
		for (int i = 0; i < notas.length; i++) {
			System.out.println("ALUNO " + (i + 1));

			for (int j = 0; j < notas[i].length; j++) {
				System.out.print("Informe a nota " + (j + 1) + "ª: ");
				notas[i][j] = entrada.nextDouble();
				soma = soma + notas[i][j];
			}
			System.out.println();
		}

		// Foreach da matriz.
		for (double[] notasAluno : notas) {
			System.out.println(Arrays.toString(notasAluno));
		}

		// Media da turma.
		mediaTurma = soma / (quantidadeAlunos * quantidadeNotas);
		System.out.println("Media da turma = " + mediaTurma);

		entrada.close();

	}

}
