package orientadoObjeto.heranca.desafio;

public class Carro {

	protected int velocidadeAtual;
	public final int velocidadeMaxima;
	private int valor = 5;

	protected Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + getValor() >= velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		} 
		
		else {
			velocidadeAtual = velocidadeAtual + getValor();
		}
	}

	public void frear() {

		if (this.velocidadeAtual >= 5) {
			this.velocidadeAtual = this.velocidadeAtual - 5;
		} else {
			this.velocidadeAtual = 0;
		}
	}

	public String toSting() {
		return "Velocidade atual: " + velocidadeAtual + "Km/h.";
	}


	//Get-Set
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
}
