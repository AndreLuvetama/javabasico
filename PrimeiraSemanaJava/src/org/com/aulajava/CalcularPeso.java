package org.com.aulajava;


import java.util.Scanner;

public class CalcularPeso {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Inform o seu nome");
	String nome = teclado.nextLine();
	System.out.println("Informe o seu Peso");
	float peso = teclado.nextFloat();
	System.out.println("Informe a sua idade");
	int idade = teclado.nextInt();
	
	while(peso<3) {
		peso++;
	}
	 
	
	if((peso>80 && idade > 40) || nome.equals("Andre") ) {
		System.out.println("Você precisa correr mais");
	}else {
		System.out.println("Você precisa comer Carboidrato");
	}
	System.out.println("********************************************************************");
	
	switch(idade) {
	case 80:
		System.out.println("Parabéns pelos seus 80 anos!!!");
	break;
	case 40:
		System.out.println("Parabéns pelos seus 40 anos");
	break;
	
	default:
		System.out.println("Você ainda é jovem");
	break;
	}
	
	}
	
	

}
