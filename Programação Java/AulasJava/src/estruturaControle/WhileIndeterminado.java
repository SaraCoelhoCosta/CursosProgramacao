package estruturaControle;

import java.util.Scanner;

//Estrutura normalmente usada para condicoes indeterminadas. Pode executar varias vezes ou nenhuma vez.
public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		//Declaracao de palavra que recebe vazio.
		String palavra = "";
		
		//Enquanto a palavra/frase nao for "sair" permanece no loop.
		while(!palavra.equalsIgnoreCase("sair")) {
			
			//Solicita e le uma palavra ou frase.
			System.out.print("Digite uma palavra: ");
			palavra = entrada.next();
				
		}
		
		System.out.print("Fim do programa!");
		entrada.close();
	}

}
