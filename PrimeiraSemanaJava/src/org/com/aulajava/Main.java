package org.com.aulajava;

public class Main {

	public static void main(String[] args) {
		char ch = 255;
		Calculadora c = new Calculadora(); //instanciando a classe Calculadora
        System.out.println("Multiplicação de valores");
        System.out.println(c.realizarMultiplicacao(20));
        System.out.println("Soma de valores");
        System.out.println(c.realizarSoma(10));
        System.out.println("Valor Estatico");
        System.out.println(Calculadora.valorPadraoSomaInteiro);
        System.out.println("Impressão do Char");
        System.out.println(ch);
	}

}
