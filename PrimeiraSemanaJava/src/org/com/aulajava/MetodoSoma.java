package org.com.aulajava;

import java.util.Scanner;

public class MetodoSoma {
	

public static class Soma{

	public static int resultado(int num1, int num2){
		return (num1 + num2);
	}
}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe dois numeros");
		int nun1 = teclado.nextInt();
		int nun2 = teclado.nextInt();
		
		System.out.println(Soma.resultado(nun1,nun2));

	}

}




