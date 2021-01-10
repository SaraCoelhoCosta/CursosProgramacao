package arraysCollections;

import java.util.Arrays;

public class Arrays2 {

	public static void main(String[] args) {

		// Declaracao de array.
		double[] notasAlunoA = new double[3];
		// Imprime array sem inicializacao.
		System.out.println(Arrays.toString(notasAlunoA));

		// Inicializacao da array.
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		double[] notasAlunoB = { 5.0, 9, 8.5 };

		// Imprime array inicializada.
		System.out.println("Notas do aluno A: " + Arrays.toString(notasAlunoA));
		System.out.println("Notas do aluno B: " + Arrays.toString(notasAlunoB));

		// Calcular media.
		double totalAlunoA = 0;
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];

		}
		// Imprime media.
		System.out.println("Media do aluno A: " + totalAlunoA / notasAlunoA.length);
		System.out.println("Media do aluno B: " + totalAlunoB / notasAlunoB.length);

	}

}
