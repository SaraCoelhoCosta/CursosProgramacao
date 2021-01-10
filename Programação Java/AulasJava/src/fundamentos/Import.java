package fundamentos;

/* Nem todas as funcionalidades estao disponiveis no JAVA entao e preciso realizar o import.
 * Apenas o java.lang.* esta disponivel, pois e o mais comum */

import java.util.Date; //Um exemplo de import

public class Import {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
	}
}
