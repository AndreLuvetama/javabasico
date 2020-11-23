package segunda.semana;

import java.util.Scanner;

public class controleLivros {
	
	public static void imprimirLivros(Livro[] livros) {
		for(Livro lv : livros) {
			Boolean verificaSeTemValor = false;
			if(lv != null) {
				verificaSeTemValor = true;
				System.out.printf("Nome: %s\nEditora: %s\nAutor %s\nAno de Publicação %d\nClassificação %s\n", lv.getNome(), lv.getEditora(), lv.getAutor(),
						lv.getAnoPublicao(), lv.getClassificacao());
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
			if(!verificaSeTemValor) {
				System.out.println("Livro não encontrado!!");
			}
		}
	}
	
	public static Livro cadastrarLivro(Livro lv, Scanner tc) {
		if (lv == null) {
			lv = new Livro();
		lv.setNome(Leitor.mensagem("Informe o Livro", tc));
		lv.setEditora(Leitor.mensagem("Informe a Editora", tc));
		lv.setAnoPublicao(Leitor.mensagem("Informe o ano de publicação", tc, lv.getAnoPublicao()));
		lv.setClassificacao(Leitor.mensagem("Informe a classificação do livro", tc));
		lv.setAutor(Leitor.mensagem("Informe o Autor do livro", tc));
		}
		else {
			  System.out.println("Já existe um registro com esse numero");
			}
		
		return lv;
	}

	
	public static Livro editarLivro(Livro lv, Scanner tc, int campoCadastro) {
		if (lv == null) {
			lv = new Livro();
		}
		if (campoCadastro==1 ) {
			lv.setNome(Leitor.mensagem("Informe o Livro", tc));
			System.out.println("Livro cadastrado com sucesso");
		}else if (campoCadastro == 2 ) {
			lv.setEditora(Leitor.mensagem("Informe a Editora", tc));
			System.out.println("Editora cadastrado com sucesso");
		}else if(campoCadastro==3 ) {
			lv.setAnoPublicao(Leitor.mensagem("Informe o ano de publicação", tc, lv.getAnoPublicao()));
			System.out.println("Ano de publicação cadastrado com sucesso");
		} else if(campoCadastro==4) {
			lv.setClassificacao(Leitor.mensagem("Informe a classificação do livro", tc));
			System.out.println("classificação cadastrado com sucesso");
		} else if(campoCadastro==5) {
			lv.setAutor(Leitor.mensagem("Informe Autor", tc));
			System.out.println("Autor cadastrado com sucesso");
		}
				
		
		return lv;
		
	}
	
	public static void imprimirLivro(Livro lvCadastrado) {
		if(lvCadastrado != null) {
			System.out.printf("Nome: %s\nEditora: %s\nAutor %s\nAno de Publicação %d\nClassificação %s\n", lvCadastrado.getNome(), lvCadastrado.getEditora(), lvCadastrado.getAutor(),
					lvCadastrado.getAnoPublicao(), lvCadastrado.getClassificacao());
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		}else {
			System.out.println("Livro não encontrado!!");
		}
	}
	
	
	public static Livro deletarLivro(Livro lv) {
		return null;
	}
	
	

}
