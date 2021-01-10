package arraysCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetOrganizado {

	public static void main(String[] args) {

		// Ordenado.
		SortedSet<String> listaAprovados = new TreeSet<>();

		listaAprovados.add("Sara");
		listaAprovados.add("Wesley");
		listaAprovados.add("Lara");
		System.out.println("Set ordenado: " + listaAprovados);

		// Nao ordenado.
		Set<Integer> num = new HashSet<>();

		num.add(19);
		num.add(06);
		num.add(04);

		System.out.print("Set nao ordenado: ");
		for (int valor : num) {
			System.out.print(valor + " ");
		}

	}

}
