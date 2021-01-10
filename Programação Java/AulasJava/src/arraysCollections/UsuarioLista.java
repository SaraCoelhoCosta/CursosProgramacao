package arraysCollections;

public class UsuarioLista {
	String nome;

	public UsuarioLista(String nome) {
		this.nome = nome;
	}

	// Nao vai precisar da notacao ponto. Ele vai imprimir o nome.
	public String toString() {
		return this.nome;
	}

	/*
	 * public int hashCode() { 
	 * 	return 0; 
	 * }
	 * 
	 * public boolean equals(Object obj) { 
	 * 	UsuarioLista outroUsuario = (UsuarioLista) obj; 
	 * 	return this.nome.equals(outroUsuario.nome); 
	 * }
	 */

	// Botao direito -> Source -> para criar HashCode e Equals.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		UsuarioLista other = (UsuarioLista) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
