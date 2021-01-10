package estruturaControle;

//OBJETIVO: Fazer uma piramide de # ate 5 sem usar valor numerico para controlar o laco.
/* #
 * ##
 * ###
 * ####
 * #####
 */
public class DesafioFor {

	public static void main(String[] args) {
		
		//Declaracao string valor = "#", condicao enquanto valor < "######", concatear  + "#".
		for(String valor = "#"; !valor.equals("######"); valor+="#") {
			System.out.println(valor);
		}
	}

}
