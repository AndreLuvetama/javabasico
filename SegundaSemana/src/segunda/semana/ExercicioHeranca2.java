package segunda.semana;

import java.util.ArrayList;

public class ExercicioHeranca2 {

	public static void main(String[] args) {
		ArrayList<Animal> arrayListnimais = new ArrayList<>();
		arrayListnimais.add(new Cachorro());
		arrayListnimais.add(new Galinha());
		arrayListnimais.add(new Gato());
		arrayListnimais.forEach(data->{
			if(data instanceof Gato) {
				System.out.println("É um gato");
			}
			data.dizerOla();
		});

	}

}
