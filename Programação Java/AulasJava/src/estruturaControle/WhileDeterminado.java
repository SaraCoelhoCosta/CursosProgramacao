package estruturaControle;

//Estrutura normalmente usada para condicoes indeterminadas. Pode executar varias vezes ou nenhuma vez.
public class WhileDeterminado {

	public static void main(String[] args) {
		
		//Declaracao. Contador inicializado com 1.
		int contador = 1;

		//Condicao. Enquanto o contador nao for 10.
		while(contador <= 10) {
			//Imprime Bom dia
			System.out.println("Bom dia!");
			//Incremento. Contador aumenta 1, ou seja contador =  contador + 1.
			contador++;
		}
	}

}
