package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//Vai usar a classe Produto.
public class DesafioFilter {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 1299.00, 0.25, true);
		Produto p2 = new Produto("Livro", 39.90, 0.0, false);
		Produto p3 = new Produto("Celular", 1050.00, 0.20, true);
		Produto p4 = new Produto("Fone", 226.00, 0.15, true);
		Produto p5 = new Produto("Jogo", 149.90, 0.10, false);
		Produto p6 = new Produto("Geladeira", 2149.90, 0.40, true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> descontoTrintaPorCento = p -> p.desconto >= 0.25;
		Predicate<Produto> freteGratis = p -> p.freteGratis;
		Function<Produto, String> superPromocao = p -> "Super promocao de(a) " + p.nome + " por apenas R$" + p.preco + ".";
		
		produtos.stream()
		.filter(descontoTrintaPorCento)
		.filter(freteGratis)
		.map(superPromocao)
		.forEach(System.out::println);
		
	}
}
