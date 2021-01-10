package orientadoObjeto.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nomeCliente;
	final List<Compra> compras = new ArrayList<Compra>();

	Cliente (String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	
	void adicionarCompra(Compra c){
		compras.add(c);
	}
	
	
	double obterValorTotal() {
		double total = 0;

		for (Compra compra : compras) {
			total = total + compra.obterValorTotal();
		}
		return total;
	}
}
