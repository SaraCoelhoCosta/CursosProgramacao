package arraysCollections;

//Esta ligado a classe UsuarioEquals.
public class Equals {
	public static void main(String[] args) {
		
		UsuarioEquals u1 = new UsuarioEquals();
		u1.nome = "Sara";
		u1.email = "saracoelhocosta2000@gmail.com";
		
		UsuarioEquals u2 = new UsuarioEquals();
		u2.nome = "Sara";
		u2.email = "saracoelhocosta2000@gmail.com";
		
		//Agem da mesma forma porque não mexeu no equals
		System.out.print("u1 == u2? ");
		System.out.println(u1 == u2);
		System.out.println("u1.equals(u2)? " + u1.equals(u2));
	}
}
