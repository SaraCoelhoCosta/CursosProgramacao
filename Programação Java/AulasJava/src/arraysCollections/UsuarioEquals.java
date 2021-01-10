package arraysCollections;

//Esta ligado a classe Equals.
public class UsuarioEquals {

	String nome;
	String email;

	// Object é generico, ele e a classe mae.
	public boolean equals(Object objeto) {

		// Forma 1. Pode usar == ao inves do equals mas nao e aconselhado.
		UsuarioEquals outro = (UsuarioEquals) objeto;
		boolean outroNome = outro.nome.equals(this.nome);
		boolean outroEmail = outro.email.equals(this.email);
		return outroNome && outroEmail;

		/*
		 * Forma 2. Verifica se o objeto e uma instancia da classe Usuario. if(objeto
		 * instanceof Usuario) { //Cast. Usuario outro = (Usuario) objeto; boolean
		 * outroNome = outro.nome.equals(this.nome); boolean outroEmail =
		 * outro.email.equals(this.email); return outroNome && outroEmail; } else {
		 * return false; }
		 */
	}

	// Ver hashcode depois.

}
