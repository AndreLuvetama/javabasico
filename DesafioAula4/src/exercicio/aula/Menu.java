package exercicio.aula;

import java.util.Scanner;

public class Menu {
	  static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Opcao op = new Opcao();
		Impressora impressora = new Impressora();
			
		String animal = "";
		int idade = 0;
		
		
		//impressora.imprimaValor("Imprima um número de 1 a 3 ou 0 para sair");	
		System.out.print("Imprima um número de 1 a 3 ou 0 para sair");
		int escolha = teclado.nextInt();
		
	 while(escolha !=0) {
			switch(escolha) {			
			case 1:
				Opcao.selecionarOpcao1();				
			break;
			
			case 2:
				idade = Opcao.selecionarOpcao2();
			break;
			
			case 3:
				Opcao.selecionarOpcao3(idade);
			break;
			
			default:
				Impressora.imprimaValor("Opção errada");
			}
			escolha = escolhaOpcaoScanner(teclado);
			//Impressora.imprimaValor("Imprima um número de 1 a 3 ou 0 para sair");	
	   }
	 Impressora.imprimaValor("Volte sempre\n");	
	}
		
	public static int escolhaOpcaoScanner(Scanner sc) {
		Impressora.imprimaValor("Imprima um número de 1 a 3 ou 0 para sair");	
		return teclado.nextInt();
	}
	


}