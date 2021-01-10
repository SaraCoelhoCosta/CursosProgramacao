package orientadoObjeto.composicao;

import java.util.ArrayList;
import java.util.List;

//Relacionamento n pra m.
public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
