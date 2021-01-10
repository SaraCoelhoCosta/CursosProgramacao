package tratamentoErro;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e) {
			//Exibe qual o erro.
			System.out.println(e.getMessage());
		}
		
		//Tratamento try-catch.
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("Fim :) ");
	}
	
	/*Posso nao tratar o erro (Excecao NAO checada ou NAO verificada).
	 * Pode ter "throws RuntimeException" mas nao e necessario.
	 */
	static void geraErro1() {
		//Throw - Lanca uma excecao (lanca apenas o que herda de throwable). 
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	/*Tenho que tratar (Excecao checada ou verificada).
	 * O erro e tratado fora da funcao quando: static void geraErro2() throws Exception{...}.
	 * O erro e tratado dentro da funcao: static void geraErro2(){...}
	*/
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
