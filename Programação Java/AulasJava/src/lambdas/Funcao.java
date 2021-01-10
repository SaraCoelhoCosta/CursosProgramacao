package lambdas;

import java.util.function.Function;

//Apresenta a interface Function e composicao de funcoes.
public class Funcao {

	public static void main(String[] args) {

		// Interface funcional para numero par ou impar.
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";


		// Interface funcional para concatenar.
		Function<String, String> oResultadoE = 
				valor -> "O resultado e: " + valor;

		Function<String, String> empolgado = 
				valor -> valor + "!!!";

		/* Usando duas interfaces. Recece o numero e indica se e par ou impar e entao(andThen) 
		 * add o retorno a proxima funcao e entao chama a funcao empolgado. */
		String resultadoFinal = parOuImpar
				.andThen(empolgado)
				.andThen(oResultadoE)
				.apply(32);

		System.out.println(resultadoFinal);
		System.out.println("O numero e: " + parOuImpar.apply(32));
	}
}
