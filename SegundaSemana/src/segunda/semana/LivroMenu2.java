package segunda.semana;

import java.util.Scanner;

public class LivroMenu2 {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);
		Integer tamanhoArray = mensagem("Informe o numero de livro a ser cadastrado", tc, 0);	
		Livro[] lv = new Livro[tamanhoArray];
		String[] nomes = new String[tamanhoArray];
		String[] editora = new String[tamanhoArray];
		int[] anoPublicao = new int[tamanhoArray];
		String[] classificacao = new String[tamanhoArray];
		
		
		int menu = 0;
		int numerRg = 0;
		    
		
		do {
			menu = mensagem("Informe a opção que deseja acessar\n"
					+ "1-Cadastrar Livro\n2-Listar Livro\n3-Editar Livro\n4-Apresentar Livro por ID Livro\n5-Deletar Livro\n0-Sair do sistema", tc, 0);
		switch (menu) {
			case 0:
				System.out.println("Saindo..");
				  System.exit(0);
			
			break;
			case 1:
				     for(int i = 0; i< tamanhoArray; i++) {
				    	 System.out.printf("Livro numero %d\n ", (i +1 ));
				    	lv[i] = cadastrarLivro(lv[i], tc);
				    	System.out.println("Livro cadastrado com seucesso!!!\n ");
				    }
			break;
			case 2:
					for(int i = 0; i< tamanhoArray; i++) {
						Livro lvCadastrado =  lv[i];
						if (lvCadastrado != null && tamanhoArray > 0 && lv !=null) {
							System.out.println("Livros cadastrados ");
							System.out.printf("Nome: %s\nEditora: %s\nAutor %s\nAno de Publicação %d\nClassificação %s\n", lvCadastrado.getNome(), lvCadastrado.getEditora(), lvCadastrado.getAutor(),
									lvCadastrado.getAnoPublicao(), lvCadastrado.getClassificacao());
							System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						}else {
							System.out.println("Biblioteca vazia, por favor cadastrar novos Livros!!");
						}
						
					}
				
			break;
			case 3:
				numerRg = mensagem("Informe o numero do livro a ser alterado\n", tc, numerRg);
				int campoCadastro = mensagem("Qual campo deseja alterar?\n1-Livro\n2-Editor\n3- Ano de Publicação\n4-Classificação do Livro\n5- Autor", tc, 0 );
				cadastrarLivro(lv[numerRg-1], tc, campoCadastro);
		    break;
			case 4:
				    System.out.println("Visualizar Livro por codigo");
					numerRg = mensagem("Informe o numero do livro\n", tc, numerRg);
					for(int i =0; i< tamanhoArray; i++) {
						Livro lvCadastrado =  lv[i];
						if(lvCadastrado == lv[numerRg-1]) {
							System.out.printf("Nome: %s\nEditora: %s\nAutor %s\nAno de Publicação %d\nClassificação %s\n", lvCadastrado.getNome(), lvCadastrado.getEditora(), lvCadastrado.getAutor(),
									lvCadastrado.getAnoPublicao(), lvCadastrado.getClassificacao());
							System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						}else {
							System.out.println("Livro não encontrado!!");
						}
					}
					
			break;
			case 5:
				numerRg = mensagem("Tem certeza que pretende zerar a Biblioteca?\n"
						+ "1-SIM\n"
						+ "2-Não", tc, numerRg);
				
				if(numerRg==1) {
				
					lv = null;
					
				}
				
			break;
			
			default:
				System.out.println("Opção invalida! Tentar com 1 a 5");
				break;
		   }
		}while(menu != 0);
				
	}

	public static Integer mensagem(String pergunta, Scanner tc, Integer valor) {
		System.out.println(pergunta);
		return tc.nextInt();
	}
	
	public static String mensagem(String pergunta, Scanner tc) {
		System.out.println(pergunta);
		return tc.next();
	}
	
	
	public static Livro cadastrarLivro(Livro lv, Scanner tc) {
		if (lv == null) {
			lv = new Livro();
		}
		
		lv.setNome(mensagem("Informe o Livro", tc));
		lv.setEditora(mensagem("Informe a Editora", tc));
		lv.setAnoPublicao(mensagem("Informe o ano de publicação", tc, lv.getAnoPublicao()));
		lv.setClassificacao(mensagem("Informe a classificação do livro", tc));
		lv.setAutor(mensagem("Informe o Autor do livro", tc));
		
		return lv;
	}

	
	public static Livro cadastrarLivro(Livro lv, Scanner tc, int campoCadastro) {
		if (lv == null) {
			lv = new Livro();
		}
		if (campoCadastro==1 ) {
			lv.setNome(mensagem("Informe o Livro", tc));
		}else if (campoCadastro == 2 ) {
			lv.setEditora(mensagem("Informe a Editora", tc));
		}else if(campoCadastro==3 ) {
			lv.setAnoPublicao(mensagem("Informe o ano de publicação", tc, lv.getAnoPublicao()));
		} else if(campoCadastro==4) {
			lv.setClassificacao(mensagem("Informe a classificação do livro", tc));
		} else if(campoCadastro==5) {
			lv.setAutor(mensagem("Informe Autor", tc));
		}
				
		
		return lv;
		
	}

}
