package estruturaControle;

import javax.swing.JOptionPane;

//Estrutura de Condicao - If-Else if que e múltiplas condicoes e um caso contrario ou nao. Neste caso apenas um unico bloco sera executado.
public class IfElseIf {

	public static void main(String[] args) {

		// Solicita uma nota.
		String nota = JOptionPane.showInputDialog("Digite um numero");

		// Converte a nota para double.
		double n1 = Double.parseDouble(nota);

		// Verifica o conceito de acordo com a nota.
		if (n1 > 10.0 && n1 < 0.0) {
			System.out.println("Nota invalida!");
		}
		else if(n1 >= 8.1){
			System.out.println("Conceito A!");
		}
		else if(n1 >= 6.1){
			System.out.println("Conceito B!");
		}
		else if(n1 >= 4.1){
			System.out.println("Conceito C!");
		}
		else if(n1 >= 2.1){
			System.out.println("Conceito D!");
		}
		else{
			System.out.println("Conceito E!");
		}
	}
}
