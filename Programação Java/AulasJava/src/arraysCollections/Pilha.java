package arraysCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		// O .add retorna valor booleano, já o .push da erro quanod adiciona alem da
		// capacidade da pilha.
		livros.add("Ate que nada mais importe.");
		livros.push("Sherlock Holmes.");
		livros.push("Pequeno Principe.");

		System.out.println("Pilha de livros:");
		for (String pilha : livros) {
			System.out.println(pilha);
		}

		System.out.println("\nQuem e o topo? " + livros.peek());
		System.out.println("Quem e o topo? " + livros.element());
		System.out.println("Tamanho da pilha: " + livros.size());

		System.out.println("Quem sera removido? " + livros.remove());
		System.out.println("Quem sera removido? " + livros.poll());
		System.out.println("Quem sera removido? " + livros.poll());

		livros.clear();
		System.out.println("Pinha esta vazia? " + livros.isEmpty());
	}
}
