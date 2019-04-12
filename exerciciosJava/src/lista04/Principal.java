package lista04;

import java.util.ArrayList;

import lista04.Console;

/**
 * Classe para executar os exercícios da lista 004.
 * 
 * @author Rafael Kohler
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Livro livro01 = new Livro();
//		livro01.setCodigo("1598FHK");
//		livro01.setTitulo("Core Java 2");
//
//		ArrayList<String> autoresLivro01 = new ArrayList<>();
//		autoresLivro01.add("Cay S. Horstmann");
//		autoresLivro01.add("Gary Cornell");
//
//		livro01.setAutores(autoresLivro01);
//		livro01.setIsbn("0130819336");
//		livro01.setAno(1999);
//		System.out.println("Livro 01:" + livro01);
//
//		Livro livro02 = new Livro();
//		livro02.setCodigo("9865PLO");
//		livro02.setTitulo("Java, How to Program");
//
//		ArrayList<String> autoresLivro02 = new ArrayList<>();
//		autoresLivro02.add("Harvey Deitel");
//
//		livro02.setAutores(autoresLivro02);
//		livro02.setIsbn("0130341517");
//		livro02.setAno(1999);
//		System.out.println("\nLivro 02: " + livro02);
//
//		/**
//		 * Usando o contrutor para popular um objeto.
//		 */
//		ArrayList<String> autores = new ArrayList<>();
//		autores.add("Kathy Sierra");
//		autores.add("Bert Bates");
//		Livro livro03 = new Livro("9865PLO", "Use a cabeça! Java", autores, "0138426846", 2003);
//
//		System.out.println("\nLivro 03: " + livro03);
//		System.out.println();

		// usando um metodo estatico para criar um livro
//		Livro livro4 = criarLivro();
//		System.out.println("\nLivro 04: " + livro4);
//		System.out.println();

