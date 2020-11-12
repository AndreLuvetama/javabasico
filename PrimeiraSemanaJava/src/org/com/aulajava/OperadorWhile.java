package org.com.aulajava;


import java.util.Scanner;

public class OperadorWhile {
//Criar uma estrutura com While que imprimi os dados enquanto o valor for diferente de c for C
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome =" ";
		
		Scanner  teclado = new Scanner(System.in);
		Scanner  teclado2 = new Scanner(System.in);
		
		while(!nome.equals("c") ) {
			System.out.print("Digite o nome\n");
			 nome = teclado.nextLine();
			System.out.print("Digite a Idade\n");
			int idade = teclado2.nextInt();
			System.out.print("Digite peso\n");
			float peso = teclado2.nextFloat();
			
		}
		
		//resolver e enviar no gith

	}

}
