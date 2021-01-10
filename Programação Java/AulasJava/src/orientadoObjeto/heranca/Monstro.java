package orientadoObjeto.heranca;

public class Monstro extends Jogador {

	// Heranca #03
	@SuppressWarnings("unused")
	private Monstro() {
		this(0, 0);
	}

	public Monstro(int x, int y) {
		super(x, y);
	}
}
