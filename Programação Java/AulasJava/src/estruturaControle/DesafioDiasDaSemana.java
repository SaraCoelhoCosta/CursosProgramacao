package estruturaControle;

import java.util.Scanner;

//OBJETIVO: O usuário digitara um dia da semana e o programa deve dar um numero referente ao dia lido.
public class DesafioDiasDaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um dia da semana: ");
		String diaSemana = entrada.next();

		if (diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1° dia da semana.");
		} else if (diaSemana.equalsIgnoreCase("segunda") || diaSemana.equalsIgnoreCase("segunda-feira")) {
			System.out.println("2° dia da semana.");
		} else if (diaSemana.equalsIgnoreCase("terca") || diaSemana.equalsIgnoreCase("terca-feira")) {
			System.out.println("3° dia da semana.");
		} else if (diaSemana.equalsIgnoreCase("quarta") || diaSemana.equalsIgnoreCase("quarta-feira")) {
			System.out.println("4° dia da semana.");
		} else if (diaSemana.equalsIgnoreCase("quinta") || diaSemana.equalsIgnoreCase("quinta-feira")) {
			System.out.println("5° dia da semana.");
		} else if (diaSemana.equalsIgnoreCase("sexta") || diaSemana.equalsIgnoreCase("sexta-feira")) {
			System.out.println("6° dia da semana.");
		} else if (diaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("7° dia da semana.");
		} else {
			System.out.println("Dia invalido!");
		}

		// Libera o espaço.
		entrada.close();
	}

}
