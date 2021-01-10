package javaDesktopSwing.padroesProjeto.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registraObservadores(namorada);
		porteiro.registraObservadores(e -> {
			System.out.println("Surpresa via lambda!");
			System.out.println("Evento ocorreu em: " + e.getMomento());
		});
		porteiro.monitorarPortaria();
		
	}
}
