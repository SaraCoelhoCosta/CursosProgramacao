package orientadoObjeto.heranca.desafio;

public class Civic extends Carro{

	//Construtor padrao, vai chamar outro construtor dentro da classe com a mesma assinatura dos parametros inseridos no this().
	@SuppressWarnings("unused")
	private Civic(){
		this(0);
	}
	
	//Construtor chama contrutor da classe pai com o super(...).
	public Civic(int velocidadeMaxima){
		super(velocidadeMaxima);
	}
	
}
