package orientadoObjeto.abstrato;

public class AbstratoMain {

	public static void main(String[] args) {
		// Herda respirar e mover: Animal a = new Cachorro();
		// Herda mamar.
		Mamifero a = new Cachorro();
		System.out.println("Como o cachorro se move? " + a.mover());
		System.out.println("Como o cachorro mama? " + a.mamar());
		System.out.println("Como o cachorro respira? " + a.respirar());
	}

}
