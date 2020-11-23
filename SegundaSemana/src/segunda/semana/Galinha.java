package segunda.semana;

public class Galinha extends Animal {
	//possui altura do poleiro
	private Boolean alturaPoleiro;
	public Galinha() {
		super();
	}
		
	public Galinha(String nome, Integer idade, Integer tamanho, Float peso, Boolean alturaPoleiro) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.tamanho = tamanho;
		this.peso = peso;
	}

	public Boolean getAlturaPoleiro() {
		return alturaPoleiro;
	}

	public void setAlturaPoleiro(Boolean alturaPoleiro) {
		this.alturaPoleiro = alturaPoleiro;
	}
	@Override
	public void dizerOla() {
		System.out.println("Olá sou Galinha");
	}

}
