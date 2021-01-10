package classesMetodos;

/* OBJETIVO: criar uma classe DataMain e instanciar(ou criar objetos) 
 * duas datas, utilizando construtores e metodos. 
 */
public class DataMain {

	public static void main(String[] args) {

		// Instancia 1 (ou objeto 1). Quando a instancia e realizada e separado um
		// espaco na memoria para os atributos daquela classe.
		// Modelo usando construtor nao-padrao.
		Data data1 = new Data(19, 11, 2000);
		/*
		 * Objeto 1: atributos recebendo valores. 
		 * data1.dia = 19; 
		 * data1.mes = 11;
		 * data1.ano = 2000;
		 */

		// Instancia 2 (ou objeto 2). Quando a instancia e realizada e separado um
		// espaco na memoria para os atributos daquela classe.
		// Modelo usando construtor padrao.
		Data data2 = new Data();
		/*
		 * Objeto 2: atributos recebendo valores. 
		 * data2.dia = 25; 
		 * data2.mes = 10;
		 * data2.ano = 2019;
		 */
		
		
		/*
		 * Impressao de dados. Sem metodo. 
		 * System.out.println("Meu aniversario: " +
		 * data1.dia + "/" + data1.mes + "/" + data1.ano);
		 * 
		 * System.out.println("Importante: " + data2.dia + "/" + 
		 * data2.mes + "/" + data2.ano);
		 */

		// Impressao de dados. Com metodo.
		System.out.println("Meu aniversario: " + data1.dataFormatada());
		System.out.println("Importante: " + data2.dataFormatada());
	}
}
