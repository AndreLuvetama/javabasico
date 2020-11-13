package org.com.aulajava;

import java.util.Scanner;

import org.com.aulajava.MetodoSoma.Soma;

public class Menu {
	 static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		Opcoes op = new Opcoes();
		String animal = "";
		
		
		System.out.println("Escolha um número de 1 a 3!");
		int opcao = teclado.nextInt();
		switch(opcao) {
		
		case 1:
			op.selecionarOpcao1(animal);				
		break;
		
		case 2:
			   op.selecionarOpcao2();
		break;
		
		case 3:
			op.selecionarOpcao3();
		break;
		default:
			System.out.println("Opção errada");
		}
		

	}
	
	
	
	
	
	public static class Opcoes{
		
		public static void selecionarOpcao1(String animal) {	
			System.out.println("Qual o nome do seu animal preferido");	
			animal = teclado.nextLine();
			while(animal.equals("Gato")){
				if(animal == "Gato" || animal == "gato") {
					System.out.println("Quel legal, o meu também");				
					
				}else {
					System.out.println("Eu prefiro Gato");
				}
			}
			
			
	}
		public static void selecionarOpcao2() {		
			System.out.println("Qual a idade do seu filho");
			int idade =0;
						
				if(idade > 0 && idade < 12) {
					System.out.println("Ele ainda é uma criança");
				}else if(idade > 11 && idade < 19) {
					System.out.println("Adolescência é fogo");
				}else if(idade > 18) {
					System.out.println("Ele já é um adulto!”. Dica");
					
				}
			
			
		}
		public static void selecionarOpcao3() {	
			System.out.println("Em construção..");
			
		}
		
	}

	

}
