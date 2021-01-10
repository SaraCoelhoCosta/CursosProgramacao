package arraysCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Adiciona elemento. O .add da erro se a fila ultrapassar o tamanho definido.
		// Já o .offer retorna false.
		fila.add("Ana");
		fila.add("Antonio");
		fila.add("Joao");
		fila.add("Mariana");
		fila.offer("Bia");
		fila.offer("Rafaela");

		// Retorna proximo elemento, quando a fila esta vazia o .peek retorna null, mas
		// o .element da erro.
		System.out.println("Quem e o proximo? " + fila.peek());
		System.out.println("Quem e o proximo? " + fila.element());

		System.out.println("Fila esta vazia? " + fila.isEmpty());
		System.out.println("Tamanho da fila: " + fila.size());
		System.out.println("Joao esta na fila? " + fila.contains("Joao"));

		// Retorna proximo elemento e exclui, quando a fila esta vazia o .poll retorna
		// null, mas o .remove da erro.
		System.out.println("Proximo a ser removido: " + fila.poll());
		System.out.println("Proximo a ser removido: " + fila.remove());

	}
}
