package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 * 1 - A partir do produto calcular o preco real (com desconto).
 * 2 - Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento).
 * 3 - Frete: >= 3000 (100) / < 3000 (50).
 * 4 - Arredondar: deixar duas casas decimais.
 * 5 - Formatar: R$1234,56.
 */
public class Desafio {

	public static void main(String[] args) {

		Produto p = new Produto("iPad", 3235.89, 0.03);

		Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> impostoMunicipal = precoReal -> precoReal >= 2500.0 ? precoReal * (1 + 0.085) : precoReal;
		UnaryOperator<Double> frete = precoReal -> precoReal >= 3000.0 ? precoReal + 100 : precoReal + 50;
		Function<Double, String> arredondar = precoReal -> String.format("%.2f", precoReal);
		UnaryOperator<String> formatar = valor -> "R$" + valor;

		System.out.println("Preco final: "
				+ precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p));

	}
}
