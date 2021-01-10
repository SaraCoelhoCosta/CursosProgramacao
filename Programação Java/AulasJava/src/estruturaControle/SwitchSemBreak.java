package estruturaControle;

//Estrutura Condicional - A partir do case que ele entrar, ele ira executar todos os cases abaixo.
public class SwitchSemBreak {

	public static void main(String[] args) {

		// Declaracao da string
		String faixa = "verde";

		switch (faixa.toLowerCase()) {
		// Casos
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxo":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sadan...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
			/*
			 * Caso padrao default: System.out.println("Nao sei nada...");
			 */
		}
	}

}
