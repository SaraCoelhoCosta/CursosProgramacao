package orientadoObjeto.heranca.teste;

import orientadoObjeto.heranca.desafio.Carro;
import orientadoObjeto.heranca.desafio.Civic;
import orientadoObjeto.heranca.desafio.Ferrari;

public class CarroMain {

	public static void main(String[] args) {

		Carro civic = new Civic(100);
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println("Civic");
		System.out.println(civic.toSting());

		Ferrari ferrari = new Ferrari(210);
		// Interface.
		ferrari.ligarTurbo();

		// Metodo
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.frear();

		System.out.println("\nFerrari");
		System.out.println("Nivel do ar: " + ferrari.nivelDoAr());
		System.out.println(ferrari.toSting());

	}

}
