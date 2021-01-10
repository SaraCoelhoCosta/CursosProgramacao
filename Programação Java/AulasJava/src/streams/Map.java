package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
	
	public static void main(String[] args) {
		
		//Imprime.
		Consumer<String> print = System.out::print;
		//Lista.
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		//Cria um Map do mesmo tamanho da lista passada, transforma (converte) e imprime o resultado. 
		marcas.stream().map((m -> m.toUpperCase())).forEach(print);
		
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		//UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n + "!!!\n";
		
		//System.out.println("\nResultado: " + maiuscula.andThen(primeiraLetra).andThen(grito).apply("sara"));
		System.out.println("\n\nUsando composicao...");
		marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra()).map(Utilitarios::grito).forEach(print);
	}
}
