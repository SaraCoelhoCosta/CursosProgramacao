package fundamentos;

//OBJETIVO: Calcule a expressao: [ ([6 *(2+3)]²/ 3*2) - [(1 - 5) * (2 - 7)/ 2]² ]³ / 10³. 
// Math.pow(a,b) - funcao de exponenciacao.

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {

		// Calculando primira parte da expressao (numerador a).
		double exp1 = Math.pow(6 * (2 + 3), 2);
		exp1 = exp1 / (double) (2 * 3);

		// Calculando segunda parte da expressao (numerador b).
		double exp2 = ((1 - 5) * (2 - 7)) / (double) (2);
		exp2 = Math.pow(exp2, 2);

		// Resultado do numerador e denominador.
		double numerador = Math.pow(exp1 - exp2, 3);
		double denominador = Math.pow(10, 3);

		// Total da divisao do numerador pelo denominador.
		double total = numerador / denominador;

		System.out.println("O resultado final e igual a " + total);

	}

}
