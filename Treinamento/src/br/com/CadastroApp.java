package br.com;

import java.util.Scanner;

import br.com.cadastro.dao.CadastroDAO;
import br.com.cadastro.util.Leitor;


public class CadastroApp {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		menuPrincipal(teclado);
	

	}
	
	
	public static void menuPrincipal(Scanner teclado) {
		CadastroDAO dao = new CadastroDAO();
		Integer menu = 0;
		do {
			menu = Leitor.lerValor("Informe a opção desejada\n1- Login\n2-Novo Cadastro\n3-Deletar Cadastro\n4-Editar Cadastro"
					+ "\n5-Pesquisar Nome\n4-Listar Cadastro\n0-Sair da aplicação", teclado, menu);
			
			switch(menu) {
					case 1: 
						 	login(teclado, dao);
					break;
					
					case 2: 
						 System.out.println("Novo Cadastro");
					break;
					
					case 3: 
						 System.out.println("Deletar Cadastro");
					break;
					
					case 4: 
						   System.out.println("Editar Cadastro");
					break;
					case 5: 
						   System.out.println("Buscar Cadastro");
					break;
					case 6: 
						   System.out.println("Listar Cadastro");
					break;
					case 0: 
						   System.out.println("Sair...");
					break;
			}
			
		}while(menu !=0);
		
	}
	
	public static Integer login(Scanner teclado, CadastroDAO dao) {
		Integer testarLogin = 0;
		Boolean tentarNovamente = false;
		do {
			tentarNovamente = false;
			String usuario = Leitor.lerValor("Informe a Usuario: ", teclado);
			String senha = Leitor.lerValor("Informe a Senha: ", teclado);
			if(dao.verificarSenhaUsuario(usuario, senha)) {
				System.out.println("Login realizado com sucesso!");
			}else {
				System.out.println("Seu usuário ou senha estão incorretos");
				tentarNovamente = Leitor.lerValor("Gostaria de tentar novamente - Sim/Nao :", teclado, tentarNovamente);
				
			}
		}while(testarLogin ==0 ||tentarNovamente );
		return testarLogin;
	}
	
	

	
	
	
	
	public static void novoCadastro() {
		System.out.println("Cadastrar novo Cliente\nTela em construção");
		System.out.println("=====================\n");
		
	}
	
    public static void editarCadastro() {
    	System.out.println("Editar Cadastro\nTela em construção");
    	System.out.println("=====================\n");
	}
    public static void deletarCadastro() {
    	System.out.println("Deletar Cadastro\nTela em construção");
    	System.out.println("=====================\n");
	}
    
     public static void buscarCadastroNome() {
    	 System.out.println("Pesquisar Cadastro\nTela em construção");
    	 System.out.println("=====================\n");
	}
     public static void ListarrCadastroNome() {
    	 System.out.println("Listar Cadastro\nTela em construção");
    	 System.out.println("=====================\n");
 	}
	

}
