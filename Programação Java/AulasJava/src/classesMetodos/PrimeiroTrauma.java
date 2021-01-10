package classesMetodos;

//OBJETIVO: Imprimir o valor que nao esta na main (linha 6 nao pode ser alterada). 
public class PrimeiroTrauma {

	int a = 3;
	static int b = 5;
	
	public static void main(String[] args) {

		// Mesmo estando dentro da classe so e possivel acessar um membro de instancia a partir de um metodo static criando uma instancia.
		// Cria uma instancia para acessar o valor de 'a'.
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println("a = " + p.a);
		
		//OU, se ele também for static e possivel acessar sem instancia.
		System.out.println("b = " + b);
		
	}

}
