package segunda.semana;

public class Pessoa {
	
	private String nome;
	private Float peso;
	private Character sexo;
	
	//Metodo construtor, executa ao criar uma instancia da Classe
	public Pessoa() {}
	


	public Pessoa(String nome, Float peso, Character sexo) {
		
		this.nome = nome;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome( String nome) {
		this.nome = nome;
		
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
		
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", peso=" + peso + ", sexo=" + sexo + ", getNome()=" + getNome()
				+ ", getPeso()=" + getPeso() + ", getSexo()=" + getSexo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
