package segunda.semana;

public class ExercicioHeranca {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Livro lv = new Livro();
		p.setNome("Pessoa");
		lv.setNome("Livro");
		
		System.out.println(p.getNome());
		System.out.println(lv.getNome());

	}

}
