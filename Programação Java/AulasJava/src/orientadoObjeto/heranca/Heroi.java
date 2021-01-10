package orientadoObjeto.heranca;

public class Heroi extends Jogador {

	// Heranca #02 - Sobrescrever metodo.
	/*
	 * boolean atacar(Jogador oponente) {
	 * 
	 * int deltaX = Math.abs(this.x - oponente.x); int deltaY = Math.abs(this.y -
	 * oponente.y);
	 * 
	 * if(deltaX == 0 && deltaY == 1) { oponente.vida = oponente.vida - 20; return
	 * true; }
	 * 
	 * if(deltaX == 1 && deltaY == 0) { oponente.vida = oponente.vida - 20; return
	 * true; } else { return false; } }
	 */

	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);

		return ataque1 || ataque2;
	}

	// Heranca #03
	/*
	 * Heroi(){ super(); }
	 */
	public Heroi(int x, int y) {
		super(x, y);
	}
}
