package orientadoObjeto.abstrato;

public abstract class Mamifero extends Animal{

	/* Quando o metodo nao e passado para o filho as o neto precisa herdar (ou alguem que participe da mesma heranca), ou seja, 
	 * a classe concreta precisa herdar os metodos abstratos.
	 * 
	 * @Override
		public String mover() {
			return "Usando as patas";
		}
	*/
	public abstract String mamar();
}
