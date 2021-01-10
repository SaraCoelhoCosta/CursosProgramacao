package arraysCollections;

import java.util.HashSet;
import java.util.Set;

public class SetBaguncado {

	@SuppressWarnings({"unchecked", "rawtypes"})
	public static void main(String[] args) {

		// Nao suporta tipos primitivos.
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // Converte double -> Double.
		conjunto.add(true); // Converte boolean -> Boolean.
		conjunto.add("Teste"); // String.
		conjunto.add(1); // Converte int -> Integer.
		conjunto.add('x'); // Converte char -> Caracter.

		System.out.println("O tamanho do conjunto sem repeticao e: " + conjunto.size());

		// Nao aceita repeticoes.
		conjunto.add(1); // Converte int -> Integer.
		System.out.println("O tamanho do conjunto com repeticao e: " + conjunto.size());
		conjunto.add("teste"); // Converte int -> Integer.
		System.out.println("O tamanho do conjunto sem repeticao e: " + conjunto.size());

		//Retorna true se conseguir remover e false se nao removeu nada.
		System.out.println("Removeu? " + conjunto.remove(2));
		System.out.println("Removeu? " + conjunto.remove("Teste"));
		System.out.println("O tamanho do conjunto depois de remover e: " + conjunto.size());

		//Retorna true se conseguir encontrar no conjunto e false se nao achar nada.
		System.out.println("Encontrou o elemento no conjunto ? " + conjunto.contains("teste"));
		System.out.println("Conjunto heterogeneo: " + conjunto);

		Set numeros = new HashSet();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		System.out.println("Conjunto homogeneo:" + numeros);

		//Operacao de interseccao entre dois conjuntos.
		conjunto.retainAll(numeros);
		System.out.println("Interseccao de conjuntos: " + conjunto);
		
		//Operacao de uniao entre dois conjuntos.
		conjunto.addAll(numeros);
		System.out.println("Uniao de conjuntos: " + conjunto);

		//Apaga o conjunto.
		conjunto.clear();
		System.out.println("Conjunto depois de apagado: " + conjunto);
		

	}
}
