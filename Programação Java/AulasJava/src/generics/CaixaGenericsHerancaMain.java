package generics;

public class CaixaGenericsHerancaMain {

	public static void main(String[] args) {
		
		CaixaGenericsHeranca caixaA = new CaixaGenericsHeranca();
		caixaA.guardar(123);
		Integer coisaA = caixaA.abrir();
		System.out.println("Valor de coisa A: " + coisaA);
	}
}
