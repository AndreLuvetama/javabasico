package segunda.semana;

import java.util.Scanner;

public class LivroMenu {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);
		Integer tamanhoArray = Leitor.mensagem("Informe o numero de livro a ser cadastrado", tc, 0);	
		Livro[] lv = new Livro[tamanhoArray];
		String[] nomes = new String[tamanhoArray];
		String[] editora = new String[tamanhoArray];
		int[] anoPublicao = new int[tamanhoArray];
		String[] classificacao = new String[tamanhoArray];
		
		
		Integer opcao = 0;
	   menu(opcao, new Livro[tamanhoArray], tc);
		    			
	}
	
	public static void menu(Integer opcao, Livro[] lv, Scanner tc ) {
		Integer numerRg = 0;
		do {
			opcao = Leitor.mensagem("Informe a opção que deseja acessar\n"
					+ "1-Cadastrar Livro\n2-Listar Livro\n3-Editar Livro\n4-Apresentar Livro por ID Livro\n5-Deletar Livro\n0-Sair do sistema", tc, 0);
		switch (opcao) {
			case 0:
				System.out.println("Saindo..");
				  System.exit(0);
			
			break;
			case 1:
				numerRg = Leitor.mensagem("Qual é o numero registro que deseja inserir", tc, numerRg);
				lv[numerRg-1] = controleLivros.cadastrarLivro(lv[numerRg-1], tc);
				    
			break;
			case 2:
					controleLivros.imprimirLivros(lv);						
			break;
			case 3:
				numerRg = Leitor.mensagem("Informe o numero do livro a ser alterado\n", tc, numerRg);
				int campoCadastro = Leitor.mensagem("Qual campo deseja alterar?\n1-Livro\n2-Editor\n3- Ano de Publicação\n4-Classificação do Livro\n5- Autor", tc, 0 );
				controleLivros.editarLivro(lv[numerRg-1], tc, campoCadastro);
		    break;
			case 4:
				numerRg = Leitor.mensagem("Qual é o registro que deseja imprimir", tc, numerRg);
				controleLivros.imprimirLivro(lv[numerRg-1]);
					
			break;
			case 5:
				numerRg = Leitor.mensagem("Qual é o registro que deseja deletar?\n", tc, numerRg);
				lv[numerRg-1] = controleLivros.deletarLivro(lv[numerRg-1]);				
			break;
			
			default:
				System.out.println("Opção invalida! Tentar com 1 a 5");
				break;
		   }
		}while(opcao != 0);
	}

	
	
	

}
