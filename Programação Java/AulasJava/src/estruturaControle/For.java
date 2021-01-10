package estruturaControle;

//Estrutura normalmente usada para condicoes determinadas. Pode executar varias vezes ou nenhuma vez.
public class For {

	public static void main(String[] args) {

		//Declaracao(quando feita dentro do laco, ela so pode ser usada dentro do laco), condicao e incremento de 2 em 2(crescente).
		System.out.println("Crescente:");
		for (int contador = 1; contador <= 10; contador+=2) {
			// Imprime
			System.out.println("contador = " + contador);
		}

		//Declaracao(quando feita dentro do laco, ela so pode ser usada dentro do laco), condicao e decremento de 2 em 2(decrescente).
		System.out.println("\nDecrescente:");
		for (int contador = 10; contador >= 0; contador-=2) {
			// Imprime
			System.out.println("contador = " + contador);
		}
	}

}
