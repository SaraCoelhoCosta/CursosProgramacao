package fundamentos;

/*OBJETIVO: Se apenas 1 trabalho da terca ou da quinta der certo, a familia vai comprar uma TV de 32 polegadas.
 * Se os 2 trabalhos derem certo, a  familia ira comprar uma TV de 50 polegadas. Em ambos os casos apos comprar a TV a familia ira tomar sorvete.
 * Caso nenhum trabalho funcione a familia ira ficar em casa.
 */

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		//true ou false.
		System.out.println("Trabalho 1 deu certo? " + trabalho1);
		System.out.println("Trabalho 2 deu certo? " + trabalho2);
		
		//XOR (so e verdadeiro quando e VF ou FV).
		System.out.println("Vai comprar a TV de 32 polegadas? " + (trabalho1 ^ trabalho2));
		
		//AND (so e verdadeiro quando e VV).
		System.out.println("Vai comprar a TV de 50 polegadas? " + (trabalho1 && trabalho2));
		
		//OR (so e falso quando e FF).
		System.out.println("Vai tomar sorvete? " + (trabalho1 || trabalho2));
		
		//NOT - operador unario (quando for verdadeiro o resultado e falso e quando for falso o resultado e verdadeiro).
		System.out.println("Vai ficar em casa? " + !(trabalho1 || trabalho2));
	}
}
