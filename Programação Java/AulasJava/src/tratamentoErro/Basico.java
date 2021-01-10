package tratamentoErro;

public class Basico {

	public static void main(String[] args) {
	
		//Excecao.
		Aluno a1 = null;		
		
		//Tratar erro de forma generica.
		try {
		imprimirNomeDoAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Ocoreu um erro no momento "
					+ "de imprimir o nome do usuario.\n");
		}
		
		//Tratar erro de forma especifica.
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			//Imprime mensagem de qual e o erro. 
			System.out.println("Ocorreu o erro: " + e.getMessage());
			//e.printStackTrace(); - Mostra excecao.
		}
		
		System.out.println("\nFim :)");
	}
	
	//Vulneravel pois o valore pode ser nulo.
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
