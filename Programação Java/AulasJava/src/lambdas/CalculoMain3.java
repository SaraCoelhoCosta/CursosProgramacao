package lambdas;

import java.util.function.BinaryOperator;

public class CalculoMain3 {

	public static void main(String[] args) {

		// --------------------------- DOUBLE
		// ----------------------------------------------//
		// Funcao pronta do java.
		BinaryOperator<Double> calc = (num1, num2) -> {
			return num1 + num2;
		};
		/*
		 * Nao tem mais a funcao executar criada na interface Calculo.
		 * System.out.println("Resultado da soma: " + calc.executar(2, 3));
		 */
		// Java nao converte um tipo primitivo int para Double (nao pode ser 2 tem que
		// ser 2.0).
		System.out.println("Resultado da soma: " + calc.apply(2.0, 3.0));

		// Funcao lambda: implicito.
		calc = (num1, num2) -> num1 * num2;
		System.out.println("Resultado da multiplicacao: " + calc.apply(2.0, 3.0));

		// --------------------------- INTERGER
		// ----------------------------------------------//
		BinaryOperator<Integer> calc2 = (num1, num2) -> {
			return num1 + num2;
		};

		System.out.println("Resultado da soma: " + calc2.apply(2, 3));

		// Funcao lambda: implicito.
		calc2 = (num1, num2) -> num1 * num2;
		System.out.println("Resultado da multiplicacao: " + calc2.apply(2, 3));

	}

}
