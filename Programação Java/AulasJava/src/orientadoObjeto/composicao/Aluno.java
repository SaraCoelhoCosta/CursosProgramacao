package orientadoObjeto.composicao;

import java.util.ArrayList;
import java.util.List;

//Relacionamento n pra m.
public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {
		return nome;
	}
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}
