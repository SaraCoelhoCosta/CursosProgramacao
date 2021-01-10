package tratamentoErro;

//Copia do pacote stream. Usado nas classes Basico e Validar (pacote personalizadaA e personalizadaB).
public class Aluno {

	//Atributos estao publico para serem utilizados dentro do pacote personalizado A.
	public final String nome;
	public final double nota;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String toString() {
		return nome + " tem nota " + nota + "!";
	}

	//Para a classe Outros (pacote stream).
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}
	
}
