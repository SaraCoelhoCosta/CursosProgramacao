package generics;

import java.util.Arrays;
import java.util.List;

public class ListaGenericsEmMetodosMain {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Sem Generics.
		String ultimaLinguagem1 = (String) ListaGenericsEmMetodos.getUltimo1(langs);
		Integer ultimoNumero1 = (Integer) ListaGenericsEmMetodos.getUltimo1(numbers);
		System.out.println("Ultima linguagem (1): " + ultimaLinguagem1);
		System.out.println("Ultimo numero (1): " + ultimoNumero1);

		// Com Generics.
		String ultimaLinguagem2 = ListaGenericsEmMetodos.getUltimo2(langs);
		Integer ultimoNumero2 = ListaGenericsEmMetodos.<Integer>getUltimo2(numbers); // Tipo Integer de forma explicita.
		System.out.println("Ultima linguagem (2): " + ultimaLinguagem2);
		System.out.println("Ultimo numero (2): " + ultimoNumero2);

	}
}
