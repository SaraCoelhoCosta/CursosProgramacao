package orientadoObjeto.composicao;

//Relacao 1 pra 1.
public class CarroMain {

	public static void main(String[] args) {

		Carro c1 = new Carro();

		System.out.println("O carro esta ligado? " + c1.carroLigado());

		c1.ligar();
		System.out.println("O carro esta ligado? " + c1.carroLigado());
		System.out.println("Quando giros estao sendo dados? " + c1.motor.giros());

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Quando giros estao sendo dados? " + c1.motor.giros());

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		/*
		 * Faltou encapsulamento! c1.motor.fatorInjecao = -30;
		 */
		System.out.println("Quando giros estao sendo dados? " + c1.motor.giros());

		// Relacao Bidirecional
		System.out.println("Quando giros estao sendo dados? " + c1.motor.carro.motor.carro.motor.giros());
	}
}
