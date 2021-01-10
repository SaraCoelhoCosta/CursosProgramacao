package classesMetodos;

import java.util.Scanner;

//OBJETIVO: O desconto deve ser 25% para todos os produtos.
public class VinteCincoPorcentoMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite nome do produto: ");
		String nomeProduto = entrada.next();

		VinteCincoPorcento p1 = new VinteCincoPorcento(nomeProduto);

		System.out.print("Digite o valor do produto: ");
		double valorProduto = entrada.nextDouble();

		System.out.println("\n" + p1.nome.toUpperCase() + "\nValor Inicial R$ " + valorProduto
				+ "\nValor final do produto é R$ " + VinteCincoPorcento.precoDesconto(valorProduto));
		entrada.close();
	}

}
