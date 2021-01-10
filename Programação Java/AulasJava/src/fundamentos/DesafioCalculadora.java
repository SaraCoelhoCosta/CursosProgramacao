package fundamentos;

import java.util.Scanner;

//OBJETIVO: Ler dois numeros dados pelo usuario e a operacao. Em seguida calcule e exiba o resultado.
public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Solicita e le o 1° numero.
		System.out.print("Digite o primeiro numero: ");  
		double n1 = entrada.nextDouble();
		
		//Solicita e le o 2° numero.
		System.out.print("Digite o segundo numero: ");
		double n2 = entrada.nextDouble();
		
		//Solicita e le a operacao.
		System.out.print ("Digite a operacao matematica: ");
		String operador = entrada.next();
		
		//Condicoes.
		/*resultado = comparacao verdadeira ? Sim, entao executa : Senao é 0.*/
		double resultado = operador.equals("+") == true? n1 + n2 : 0;
		resultado = operador.equals("-") == true? n1 - n2 : resultado;
		resultado = operador.equals("*") == true? n1 * n2 : resultado;
		resultado = operador.equals("/") == true? n1 / n2 : resultado; 
		resultado = operador.equals("%") == true? n1 % n2 : resultado;
		
		//Imprime resultado.
		System.out.println("\nResultado:\n" + n1 + " " + operador + " " + n2 + " = "+ resultado);
		entrada.close();
	}
}
