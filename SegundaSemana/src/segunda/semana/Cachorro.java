package segunda.semana;

public class Cachorro extends Animal {
	private Boolean possuiCama;

	public Boolean getpossuiCama() {
		return possuiCama;
	}

	public void setCama(Boolean possuiCama) {
		this.possuiCama = possuiCama;
	}
	@Override
	public void dizerOla() {
		System.out.println("Olá sou Cachorro");
	}
	
}
