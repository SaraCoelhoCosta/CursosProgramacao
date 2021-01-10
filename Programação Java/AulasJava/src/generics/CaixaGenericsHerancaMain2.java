package generics;

public class CaixaGenericsHerancaMain2 {

	public static void main(String[] args) {
		
		CaixaGenericsHeranca2<Number> caixaA = new CaixaGenericsHeranca2<Number>();
		caixaA.guardar(2.3);
		System.out.println("Abrir caixa A: " + caixaA.abrir());
		
		CaixaGenericsHeranca2<Number> caixaB = new CaixaGenericsHeranca2<Number>();
		caixaB.guardar(2);
		System.out.println("Abrir caixa B: " + caixaB.abrir());
	}
}