//		ArrayList<Livro> livros = new ArrayList<>();
//		for (int i = 0; i < 5; i++) {
//			livros.add(criarLivro());
//		}

		/**
		 * Exercicio 002 da lista
		 */
		int menu = menu2();
		do {
			selecaoMenu(menu);
			menu = menu2();

		} while (menu > -1);
	}

	/**
	 * Faz a execução da tela com as opções ao usuário e devolve a escolha.
	 * 
	 * @return - Opção selecionada pelo usuário.
	 */
	public static int menu2() {

		String[] opcoes = { "Exercicio 001 - Livro", "Exercicio 002 - Distancia", "Exercicio 003 - Compromisso",
				"Exercicio 004 = Pilha", "Exercicio 005 = Fila", "Exercicio 006" };
		int menu = Console.mostrarMenu(opcoes, "Lista 04:", null);
		return menu;

	}

	/**
	 * Chama as funções de acordo com a seleção do usuário.
	 * 
	 * @param menu - Opção selecionada pelo usuário.
	 */
	public static void selecaoMenu(int menu) {

		switch (menu) {
		case 1:
			System.out.println(criarLivro());
			break;
		case 2:
			executarCenario2();
			break;
		case 3:
			executarCenario3();
			break;
		case 4:
			executarCenario04();
			break;
		case 5:
			executarCenario05();
			break;
		case 6:
			executarCenario06();
			break;
		case 7:
			break;
		}
	}

	/**
	 * Exercicio 001
	 * 
	 * Cria um livro pelo teclado
	 */
	public static Livro criarLivro() {
		Livro livro = new Livro();
		String codigo = Console.recuperaTexto("Informe o codigo: ");
		livro.setCodigo(codigo);
		String titulo = Console.recuperaTexto("Informe o titulo do livro: ");
		livro.setTitulo(titulo);
		ArrayList<String> autores = new ArrayList<>();
		Integer quantidade = Console.recuperaInteiro("Informe quantos autores: ");
		for (int i = 0; i < quantidade; i++) {
			String autor = Console.recuperaTexto("Informe o autor: " + (i + 1));
			autores.add(autor);
		}
		livro.setAutores(autores);
		String isbn = Console.recuperaTexto("Informe o ISBN: ");
		livro.setIsbn(isbn);
		Integer ano = Console.recuperaInteiro("Informe o ano: ");
		livro.setAno(ano);

		return livro;
	}

	/**
	 * Exercicio 002
	 * 
	 * Executa cenario 02
	 */
	public static void executarCenario2() {

		// Ponto na origem, coordenadas(0, 0)
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto(2d, 5d);

		double dp1p2 = ponto1.distancia(ponto2);
		System.out.println("dp1p2 " + dp1p2);

		double dp272 = ponto2.distancia(7d, 2d);
		System.out.println("dp272 " + dp272);

		ponto1.setX(10d);
		ponto1.setY(3d);
		dp1p2 = ponto1.distancia(ponto2);
		System.out.println("dp1p2 " + dp1p2);

	}

	/**
	 * Exercicio 003 Executa o cenario 3
	 */
	public static void executarCenario3() {
		Paciente p1 = new Paciente("00021", "Fulano da Silva");
		Paciente p2 = new Paciente("000171", "Ciclano dos Santos");
		p2.addHistorico("dor de cabeça");

		Compromisso c1 = new Compromisso("24/08/2005", "14h30min", "Beltrano Oliveira", p1);
		Compromisso c2 = new Compromisso("26/08/2005", "17h", "João Camargo", p2);

		c1.getPaciente().addHistorico("úlcera gástrica");
		c2.getPaciente().addHistorico("stress");
		c2.getPaciente().addHistorico("arritmia cardíaca");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println();

	}

	/**
	 * Exercicio 004 Executa o cenario 4
	 */
	public static void executarCenario04() {
		Pilha pilha = new Pilha();
		String[] opcoes = { "Push - inserir livro", "Pop – remover livro", "Peek – visualizar livro",
				"Lista – listar todos os livros" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Pilha", null);

			switch (opcao) {
			case 1:
				Livro livro = criarLivro();
				pilha.push(livro);
				System.out.println("Livro enviado para piha.\n");
				break;
			case 2:
				Livro removido = pilha.pop();
				if (removido != null) {
					System.out.println("Livro removido:");
					System.out.println(removido + "\n");
				} else {
					System.out.println("Nao ha livros na pilha");
				}

				break;
			case 3:
				Livro leitura = pilha.peek();
				if (leitura != null) {
					System.out.println("Livro no topo:");
					System.out.println(leitura + "\n");
				} else {
					System.out.println("Nao ha livros na pilha ");
				}

				break;
			case 4:
				System.out.println("Pilha atual:");
				System.out.println(pilha);
				System.out.println("*********mesa*********\n");
				break;
			case -1:
				System.out.println("Finalizando a pilha...");
				continua = false;
				break;
			}
		} while (continua);
	}

	/**
	 * Exercicio 005 Executa o cenario 5
	 */
	public static void executarCenario05() {
		Fila fila = new Fila();

		Paciente paciente = criarPaciente();
		
		String[] opcoes = { "Enqueue – inserir paciente", "Dequeue – remover paciente",
				"Lista – listar todos os pacientes" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Fila", null);
			switch (opcao) {
			case 1:
				fila.enqueue(paciente);
				break;
			case 2:
				fila.dequeue();
				break;
			case 3:
				fila.toString();
				break;
			case -1:
				System.out.println("Finalizando a fila...");
				continua = false;
				break;
			}

		} while (continua);
	}

	public static Paciente criarPaciente() {
		String codigo = Console.recuperaTexto("Informe o codigo: ");
		String nome = Console.recuperaTexto("Informe o nome: ");
		Paciente paciente = new Paciente(codigo, nome);
		return paciente;
	}

	public static void executarCenario06() {
		String[] opcoes = {"Inserir", "Excluir", "Consultar", "Listar"};
		
		boolean continua = true;
		
		do {
			int opcao = Console.mostrarMenu(opcoes, "Cenario 06", "# Coleção de DVDs #");
			
					switch (opcao) {
					case 1:
						
						break;

					case -1:
						continua = false;
						break;
					}
		} while (continua);
		
	}

}
