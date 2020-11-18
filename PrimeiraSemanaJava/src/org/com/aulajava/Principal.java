package org.com.aulajava;

import java.util.Scanner;

public class Principal {
	// Verificar se a String tem maior numero de caracter que 10
	// Quando a String tiver letra A pule dois caracter
	//Imprimir caracter a caracter da String
	//Verificar se tem o a

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto = sc.nextLine();
		System.out.println(texto.substring(0, 1));
		
		for (int i = 0; i < texto.length(); i++ ) {
			if(i >9) {
				System.out.println("A String é maior que 10 e testo tem " +texto.length()+ " Caracter");
				}
			i++;
			System.out.println(texto.substring(i, (i+1)));
			
			//Verificar
			String textob = "Marcos, Antoni, Chavier, Andre";
			
			String[] nomes = textob.split(",");
			textob.split("");
			for (String num : nomes) {
				System.out.println(num);
			}
			
			for(int num = 0; num< texto.length(); num++) {
				if(texto.substring(num, (num + 1)).toLowerCase().equals("a") && (i + 2) < textob.length()) {
					i = i + 2;
				}
			}
			
			// contains... verifica se a String contem o caracter informado
			
			int controleAchouA = 0;
			for(String a: texto.split("")) {
				if(controleAchouA == 0) {
					System.out.println(a);
				}else {
					controleAchouA--;
				}
				if(a.toLowerCase().contains("a")) {
					controleAchouA = 2;
				}
			}
			
			// Usando continue
			for(String a: texto.split("")) {
				if(a.toLowerCase().contains("b")) {
					System.out.print("Encontrei um b");
					continue;
				}
				System.out.println("Não encontrei o b");
			}
			
			// Usando break
			for(String a: texto.split("")) {
				if(a.toLowerCase().contains("b")) {
					System.out.print("Encontrei um b");
					break;
				}
				System.out.println("Não encontrei um b");
			}
			
		}

	}

}
