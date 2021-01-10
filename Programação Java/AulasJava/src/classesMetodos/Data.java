package classesMetodos;

//OBJETIVO: criar uma classe DataClasse e instanciar(ou criar objeto) duas datas. 
public class Data {

	// Atributos.
	int dia;
	int mes;
	int ano;

	// Construtor padrao.
	Data() {
		dia = 01;
		mes = 01;
		ano = 1970;
	}

	/*
	 * Construtor nao-padrao, pois recebe argumentos. Logo, para que o padrao exista
	 * e necessario cria-lo, ja que a agora ele nao e mais entendido.
	 */
	Data(int diaEscolhido, int mesEscolhido, int anoEscolhido) {
		dia = diaEscolhido;
		mes = mesEscolhido;
		ano = anoEscolhido;
	}

	// Metodo. Coloca a data formatada.
	String dataFormatada() {
		// Funcao para formatar (String)
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
