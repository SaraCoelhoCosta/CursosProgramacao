package fundamentos;

// OBJETIVO: Pegar o valor dos 3 ultimos salarios de um usuario e calcular a media.
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita salario 1.
		System.out.print("Digite o valor do 1° salario: ");
		// Armazena salario 1 em uma string e substitui a virgula pelo ponto.
		String salario1 = entrada.next().replaceAll(",", ".");

		// Solicita salario 2.
		System.out.print("Digite o valor do 2° salario: ");
		// Armazena salario 2 em uma string e substitui a virgula pelo ponto.
		String salario2 = entrada.next().replaceAll(",", ".");
		;

		// Solicita salario 3.
		System.out.print("Digite o valor do 3° salario: ");
		// Armazena salario 3 em uma string e substitui a virgula pelo ponto.
		String salario3 = entrada.next().replaceAll(",", ".");
		;

		// Converte os salarios para double.
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);

		// Imprime a media.
		System.out.print("Sua media salarial dos ultimos 3 meses foi de: " + (s1 + s2 + s3) / 3);
		entrada.close();

	}
}
