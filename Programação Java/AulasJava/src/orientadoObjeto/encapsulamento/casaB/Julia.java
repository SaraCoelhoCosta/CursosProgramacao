package orientadoObjeto.encapsulamento.casaB;

import orientadoObjeto.encapsulamento.casaA.Ana;

public class Julia {

	void AcessosAna() {
		Ana sogra = new Ana();
		// Nao e possivel acessar pois e privado, ou seja so dela.
		// System.out.println("Segredo de Ana: " + esposa.segredo);

		// Nao moro mesma casa entao posso ver.
		// System.out.println("Ana faz em casa: " + mae.FacoDentroCasa);

		// Nao herdei entao nao posso ver.
		// System.out.println("Ana fala e eu falo: " + FormaDeFalar);

		// Publico entao conheco.
		System.out.println("O que todos sabem de Ana: " + sogra.TodosSabem);

	}
}
