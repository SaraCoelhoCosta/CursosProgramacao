package classesMetodos;

/*Complemento do ProdutoClasse.java, o programa ira testar os produtos cadastrados a partir do programa anterior. 
 * Como esta no mesmo pacote que ProdutoClasse.java entao nao precisa importar. Ex: import java.util.Scanner;
 * 
 * new e responsavel por chamar um construtor, que tem o mesmo nome da classe. Comparacao na atribuicao:
 * (tipo)int (nome)variavel (atribuição) = 3;
 * (tipo ou classe)Scanner (nome)entrada (atribuição)= new (construtor)Scanner();	
*/ 
public class ProdutoMain {
	
	public static void main(String[] args){
		//Quando a instancia e realizada e separado um espaço na memoria para os atributos daquela classe.
		
		/*Faz a ligacao com o ProdutoClasse.java. Cria o objeto 1 (instancia 1).
		 * O construtor padrao foi perdido, pois foi ciado um construtor 
		 * com argumento
		 */
		Produto p1 = new Produto("Macbook", 4200.00, 0.15);
		
		//Atributos do Objeto 1.
		/*Forma com construtor padrao -> p1.nome = "Notebook";
		 * p1.preco = 4200.00;
		 * p1.desconto = 0.15;
		 */
		
		
		//Faz a ligacao com o ProdutoClasse.java. Cria o objeto 2 (instancia 2).
		//Inferencia("var" - ele identifica o tipo de p2).
		//Usando construtor padrao.
		var p2 = new Produto();
		//Atributos do Objeto 2.
		p2.nome = "Celular";
		p2.preco = 1800.00;
		p2.desconto = 0.10;

		/*Valor com desconto. Sem metodo.
		double precoDesconto1 = p1.preco * (1 - p1.desconto);
		double precoDesconto2 = p2.preco * (1 - p2.desconto);
		*/
		
		//Valor com desconto. Com metodo.
		double precoDesconto1 = p1.precoDesconto();
		double precoDesconto2 = p2.precoDesconto();
		
		//Impressao de dados.
		System.out.println("Informacoes do produto 1:\nNome: " + p1.nome + "\nPreco original R$" + p1.preco 
				+ "\nPreco com desconto R$" + precoDesconto1);
		
		System.out.println("\nInformacoes do produto 2:\nNome: " + p2.nome + "\nPreco original R$" + p2.preco 
				+ "\nPreco com desconto R$" + precoDesconto2);
	}
}
