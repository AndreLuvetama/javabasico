package sabado.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ContadorAnimalApp {

	//Ler animais e ao fechar imprimir quantos são cachorros, galinhas, gatos
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<ContadorAnimal> arrayListAnimais = new ArrayList<>();		
		ContadorAnimal contadorAnimal = new ContadorAnimal();
		int menu = 0;
		
		int exibirMenu;
		
		do {
			
			switch(menu) {
			
			case 1:
				
			break;
			case 2:
				break;
			case 3:
				break;
		default:
			System.out.println("Opção invalida");
			}
			
		}while(menu != 0);
	
		
	   
		
		
		

	}
	private static void exibirMenu() {
		System.out.println("=================== Menu ===============");
		System.out.println("1 - CADASTRAR GATO");
		System.out.println("2 - CADASTRAR CACHORRO");
		System.out.println("3 - CADASTRAR GALINHA");
		
		System.out.println("7 - SAIR");			
	}


}
