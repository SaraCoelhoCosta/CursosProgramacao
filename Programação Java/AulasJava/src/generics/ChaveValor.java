package generics;

import java.util.Optional;
import java.util.Set;
import java.util.LinkedHashSet;

public class ChaveValor<K extends Number, V> {

	private final Set<ChaveValorGenerics<K, V>> itens = new LinkedHashSet<>();

	public void adicionar(K chave, V valor) {
		if (chave == null) {
			return;
		}
		ChaveValorGenerics<K, V> novo = new ChaveValorGenerics<K, V>(chave, valor);
		if (itens.contains(novo)) {
			itens.remove(novo);
		}
		itens.add(novo);
	}

	public V getValor(K chave) {
		if (chave == null) {
			return null;
		}

		/*
		 * Filtro: Se a chave passada que foi passada for igual a
		 * de um dos itens entao ele vai filtrar o item.
		 */
		Optional<ChaveValorGenerics<K, V>> opcional = itens.stream().filter(i -> chave.equals(i.getChave())) 
				.findFirst();
		
		return opcional.isPresent() ? opcional.get().getValor() : null;
	}
}
