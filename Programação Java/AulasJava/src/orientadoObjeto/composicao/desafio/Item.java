package orientadoObjeto.composicao.desafio;

public class Item {

	final int quantidadeProduto;
	final Produto produto;

	Item(Produto produto, int quantidadeProduto) {
		this.produto = produto;
		this.quantidadeProduto = quantidadeProduto;
	}
}
