package classesMetodos;

//Explicar a partir do programa DesafioData como utilizar o This, This() e Variaveis Locais.
public class This {

	// Variavel global (pertence a instancia e pode ser acessada por todos os
	// metodos e construtores que nao sao static).
	int dia;
	int mes;
	int ano;

	This() {
		// dia = 01;
		// mes = 01;
		// ano = 1970;
		// Ele esta como metodo, mas so pode ser usado dentro de um construtor.
		this(25, 10, 2019);
	}

	// Parametros tambem sao variaveis locais.
	This(int dia, int mes, int ano) {
		/*
		 * Quando duas variaveis tem o mesmo no nao e possivel identificar quem e quem.
		 * Ex: dia = dia; Antes da igualdade - deveria ser o da classe, mas o programa
		 * so reconhece como o que esta dentro do construtor(paramentro). Depois da
		 * igualdade é o parametro passado. Para acessar a variavel da classe se coloca
		 * this antes. Ex: this.dia (classe, variavel de instancia) = dia (parametro);
		 */
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String dataFormatada() {
		// Variavel local (pode ser contante ou nao e so e visivel dentro desse metodo).
		final String formato = "%d/%d/%d";
		// Como nao tem conflito no nome da variavel, ele compreende que se refere a
		// classe. Nao e necessario o this.
		return String.format(formato, dia, mes, ano);
	}

	/*
	 * Nao e valido para metodo static. static void teste() { this.dia = 3; }
	 */
}
