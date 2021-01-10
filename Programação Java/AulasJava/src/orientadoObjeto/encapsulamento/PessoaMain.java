package orientadoObjeto.encapsulamento;

//Getters-Setters
public class PessoaMain {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Joao", "Costa", -45);
		/*
		 * Alterar. p1.idade = -30;
		 */
		p1.setIdade(230);

		// Ler.
		// System.out.println("Nome: " + p1.getNome());
		// System.out.println("Idade: " + p1.getIdade());

		// toString.
		System.out.println(p1);

	}

}
