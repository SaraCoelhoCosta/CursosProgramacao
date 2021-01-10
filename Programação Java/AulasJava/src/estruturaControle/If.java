package estruturaControle;

import java.util.Scanner;

//Estrutura de Condicao - apenas IF que e a condicao.
public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		//Solicita e le media.
		System.out.print("Digite a media: ");
		double media = entrada.nextDouble();
		
		//Se media estiver entre 7.0 e 10.0 incluindo o 7 e o 10.
		if(media <= 10.0 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabens!");
		}
		
		//Se media estiver entre 5.0 e 7.0 incluindo o 5.
		if(media < 7.0 && media >= 5.0) {
			System.out.println("Recuparacao!");
		}
		
		//Se media estiver entre 5.0 e 0 incluindo o 0.
		if(media < 5.0 && media >= 0) {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
	}
}
