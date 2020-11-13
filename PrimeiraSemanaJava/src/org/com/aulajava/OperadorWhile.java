<<<<<<< HEAD
package org.com.aulajava;


import java.util.Scanner;

public class OperadorWhile {
//Criar uma estrutura com While que imprimi os dados enquanto o valor for diferente de c for C
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String controle =" ";
		
		Scanner  teclado = new Scanner(System.in);
		Scanner  teclado2 = new Scanner(System.in);
		
		while(!controle.equals("c") ) {
			System.out.println("Digite o nome");
			 controle = teclado.nextLine();
			System.out.println("Digite a Idade");
			int idade = teclado2.nextInt();
			System.out.println("Digite peso");
			float peso = teclado2.nextFloat();
			System.out.printf("\nMeu nome é %s \nMinha  idade é %d  \nMeu peso é %.2f \n", controle, idade, peso); 
			
		}
		
		//resolver e enviar no gith

	}

}
=======
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
>>>>>>> c9ff566dc62ea4cfadfb8b62d64af19354e3bea4
