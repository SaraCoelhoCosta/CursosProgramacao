package classesMetodos;

//Objetivo do exercicio e explicar os conceitos de classe e metodo, e o modo de utilizacao basico.
public class Produto {

	// Quando o construtor for chamado, os objetos que serao criados terao os mesmos atributos.
	
	//Atributos.
	String nome; // Nome do produto.
	double preco; // Variavel > 0.
	double desconto; // O desconto vai estar entre 0 - 1.

	/* Construtor (nao e o padrao, pois tem argumento). 
	 * Agora para usar o construtor padrao e necessario cria-lo.
	 */
	Produto(String nomeInicial, double precoIncial, 
			double descontoInicial){
		nome = nomeInicial;
		preco = precoIncial;
		desconto = descontoInicial;
	}
	
	//Construtor padrao.
	Produto(){
	}
	
	/* Metodo para calcular desconto. Nao precisa do parametro, 
	 * pois dentro do objeto ja tem os valores das variaveis que serao acessadas, e estao pertos do metodo.
	 */
	double precoDesconto() {
		return preco * (1 - desconto);
	}
	
}
