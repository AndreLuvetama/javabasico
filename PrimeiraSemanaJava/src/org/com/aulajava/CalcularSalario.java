package org.com.aulajava;

public class CalcularSalario {
	// Informe 2 valores do tipo float
	// 1 Valor é do salario base
	// 2 Valor é do total de vendas
	// Valor do salário + comissão que representa 10% do valor de vendas;
	
	public static void main(String[] args) {
		float salarioBase = 902.67f;
		float totalVendas = 29.7f;
		
		float total = salarioBase + (totalVendas * 10)/100;
		
		System.out.print(total);
		
		
	}

}
