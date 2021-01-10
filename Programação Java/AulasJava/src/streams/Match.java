package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Usa classe Aluno.
public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 7.2);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println("Todos os alunos foram aprovados? " + alunos.stream().allMatch(aprovado));
		System.out.println("Algum aluno foi aprovado? " + alunos.stream().anyMatch(aprovado));
		System.out.println("Nenhum aluno foi reprovado? " + alunos.stream().noneMatch(reprovado/*aprovado.negate()*/));
	}
}
