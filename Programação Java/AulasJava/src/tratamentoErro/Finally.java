package tratamentoErro;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {

			System.out.println("Insira um denominador inteiro para o valor 7: ");
			System.out.println(7 / entrada.nextInt());
			entrada.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {
			System.out.println("Finally...");
			entrada.close();
		}

		System.out.println("Fim!");
	}
}
