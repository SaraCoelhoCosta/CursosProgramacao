package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {

		Predicate<Integer> isPar = numero -> numero % 2 == 0;

		Predicate<Integer> isTresDigitos = numero -> numero >= 100 && numero <= 999;

		System.out.println("E falso que o numero dado e par e possui tres digitos? "
				+ isPar.and(isTresDigitos).negate().test(123));
		System.out
				.println("E falso que o numero dado e par e possui tres digitos? " + isPar.or(isTresDigitos).test(122));

	}
}
