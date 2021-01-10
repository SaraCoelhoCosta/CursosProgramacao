package generics;

public class ChaveValorMain {

	public static void main(String[] args) {
		
		ChaveValor<Integer, String> resultadoConcurso = new ChaveValor<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "Gui");
		resultadoConcurso.adicionar(4, "Ana");
		resultadoConcurso.adicionar(2, "Rebeca");
		
		System.out.println("Resultado 1: " + resultadoConcurso.getValor(1));
		System.out.println("Resultado 2: " + resultadoConcurso.getValor(2));
		System.out.println("Resultado 4: " + resultadoConcurso.getValor(4));
	}
}
