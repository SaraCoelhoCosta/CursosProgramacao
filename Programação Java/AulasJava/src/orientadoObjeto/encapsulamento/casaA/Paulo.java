package orientadoObjeto.encapsulamento.casaA;

public class Paulo {
	
	void AcessosAna() {
		Ana esposa = new Ana();
		// Nao e possivel acessar pois e privado, ou seja so dela. 
		// System.out.println("Segredo de Ana: " + esposa.segredo);
		
		// Moro na mesma casa entao posso ver.
		System.out.println("Ana faz em casa: " + esposa.FacoDentroCasa);
		System.out.println("Ana fala: " + esposa.FormaDeFalar);
		System.out.println("O que todos sabem de Ana: " + esposa.TodosSabem);
	
	}
}
