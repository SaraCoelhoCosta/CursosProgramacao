package generics;

public class ChaveValorGenerics<K, V> {

	private K chave;
	private V valor;
	
	public ChaveValorGenerics() {
	
	}
	
	public ChaveValorGenerics(K chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public K getChave() {
		return chave;
	}
	public void setChave(K chave) {
		this.chave = chave;
	}
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chave == null) ? 0 : chave.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChaveValorGenerics<?, ?> other = (ChaveValorGenerics<?, ?>) obj;
		if (chave == null) {
			if (other.chave != null)
				return false;
		} else if (!chave.equals(other.chave))
			return false;
		return true;
	}
	
	
}
