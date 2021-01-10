package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	//Como o construtir e privado nao e possivel instanciar.
	private Utilitarios() {
		
	}
	
	//Lambda.
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra() {
		return n -> n.charAt(0) + "";
	}
	
	//Funcao.
	public final static String grito(String n) {
		return n + "!!!\n";
	}
}
