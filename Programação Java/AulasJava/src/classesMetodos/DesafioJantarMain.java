package classesMetodos;

//OBJETIVO: 3 classes (Pessoa, Comida, Jantar). Essa classe vai ter um metodo main e criar uma pessoa e instanciar duas comidas.
public class DesafioJantarMain {
	
	public static void main(String []args) {
		
		
		DesafioPessoa p1 = new DesafioPessoa("Sara", 55.0);
		System.out.println(p1.apresentar());
		
		DesafioComida c1 = new DesafioComida("Macarrao", 0.480);
		System.out.println(p1.comer(c1));		
		
		DesafioComida c2 = new DesafioComida("Carne", 0.250);
		System.out.println(p1.comer(c2));

		
	}
}
