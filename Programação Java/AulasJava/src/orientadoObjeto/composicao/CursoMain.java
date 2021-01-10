package orientadoObjeto.composicao;

//Relacionamento n pra m.
public class CursoMain {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");

		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);

		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		System.out.println("Matriculados do curso de " + curso1.nome);
		for (Aluno a : curso1.alunos) {
			System.out.println("Nome: " + a.nome);
		}

		System.out.println("\nMatriculados do curso de " + curso2.nome);
		for (Aluno a : curso2.alunos) {
			System.out.println("Nome: " + a.nome);
		}

		System.out.println("\nMatriculados do curso de " + curso3.nome);
		for (Aluno a : curso3.alunos) {
			System.out.println("Nome: " + a.nome);
		}

		System.out.println("\n" + aluno3.nome + " esta matriculado nos curso de:");
		for (Curso a : aluno3.cursos) {
			System.out.println(a.nome);
		}

		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		if (cursoEncontrado != null) {
			System.out.println("\n" + cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
