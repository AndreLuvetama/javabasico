package segunda.semana;

public class ExercicioHeranca1 {

	public static void main(String[] args) {
		Gato g = new Gato();
		Cachorro c = new Cachorro();
		Galinha gal = new Galinha();
		Animal a = new Galinha();
		Animal ca = new Cachorro();
		g.dizerOla();
		c.dizerOla();
		gal.dizerOla();
		a.dizerOla();
		ca.dizerOla();

	}

}
