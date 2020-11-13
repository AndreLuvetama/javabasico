package exercicio.aula;

import java.util.Scanner;

public class Menu {
	 static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Opcao op = new Opcao();
		Impressora imp = new Impressora();
		
		String animal = "";
		int idade = 0;
		int parametro =0;
		
		imp.imprimaValor(parametro);
	
		parametro = teclado.nextInt();
		switch(parametro) {
		
		case 1:
			op.selecionarOpcao1(animal);				
		break;
		
		case 2:
			   op.selecionarOpcao2(idade);
		break;
		
		case 3:
			op.selecionarOpcao3();
		break;
		default:
			System.out.println("Opção errada");
		}
		

	}
	


}