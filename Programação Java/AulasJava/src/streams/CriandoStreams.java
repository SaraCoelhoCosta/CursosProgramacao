package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		//Consumer<Integer> println = System.out::println;
		
		// Stream.of - metodo estatico.
		// 1
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

		// 2
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);

		// 3
		Arrays.stream(maisLangs).forEach(print);

		// 4
		Arrays.stream(maisLangs, 1, 4).forEach(print);

		// 5
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);

		//6 - Infinito.
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0, n -> n + 1).forEach(println);
	}

}
