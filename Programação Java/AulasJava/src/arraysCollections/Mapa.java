package arraysCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuario = new HashMap<>();

		// Se adicionar um valor em uma chave já existente, faz com que altere o valor
		// contido na chave.
		usuario.put(1, "Antonio");
		usuario.put(2, "Conceicao");
		usuario.put(3, "Sara");

		System.out.println("Tamanho: " + usuario.size());
		System.out.println("Esta vazio: " + usuario.isEmpty());
		System.out.println("Chaves cadastradas: " + usuario.keySet());
		System.out.println("Valores cadastrados: " + usuario.values());
		System.out.println("Chave = Valor: " + usuario.entrySet());
		System.out.println("Chave 20 existe? " + usuario.containsKey(20));
		System.out.println("'Sara' existe? " + usuario.containsValue("Sara"));
		System.out.println("Qual valor da chave 2? " + usuario.get(2));
		System.out.println("Removeu? " + usuario.remove(2));
		// Percorrer por chave.
		for (int chave : usuario.keySet()) {
			System.out.println(chave);
		}

		// Percorrer por valor.
		for (String valor : usuario.values()) {
			System.out.println(valor);
		}

		// Percorrer valor e chave.
		for (Entry<Integer, String> registro : usuario.entrySet()) {
			System.out.print(registro.getKey() + " - ");
			System.out.println(registro.getValue());
		}

	}
}
