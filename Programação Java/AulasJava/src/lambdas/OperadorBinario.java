package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
	
		BinaryOperator<Double> media = 
				(n1, n2) -> (n1 + n2) / 2;
				
		System.out.println("A media e: " + media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = 
				(n1, n2) -> ((n1 + n2)/2) >= 7.0 ? "Aprovado" : "Reprovado";
	
		System.out.println("Situacao: " + resultado.apply(9.7, 4.1));
				
		Function<Double, String> conceito =
				m -> m >= 7 ? "Aprovado" : "Reprovado"; 
				
		System.out.println("Situacao:" + media.andThen(conceito).apply(9.7, 5.1));
	}
}
