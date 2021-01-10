package generics;

public class CaixaSemGenericsMain {

	public static void main(String[] args) {
		CaixaSemGenerics caixaA = new CaixaSemGenerics();
		/*
		 * Autobox: (primitivo)double -> (wrapper - versao nao primitiva de um tipo
		 * primitivo)Double.
		 */
		caixaA.guardar(2.3);

		// abrir() retorna Object entao precisa do cast explicito.
		Double coisaA = (Double) caixaA.abrir();
		System.out.println("Valor de coisa A: " + coisaA);

		CaixaSemGenerics caixaB = new CaixaSemGenerics();
		caixaB.guardar("Ola");

		// abrir() retorna Object entao precisa do cast explicito.
		String coisaB = (String) caixaB.abrir();
		System.out.println("Valor de coisa B: " + coisaB);

	}
}
