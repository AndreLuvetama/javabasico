package exercicio.aula;

import java.util.Scanner;

public class Opcao{
	static Scanner teclado = new Scanner(System.in);
	
	public static void selecionarOpcao1() {	
		String animal = "";
		
	if(animal.toLowerCase().equals("Gato")) {
		Impressora.imprimaValor("Quel legal, o meu também");		
	}else {
			do {
				Impressora.imprimaValor("Qual o nome do seu animal preferido");
				animal = teclado.nextLine();
			   }while(!animal.equals("Gato"));
		
		/*
		while(!animal.equals("Gato")){
			Impressora.imprimaValor("Qual o nome do seu animal preferido");
			animal = teclado.nextLine();
				
		}*/
	}
	
				
}
	public static  int selecionarOpcao2() {		
		Impressora.imprimaValor("Qual a idade do seu filho");
		 int idade = teclado.nextInt();
					
			if(idade > 0 && idade < 12) {
				Impressora.imprimaValor("Ele ainda é uma criança");				
			}else if(idade > 11 && idade < 19) {
				Impressora.imprimaValor("Adolescência é fogo");
			}else if(idade > 18) {
				Impressora.imprimaValor("Ele já é um adulto!");				
			}
		return idade;
	}
	public static void selecionarOpcao3(int idade) {	
		
		if(idade == 0) {
			Impressora.imprimaValor("É necessário informar a idade na Opção 3\n");
		}else {
			for(int i =0; i<= idade; i++) {
				Impressora.imprimaValor(i + "...");
			}
			Impressora.imprimaValor(idade + "São tanto anos... \n");	
			
		}
		
			
		
	}
	
}
