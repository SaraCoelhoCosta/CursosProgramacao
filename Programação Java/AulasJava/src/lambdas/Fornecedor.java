package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

		// Nao recebe parametros, entao coloca ().
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.print("Lista: ");
		System.out.println(umaLista.get());
	}
}
