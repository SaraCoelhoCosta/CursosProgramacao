package orientadoObjeto.composicao;

//Relacao 1 pra 1.
public class Motor {

	double fatorInjecao = 1;
	boolean ligado = false;
	final Carro carro;

	Motor(Carro carro) {
		this.carro = carro;
	}

	int giros() {
		if (!ligado) {
			return 0;
		}

		else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
