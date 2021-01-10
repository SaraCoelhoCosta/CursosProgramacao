package orientadoObjeto.composicao;

//Relacionamento 1 pra n.
public class CompraMain {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Joao Pedro";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Caderno", 3, 18.79));
		
		System.out.println("Quantos itens possui a compra: " + compra1.itens.size());
		System.out.println("Valor total da compra foi de R$ " + compra1.obterValorTotal());
	}

}
