package segunda.semana;

public class Gato extends Animal{
	private Boolean possuiCaixaAreia;

		

	
	public Boolean getPossuiCaixaAreia() {
		return possuiCaixaAreia;
	}

	public void setPossuiCaixaAreiaa(Boolean possuiCaixaAreia) {
		this.possuiCaixaAreia = possuiCaixaAreia;
	}

	@Override
	public void dizerOla() {
		System.out.println("Olá sou Gato");
	}
	
}
