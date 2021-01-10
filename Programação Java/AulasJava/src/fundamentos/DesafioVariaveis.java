package fundamentos;

//OBJETIVO: Converter temperatura em Fahrenheit em graus Celsius C = (F - 32) * (5.0 / 9.0).
public class DesafioVariaveis {

	public static void main(String[] args) {

		// Valor em Fahrenheit fixo.
		double f = 49.8;

		// Converte para graus Celsius.
		double c = (f - 32.0) * (5.0 / 9.0);

		// Imprime resultado.
		System.out.println("A temperatura " + f + "°F e igual a " + c + "°C");

	}
}
