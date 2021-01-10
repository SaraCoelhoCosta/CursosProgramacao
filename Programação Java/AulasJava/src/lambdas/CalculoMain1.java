package lambdas;

public class CalculoMain1 {
	public static void main(String[] args) {

		Calculo calculo = new Somar();
		System.out.println("Resultado da soma: " + calculo.executar(2, 3));
		
		calculo = new Multiplicar();
		System.out.println("Resultado da multiplicacao: " + calculo.executar(2, 3));
	}
}
