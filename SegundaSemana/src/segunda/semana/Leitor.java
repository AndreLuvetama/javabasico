package segunda.semana;

import java.util.Scanner;

public class Leitor {
	
	public static Integer mensagem(String pergunta, Scanner tc, Integer valor) {
		System.out.println(pergunta);
		return tc.nextInt();
	}
	
	public static String mensagem(String pergunta, Scanner tc) {
		System.out.println(pergunta);
		return tc.next();
	}

}
