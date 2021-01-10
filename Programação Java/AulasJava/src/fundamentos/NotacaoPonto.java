package fundamentos;

//A "notacao do ponto" funciona apenas com tipos nao primitivos.

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia X"; // Nao e um tipo primitivo

		// Nao altera valor original ("altera uma copia")
		s.replaceAll("X", "Senhora"); // Substituicao
		s.toUpperCase(); // Letras maiusculas
		s.concat("!!!"); // Concatenacao
		System.out.println("Antes:\nEx1: " + s + "\n");

		// Altera o valor original, pois sobrescreve a String
		s = s.replaceAll("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!");
		System.out.println("Depois:\nEx1: " + s);
		System.out.println("Ex2: " + "SARA".toLowerCase());

	}
}
