package org.com.aulajava;

public class Calculadora3 {

	public static void main(String[] args) {
	int valor1 = 1;
	int valor2 = 4;
	String mensagem = "Ocorreu um ajuste no valor da soma já que ";
	boolean eMaior = false;
	int soma = valor1 + valor2;
	
	System.out.println(valor1 > valor2);
	
	if(valor1 > valor2) {
		soma = soma + 2;
		eMaior = true;
	}else if(valor1 < valor2){
		soma = soma - 5;
		
	}
	System.out.println(soma);
	//System.out.println(("" + valor1).concat("+" + valor2).concat("=" + soma));
	
	if(eMaior) {
		System.out.println(("" + valor1).concat("+" + valor2).concat("=" + soma));
	}else {
	
		System.out.println(mensagem.concat("" + valor1).concat(" > " + valor2));
	}

	}

}
