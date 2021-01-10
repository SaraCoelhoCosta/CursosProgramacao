package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		// Classe Produto foi definida para o exemplo do Predicado #01.
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + ".");

		// Instancia.
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.80, 0.18);
		Produto p5 = new Produto("Lapis", 4.39, 0.19);

		// Metodo.
		imprimirNome.accept(p1);

		System.out.println("\nLista com forEach:");
		List<Produto> produto = Arrays.asList(p1, p2, p3, p4, p5);

		// imprimirNome e do tipo Consumer e chama o accept automaticamente.
		produto.forEach(imprimirNome);
		produto.forEach(p -> System.out.println(p.preco));

		// Chama o toString.
		System.out.println("\n\nLista com toString:");
		// Metodo Reference.
		produto.forEach(System.out::println);
	}
}
