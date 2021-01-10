package lambdas;

//Automaticamente herda de Object. 
public class Produto extends Object{

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		//Chama do Object.
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = this.preco * (1 - this.desconto);
		return "Nome: " + this.nome + "\nPreco: R$" + this.preco + "\nPreco final: R$" + precoFinal + ".\n";
	}
	
}
