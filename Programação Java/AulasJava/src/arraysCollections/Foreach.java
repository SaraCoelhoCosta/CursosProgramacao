package arraysCollections;

public class Foreach {
	public static void main(String[] args) {
		double[] notas = {9.8, 5.0, 7.3, 8.7};
		
		System.out.println("IMPRIME NOTAS USANDO FOR:");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println("\nIMPRIME NOTAS USANDO FOREACH:");
		for (double nota : notas) { 
			System.out.print(nota + " ");
		}
	}
}
