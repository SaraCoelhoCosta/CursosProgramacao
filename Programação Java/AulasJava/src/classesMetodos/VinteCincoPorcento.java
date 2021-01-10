package classesMetodos;

//OBJETIVO: O desconto deve ser 25% para todos os produtos.
public class VinteCincoPorcento {

	String nome;
	double preco; 
	static double desconto = 0.25;
	
	//Construtor
	VinteCincoPorcento(String nomeInicial){
			nome = nomeInicial;
		}
	
	
	//Metodo
	static double precoDesconto(double preco) {
		return preco * (1 - desconto);
	}
	
}
