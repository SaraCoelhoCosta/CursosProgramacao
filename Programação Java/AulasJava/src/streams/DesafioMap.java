package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 * 1 - Converter numero para binario e retornar como string. Ex: 6 => "110".
 * 2 - Inverter string. Ex: "110" => "011".
 * 3 - Converter a string para numero de base dez. Ex: "011" => 3.
 */

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// Inverte a string anterior.
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

		Function<String, Integer> binarioParaInt = n -> Integer.parseInt(n, 2);

		nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInt).forEach(System.out::println);
	}
}
