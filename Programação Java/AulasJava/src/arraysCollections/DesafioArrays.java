package arraysCollections;

import java.util.Scanner;

//OBJETIVO: Solicitar que o usuario diga o tamanho do array e inicialize o array, ao final calcule a media do numeros digitados pelo usuario.
public class DesafioArrays {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas notas serao informadas? ");
		int tamanho = entrada.nextInt();

		double[] notas = new double[tamanho];
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}

		double media = 0;
		//Foreach.
		for (double n : notas) {
			media += n;
		}
		System.out.println("A media da turma e: " + media/notas.length);
		entrada.close();
	}

}
