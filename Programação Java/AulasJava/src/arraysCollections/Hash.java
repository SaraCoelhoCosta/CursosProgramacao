package arraysCollections;

import java.util.HashSet;

//Usa classe UsuarioLista.
public class Hash {

	public static void main(String[] args) {
		
		HashSet<UsuarioLista> user = new HashSet<UsuarioLista>();
		user.add(new UsuarioLista("Ana"));
		user.add(new UsuarioLista("Paulo"));
		user.add(new UsuarioLista("Joao"));
		
		boolean resultado = user.contains(new UsuarioLista("Joao"));
		System.out.println("Joao existe? " + resultado);
	}
}
