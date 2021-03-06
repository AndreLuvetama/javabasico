package segunda.semana;

public class Pessoa extends ClassePadrao {
	
	//private String nome;
	private Float peso;
	private Character sexo;
	
	//Metodo construtor, executa ao criar uma instancia da Classe
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, Float peso, Character sexo) {
		super();
		//this.setNome(nome);
		this.nome = nome;
		this.peso = peso;
		this.sexo = sexo;
	}
	@Override
	public String getNome() {
		return "Pessoa: " + this.nome;
	}
	/*
	public void setNome( String nome) {
		this.nome = nome;
	}*/

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
	
}
