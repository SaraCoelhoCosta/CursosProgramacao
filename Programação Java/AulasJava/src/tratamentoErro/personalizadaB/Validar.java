package tratamentoErro.personalizadaB;

import tratamentoErro.Aluno;

public class Validar {

	private Validar() {
		 
	}
	
	//Excecao checada.
	public static void aluno(Aluno aluno) 
			throws StringVaziaException, NumeroForaIntervaloException {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno esta nulo!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
