package classesMetodos;

public class ValorNulo {

	public static void main(String[] args) {

		// Tem que ser inicializada ou se nao tiver um valor fixo usar uam condicao.
		String s1 = "";

		System.out.println(s1.concat("!!!"));

		/*
		 * ERRO de compilacao, pois e variavel local. String s2;
		 * System.out.println(s1.concat("!!!"));
		 */

		/*
		 * ERRO em tempo de execução, pois está acessando um valor que nao esta
		 * apontando para nada. String s2 = null; System.out.println(s2.concat("???"));
		 * 
		 */
	}

}
