package orientadoObjeto.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	// Construtor padrao, vai chamar outro construtor dentro da classe com a mesma
	// assinatura dos parametros inseridos no this().
	@SuppressWarnings("unused")
	private Ferrari() {
		this(0);
	}

	// Construtor chama contrutor da classe pai com o super(...).
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setValor(15); // Modifica o valor.
	}

	// Interface.
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	@Override
	public int getValor() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		}

		else if (ligarTurbo && ligarAr) {
			return 30;
		}

		else if (!ligarTurbo && !ligarAr) {
			return 20;
		}

		else {
			return 15;
		}
	}

	/*
	 * Nao precisa sobrescrever porque aqui o valor é 15.
	 * 
	 * @Override public void acelerar() { super.acelerar(); super.acelerar();
	 * super.acelerar(); }
	 * 
	 * @Override public void frear() {
	 * 
	 * if (this.velocidadeAtual >= 15) { this.velocidadeAtual = this.velocidadeAtual
	 * - 15; } else { this.velocidadeAtual = 0; }
	 * 
	 * }
	 */
}
