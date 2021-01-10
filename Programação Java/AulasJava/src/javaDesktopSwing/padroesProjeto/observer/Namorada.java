package javaDesktopSwing.padroesProjeto.observer;

public class Namorada implements ObservadorChegadaAniversariante {

	// Ocorrencia do evento.
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados.");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco, e...");
		System.out.println("Surpresa!!!");
	}
}
