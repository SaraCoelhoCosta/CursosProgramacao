package orientadoObjeto.composicao;

import java.util.ArrayList;

//Relacionamento 1 pra n.
public class Compra {

	//Representa o nome do cliente.
	String cliente;
	//Itens de compra.
	ArrayList<Item> itens = new ArrayList<Item>();
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total = total + (item.preco * item.quantidade);
		}
		
		return total;
	}
	
	
}
