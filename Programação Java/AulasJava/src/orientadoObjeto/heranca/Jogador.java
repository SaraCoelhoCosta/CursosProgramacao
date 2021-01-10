package orientadoObjeto.heranca;

public class Jogador {

	public int vida = 100;
	// Posicoes do jogo de tabuleiro.
	public int x;
	public int y;

	// Heranca #03 - Chamada de construtor/metodo.
	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Heranca #01 - Quem e pai e quem e filho
	public boolean atacar(Jogador oponente) {

		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			oponente.vida = oponente.vida - 10;
			return true;
		}

		if (deltaX == 1 && deltaY == 0) {
			oponente.vida = oponente.vida - 10;
			return true;
		} else {
			return false;
		}
	}

	// E num
	public boolean andar(Direcao direcao) {
		if (direcao == Direcao.NORTE) {
			y--;
			return true;
		}

		else if (direcao == Direcao.LESTE) {
			x++;
			return true;
		}

		else if (direcao == Direcao.SUL) {
			y++;
			return true;
		}

		else if (direcao == Direcao.OESTE) {
			x--;
			return true;
		}

		else {
			return false;
		}

	}
}
