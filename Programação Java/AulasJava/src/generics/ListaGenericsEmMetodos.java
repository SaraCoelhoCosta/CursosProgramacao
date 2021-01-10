package generics;

import java.util.List;

public class ListaGenericsEmMetodos {

	// Sem Generics.
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}

	// Com Generics. Retorno do tipo T.
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}

	/*
	 * public static <A, B, C> C teste(A parametroA, B parametroB) { 
	 * 	C teste = null;
	 * 	return teste; 
	 * }
	 */
}
