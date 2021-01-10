package classesMetodos;

//Objetivo do exercicio e explicar os conceitos de membros de uma classe vs. instancias, e o modo de utilizacao basico.
public class AreaCircunferencia {

	double raio;
	/* Static e um modificador e vem antes do tipo. O valor de PI será 3.14 para todos os objetos criados.
	 * Mas ele ainda pode ser alterado.
	 * final static = static final, o valor nao pode ser mudado.
	 */
	static final double pi = 3.14;
	
	//Recebe o valor do raio.
	AreaCircunferencia(double raioInicial) {
		raio = raioInicial;
	}
	
	//Metodo com retorno e sem parametro.
	double area() {
		//Math e estatico. Utilizacao: elevar uma base a um numero.
		return pi* Math.pow(raio,2);
	}

	//Metodo estatico com retorno e com parametro. Faz parte da classe.
	static double area(double raio) {
		//Math e estatico. Utilizacao: elevar uma base a um numero.
		return pi* Math.pow(raio,2);
	}

}
