package org.com.aulajava;

public class CalcularSalario {
	// Informe 2 valores do tipo float
	// 1 Valor � do salario base
	// 2 Valor � do total de vendas
	// Valor do sal�rio + comiss�o que representa 10% do valor de vendas;
	
	public static void main(String[] args) {
		float salarioBase = 902.67f;
		float totalVendas = 29.7f;
		
		float total = salarioBase + (totalVendas * 10)/100;
		
		System.out.print(total);
		
		
	}

}
