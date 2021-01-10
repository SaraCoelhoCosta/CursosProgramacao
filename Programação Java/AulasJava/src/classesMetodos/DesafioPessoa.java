package classesMetodos;

/* OBJETIVO: 3 classes (Pessoa, Comida, Jantar). Essa classe vai ter nome e peso da pessoa e um metodo comer que vai receber como parametro objeto da classe Comida.
 * O peso da comida sera acrescentado ao peso da pessoa.
 */
public class DesafioPessoa {

	String nome;
	double peso;

	DesafioPessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	String comer(DesafioComida c) {
		 this.peso = this.peso + c.peso;
		 return "Tenho: " + peso + "Kgs.";
	}
	
	String apresentar() {
		return "Ola sou o " + nome + "\nTenho: " + peso + "Kgs."; 
	}
}
