package generics;

public class CaixaComGenericsMain {

	public static void main(String[] args) {
		
		CaixaComGenerics<String> caixaA = new CaixaComGenerics<>();
		caixaA.guardar("Segredo!");
		String coisaA = caixaA.abrir();
		System.out.println("Valor de coisa A: " + coisaA);

		CaixaComGenerics<Double> caixaB = new CaixaComGenerics<>();
		caixaB.guardar(3.1415);
		Double coisaB = caixaB.abrir();
		System.out.println("Valor de coisa B: " + coisaB);

	}
}
