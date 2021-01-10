package orientadoObjeto.encapsulamento;

//Getters-Setters
public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;

	// Construtor.
	public Pessoa(String nome, String sobrenome, int idade) {
		setSobrenome(sobrenome);
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	// Metodo get: lerIdade. Getter. 
	public int getIdade() {
		return idade;
	}

	// Metodo set: alterarIdade. Setter.
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	@Override
	public String toString() {
		return "Ola, eu sou " + getNomeCompleto() + " e tenho " + getIdade() + " anos.";
	}
}
