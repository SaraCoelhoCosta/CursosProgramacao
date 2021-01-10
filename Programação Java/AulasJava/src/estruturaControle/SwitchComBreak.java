package estruturaControle;

import java.util.Scanner;

//Estrutura Condicional - A partir do case que ele entrar, ele nao ira executar os cases abaixo.
public class SwitchComBreak {

	public static void main(String[] args) {

		// Declaracao.
		int nota = 5;
		String conceito = "";

		Scanner entrada = new Scanner(System.in);

		// Solicita e le nota.
		System.out.print("Digite a nota: ");
		nota = entrada.nextInt();

		switch (nota) {
		// Casos.
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
			conceito = "E";
			break;
		case 0:
			conceito = "F";
			break;

		// Caso padrao
		default:
			conceito = "Nao informado ou nao encontrado.";
			break;
		}

		System.out.println("Conceito = " + conceito);
		entrada.close();
	}

}