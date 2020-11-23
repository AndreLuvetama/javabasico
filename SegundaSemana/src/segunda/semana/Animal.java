package segunda.semana;

public class Animal {
	protected String nome;
	protected Integer idade;
	protected Integer tamanho;
	protected Float peso;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	
	public Animal(String nome, Integer idade, Integer tamanho, Float peso) {
		this.nome = nome;
		this.idade = idade;
		this.tamanho = tamanho;
		this.peso = peso;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}


	public void dizerOla() {
		// TODO Auto-generated method stub
		
	}
	
	

}
