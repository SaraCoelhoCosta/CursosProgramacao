package classesMetodos;



public class ValorVsReferencia {
	public static void main(String[] args) {

		int a = 2;
		// Atribuicao por valor.
		int b = a;

		System.out.println("ATRIBUICAO POR VALOR\nValor inicial:\na = " + a + "\nb = " + b);

		// Incremento e decremento.
		a++;
		b--;

		System.out.println("\nValor final:\na = " + a + "\nb = " + b);

		int c = 5;
		System.out.println("\nANTES DO METODO\nc = " + c);
		alterarPrimitivo(c);
		System.out.println("DEPOIS DO METODO\nc = " + c);

		
		// Usando programa DesafioDataClasse que esta no mesmo pacote.
		Data d1 = new Data(19, 11, 2000);
		// Atribuicao por referencia.
		Data d2 = d1;

		System.out.println("\nATRIBUICAO POR REFERENCIA\nData inicial:\nd1 = " + d1.dataFormatada() + "\nd2 = "
				+ d2.dataFormatada());

		d1.dia = 06;
		d2.mes = 04;
		System.out.println("\nData final:\nd1 = " + d1.dataFormatada() + "\nd2 = " + d2.dataFormatada());

		//Chamada do metodo que recebe um objeto como parametro.
		voltarDataPadrao(d1);
		
		System.out.println("\nDEPOIS DO METODO\nd1 = " + d1.dataFormatada() + "\nd2 = " + d2.dataFormatada());
	}

	// Um metodo static só pode acessar outro metodo tambem static. Recebe um objeto por referencia.
	static void voltarDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	// Recebe um primitivo por referencia.
	static void alterarPrimitivo(int c) {
		c++;
	}
}
