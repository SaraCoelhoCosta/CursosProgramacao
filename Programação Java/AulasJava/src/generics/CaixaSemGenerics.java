package generics;

// Formas de fazer sem o generics.
public class CaixaSemGenerics {

	private Object coisa;

	// Metodo set.
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}

	// Metodo get.
	public Object abrir() {
		return coisa;
	}
}
