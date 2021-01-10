package lambdas;

public class CalculoMain2 {

	public static void main(String[] args) {

		// Funcao lambda: explicito.
		Calculo calc = (num1, num2) -> {
			return num1 + num2;
		};
		System.out.println("Resultado da soma: " + calc.executar(2, 3));

		// Funcao lambda: implicito.
		calc = (num1, num2) -> num1 * num2;
		System.out.println("Resultado da multiplicacao: " + calc.executar(2, 3));

		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}

}
