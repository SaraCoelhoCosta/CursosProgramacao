package estruturaControle;

import java.util.Scanner;

//Estrutura normalmente usada para condicoes indeterminadas. Pode executar varias vezes ou pelo menos uma vez.
public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Declaracao.
		String palavra;

		// Faça enquanto a palavra/frase nao for "sair" permanece no loop.
		do {
			// Solicita e le uma palavra ou frase.
			System.out.print("Digite uma palavra: ");
			palavra = entrada.next();

		} while (!palavra.equalsIgnoreCase("sair"));

		System.out.print("Fim do programa!");
		entrada.close();

	}

}
