package javaDesktopSwing.padroesProjeto.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	// Pessoas que serao avisadas que o aniversariante chegou.
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

	public void registraObservadores(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}

	public void monitorarPortaria() {
		Scanner entrada = new Scanner(System.in);

		String notificar = "";
		while (!"sair".equalsIgnoreCase(notificar)) {

			System.out.println("Aniversariante chegou? ");
			notificar = entrada.nextLine();

			if ("sim".equalsIgnoreCase(notificar)) {
				// Criar evento.
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				// Notificar convidados.
				observadores.stream().forEach(o -> o.chegou(evento));
				notificar = "sair";
				
			} else {
				System.out.println("Alarme falso!");
			}
		}
		entrada.close();
	}
}
