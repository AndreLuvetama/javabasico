package org.com.aulajava;

import java.util.Scanner;

public class TreinandoScanner {
	


	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	//verificaIdade(idade, peso, nome);
	
	System.out.print("Digite o nome\n");
	String nome = teclado.nextLine();
	System.out.print("Digite a Idade\n");
	int idade = teclado.nextInt();
	System.out.print("Digite peso\n");
	float peso = teclado.nextFloat();
	
	System.out.printf("O meu nome é %s \n", nome);	
	System.out.printf("A minha idade é %d \n", idade);	
	System.out.printf("O meu peso %2.2f \n", peso);	
	while (peso<3) {
		peso++;
	}
	 
	System.out.println("Você precisa comer Carboidrato");
	}
	public static void verificaIdade(int idade, float peso, String nome) {
		if((peso>80 && idade > 40) || nome.equals("Andre") ) {
			System.out.println("Você precisa correr mais");
		}else {
			System.out.println("Você precisa comer Carboidrato");
		}
		
	}

}
