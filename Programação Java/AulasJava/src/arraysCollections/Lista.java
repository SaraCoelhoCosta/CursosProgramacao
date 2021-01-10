package arraysCollections;

import java.util.ArrayList;

//Ligado a UsuarioLista.
public class Lista {
	
	public static void main(String []args) {
		
		ArrayList<UsuarioLista> lista = new ArrayList<>();
		
		UsuarioLista u1 = new UsuarioLista("Sara");
		lista.add(u1);
		//ou
		lista.add(new UsuarioLista("Ana"));
		lista.add(new UsuarioLista("Lia"));
		lista.add(new UsuarioLista("Manu"));
		lista.add(new UsuarioLista("Carlos"));
		lista.add(new UsuarioLista("Lucas"));
		lista.add(new UsuarioLista("Mateus"));
		lista.add(new UsuarioLista("Wesley"));
		
		System.out.print("Removeu u1? " + lista.remove(u1));
		System.out.print("\nu1 esta na lista? " +	lista.contains(u1));
		
		//Chama toString implicitamente.
		System.out.println("\n\nLista de usuarios do sistema:");
		for (UsuarioLista u : lista) {
			System.out.println(u);
		}
		
		System.out.println("\nUsuario no indice 3: " + lista.get(3));
		
		/* Notacao ponto. Sem toString.
		 * System.out.println(u.nome);
		 * System.out.println("Usuario no indice 3: " + lista.get(3).nome);
		 */
		
	}
	
}
