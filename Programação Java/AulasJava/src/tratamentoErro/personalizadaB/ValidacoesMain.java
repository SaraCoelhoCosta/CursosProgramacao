package tratamentoErro.personalizadaB;

import tratamentoErro.Aluno;

public class ValidacoesMain {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);			
			
		} 
		/*Tratando especificamente nao vai tratar 'nota'.
		 * O catch() pode ser usado mais de uma vez ou criar uma condicao no
		 * mesmo catch().
		 */
		catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}
		catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
		
	}
}
