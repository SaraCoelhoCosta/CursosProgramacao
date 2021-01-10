package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		 
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750.0;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println("O produto e caro? " + isCaro.test(produto));
	}
}
