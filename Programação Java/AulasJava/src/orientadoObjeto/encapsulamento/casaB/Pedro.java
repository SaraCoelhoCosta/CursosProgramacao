package orientadoObjeto.encapsulamento.casaB;
import orientadoObjeto.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	

	void AcessosAna() {
		//Ana mae = new Ana();
		// Nao e possivel acessar pois e privado, ou seja so dela. 
		// System.out.println("Segredo de Ana: " + esposa.segredo);
		
		// Nao moro mesma casa entao posso ver.
		//System.out.println("Ana faz em casa: " + mae.FacoDentroCasa);
		
		// Herdei entao posso ver.
		System.out.println("Ana fala e eu falo: " + FormaDeFalar);
		System.out.println("O que todos sabem de Ana: " + TodosSabem);
		
	}

	
}
