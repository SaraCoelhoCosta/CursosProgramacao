package orientadoObjeto.heranca.teste;
import orientadoObjeto.heranca.Direcao;
import orientadoObjeto.heranca.Heroi;
import orientadoObjeto.heranca.Jogador;
import orientadoObjeto.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador monstro = new Monstro(10, 10);
		monstro.x = 10;
		monstro.y = 10;
	
		Jogador heroi = new Heroi(10, 11);
		//heroi.x = 10;
		//heroi.y = 11;

		System.out.println("Monstro");
		System.out.println("Vertical: " + monstro.y);
		System.out.println("Horizontal: " + monstro.x);
		System.out.println("Vida: " + monstro.vida);
		
		System.out.println("\nHeroi");
		System.out.println("Vertical: " + heroi.y);
		System.out.println("Horizontal: " + heroi.x);
		System.out.println("Vida: " + heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("\nFim de jogo");
		System.out.println("Vida mostro: " + monstro.vida);
		System.out.println("Vida heroi: " + heroi.vida);
		
	}

}
