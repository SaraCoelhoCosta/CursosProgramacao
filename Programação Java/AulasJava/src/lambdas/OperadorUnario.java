package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {

		UnaryOperator<Integer> maisDois = numero -> numero + 2;
		UnaryOperator<Integer> vezesDois = numero -> numero * 2;
		UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;
		
		System.out.println("Composicao de funcao:\n");
		//Soma dois -> multiplica dois -> ao quadrado.
		System.out.println("Frente para tras: " + maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0));
		
		//Faz o mesmo processo do de cima por causa do .compose() que faz ele comecar de tras pra frente.
		System.out.println("Tras para frente: " + aoQuadrado.compose(vezesDois).compose(maisDois).apply(0));
	}
}
