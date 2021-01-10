package streams;

//Vai usar o DesafioFilter.
public class Produto {

	final String nome;
	final double preco;
	final double desconto;
	final boolean freteGratis;
	
	public Produto(String nome, double preco, double desconto, boolean freteGratis) {
		this.nome = nome;
		this.desconto = desconto;
		this.preco = preco * (1 - this.desconto);
		this.freteGratis = freteGratis;
	}
}
