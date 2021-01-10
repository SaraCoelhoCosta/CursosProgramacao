package classesMetodos;

public class AreaCircunferenciaMain {

	public static void main(String[] args) {

		// Esta recebendo o valor do raio.
		AreaCircunferencia a1 = new AreaCircunferencia(10);

		/*
		 * Esta alterando o valor de PI sem o static sem final. a1.pi = 10; Esta
		 * alterando o valor de PI com o static sem final. AreaCircunferenciaClasse.pi =
		 * 3.1415;
		 */

		System.out.println("Area de Circunferencia de um Circulo (Objeto): " + a1.area());
		System.out.println("Area de Circunferencia de um Circulo (Metodo como parte da classe): "
				+ AreaCircunferencia.area(15));
	}

}
