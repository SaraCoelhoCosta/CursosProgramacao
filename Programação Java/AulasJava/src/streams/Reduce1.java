package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (acum, n) -> acum + n;
		
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println("Acumulador = " + total1);
		
		/*Passou valor inicial, entao nao precisa do get(). O stream() é sequencial, e executa o valor inicial apenas uma vez.
		 * O parallelStream() faz com cada elemento seja executado "ao mesmo tempo", ou seja,
		 * cada elemento será somado com o valor inicial e depois somado em um total, quando o valor inicial for dado. 
		 * Integer total2 = nums.parallelStream().reduce(100, soma);
		 * Ex: (100 + 1) + (100 + 2) + (100 + 3)... 
		 */
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println("Acumulador = " + total2);
		
		//Resultado foi um Opcional <Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}

}
