package org.com.aulajava;
import java.util.Scanner;

public class DadosEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float numF = sc.nextFloa();
		System.out.println(numF);
		int num1 = sc.nextInt();
		System.out.println(num1);
		byte byte1 = sc.nextByte(byte1);
		long lg1 = sc.nextLong(lg1);
		double num2 = sc.nextDouble();
		System.out.println(num2);
		String nome = sc.nextLine();
		System.out.println(nome);

	}

}
