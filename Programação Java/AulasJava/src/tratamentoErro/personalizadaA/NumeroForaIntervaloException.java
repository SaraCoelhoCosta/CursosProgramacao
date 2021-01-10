package tratamentoErro.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	 public String getMessage() {
		 
		 return String.format("O atributo '%s' esta fora do intervalo.", 
				 nomeDoAtributo);
	 }
}

