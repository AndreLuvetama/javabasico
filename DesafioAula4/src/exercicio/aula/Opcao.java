package exercicio.aula;

import java.util.Scanner;

public class Opcao{
	static Scanner teclado = new Scanner(System.in);
	
	public static void selecionarOpcao1() {	
		String animal = "";
		
	if(animal.equals("Gato")) {
		System.out.println("Quel legal, o meu também");	
		
	}else {
		while(!animal.equals("Gato")){	
			System.out.println("Qual o nome do seu animal preferido");	
			animal = teclado.nextLine();
				
		}
	}
	
				
}
	public static void selecionarOpcao2() {		
		System.out.println("Qual a idade do seu filho");
		 int idade = teclado.nextInt();
					
			if(idade > 0 && idade < 12) {
				System.out.println("Ele ainda é uma criança");
			}else if(idade > 11 && idade < 19) {
				System.out.println("Adolescência é fogo");
			}else if(idade > 18) {
				System.out.println("Ele já é um adulto!”");
				
			}
		
	}
	public static void selecionarOpcao3() {	
		System.out.println("Em construção..");
		
	}
	
}
