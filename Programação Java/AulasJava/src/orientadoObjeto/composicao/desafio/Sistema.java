package orientadoObjeto.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto("Caneta", 1), 100);
		compra1.adicionarItem("Notebook", 2000, 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem(new Produto("Caderno", 10), 10);
		compra2.adicionarItem("Impressora", 1000, 1);
		
		Cliente cliente1 = new Cliente("Sara");
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(cliente1.nomeCliente + " gastou R$ " + cliente1.obterValorTotal() + " na compra!");
	}

}
