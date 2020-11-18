package segunda.semana;



import java.util.Scanner;


/**
 * @author marcu
 *
 */
public class Principal2 {

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Crie 3 arrays com 6 posicoes
		// primeiro array com nomes (String)
		// segundo array com peso (float)
		// terceiro array com sexo (char) // F,M
		// Definir o tamanho dos array com base em uma entrada
		// Crie um menu usando o switch com as opções do tipo (1 a 3):
		// apresentarTodosOsValoresDoArray,
		// alterarTodoOArray, alterarArrayPorPosicao
		// utilize o while para parar o programa somente quando informar o valor 0
		Scanner sc = new Scanner(System.in);
		int tamanho = lerValor("Qual o tamanho do array ?", sc, 0);
		Pessoa[] pessoas = new Pessoa[tamanho]; // Array pessoa
		String[] nomes = new String[tamanho];
		float[] pesos = new float[tamanho];
		char[] sexos = new char[tamanho];
		int opcao = 0;
		int nrRegistro = 0;
		//String sexo;
		do {
			opcao = lerValor("Informe a opção que deseja acessar:", sc, opcao);
			switch (opcao) {
			case 0:
				System.out.println("Saindo..");
				break;
			case 1:
				for (int i = 0; i < tamanho; i++) {
					Pessoa pConsulta = pessoas[i];
					if(pConsulta != null) {
						System.out.printf("Nome: %s \nPeso: %.2f\nSexo: %s\n", pConsulta.getNome(), pConsulta.getPeso(), pConsulta.getSexo());
					}
					
						}
				break;
			case 2:
				for (int i = 0; i < tamanho; i++) {
					System.out.printf("Registro numero %d \n", (i + 1));
					pessoas[i] = adicionarValorPessoa(pessoas[i], sc);
					System.out.println("-----------------------");
						}
									
				break;
			case 3:
				nrRegistro = lerValor("Informe o nº do registro para alteração:", sc, nrRegistro);
				pessoas[nrRegistro-1] = adicionarValorPessoa(pessoas[nrRegistro-1], sc);
				break;
			case 4:
				// Crie a opção 4 tenha uma seleção de qual informação o usuário deseja alterar.
				nrRegistro = lerValor("Informe o nº do registro para alteração:", sc, nrRegistro);
				int campoAlterando = lerValor("Qual a opção que deseja alterar ? \n1-Nome;\n2-Peso;\n3-Sexo;", sc, 0);
				adicionarValorPessoa(pessoas[nrRegistro-1], sc, campoAlterando);
				break;
			case 5:
				// Imprimir valores por registro
				nrRegistro = lerValor("Informe o nº do registro para alteração:", sc, 0);
				Pessoa pConsulta2 = pessoas[nrRegistro - 1];
				if(pConsulta2 != null) {
					System.out.printf("Nome: %s \nPeso: %.2f\nSexo: %s\n",pConsulta2.getNome(), pConsulta2.getPeso(), pConsulta2.getSexo());
					
				}
				
				break;
			default:
				System.out.println("Opção invalida!");
				break;
			}
		} while (opcao != 0);

	}
private static Pessoa adicionarValorPessoa(Pessoa p, Scanner sc) {
	if(p ==null) {
		p = new Pessoa();
	}
	p.setNome(lerValor("Informe o nome: ", sc));
	p.setPeso(lerValor("Informe o peso: ", sc, p.getPeso()));
	p.setSexo(lerValor("Informe o sexo (F/M): ", sc, p.getSexo()));
	return p;
}


	private static Pessoa adicionarValorPessoa(Pessoa p, Scanner sc, int campoAlterando) {
		if(p ==null) {
			p = new Pessoa();
		}
		if (campoAlterando == 1) {
			p.setNome(lerValor("Informe o nome: ", sc));
		}else if (campoAlterando == 2){
			p.setPeso(lerValor("Informe o peso: ", sc, p.getPeso()));			
		} else if(campoAlterando == 3){
			p.setSexo(lerValor("Informe o sexo (F/M): ", sc, p.getSexo()));
			
		}
		return p;
		
	}
	public static String lerValor(String pergunta, Scanner sc) {
		System.out.println(pergunta);
		return sc.next();
	}

	public static Float lerValor(String pergunta, Scanner sc, Float valor) {
		System.out.println(pergunta);
		return sc.nextFloat();
	}

	public static Integer lerValor(String pergunta, Scanner sc, Integer valor) {
		System.out.println(pergunta);
		return sc.nextInt();
	}

	public static Character lerValor(String pergunta, Scanner sc, Character valor) {
		System.out.println(pergunta);
		String retorno = sc.next();
		return retorno.charAt(0);
	}

	
		// Criem mais uma sobrecarga do método adicionarValorArray para o opção 4

}