package generics;

// Formas de fazer com o generics.
public class CaixaComGenerics<Tipo> {

	private Tipo coisa;

	// Metodo set.
	public void guardar(Tipo coisa) {
		this.coisa = coisa;
	}

	// Metodo get.
	public Tipo abrir() {
		return coisa;
	}
}
