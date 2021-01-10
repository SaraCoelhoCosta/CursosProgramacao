package estruturaControle;

import javax.swing.JOptionPane;

//Estrutura de Condicao - If-Else que a a condicao e o caso contrario. Neste caso apenas um unico bloco sera executado, ou um ou outro.
public class IfElse {

	public static void main(String[] args) {
		
		//Solicita um valor.
		String valor = JOptionPane.showInputDialog("Digite um numero");
		
		//Converte valor para int.
		int numero = Integer.parseInt(valor);

		//Verifica se ele e par.
		if(numero%2 == 0) {
			System.out.println("Numero par!");
		}
		//Caso contrario ele e impar.
		else {
			System.out.println("Numero impar!");
		}
	}
}
