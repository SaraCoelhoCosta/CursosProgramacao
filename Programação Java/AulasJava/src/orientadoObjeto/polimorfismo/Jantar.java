package orientadoObjeto.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.65);

		System.out.println("Peso antes da janta: " + convidado.getPeso() + "Kg.");

		Comida ingrediente1 = new Arroz(0.2);
		Comida ingrediente2 = new Feijao(0.1);
		Comida sobremesa = new Sorvete(0.4);

		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(sobremesa);

		System.out.println("Peso depois da janta: " + convidado.getPeso() + "Kg.");

		/*
		 * Nao pode instanciar classe abstrata Comida ingrediente3 = new Comida(0.3);
		 * convidado.comer(ingrediente3); System.out.println("Peso depois da janta: " +
		 * convidado.getPeso() + "Kg.");
		 */
	}

}
