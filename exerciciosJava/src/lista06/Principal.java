package lista06;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws Exception {

		String[] opcoes = { "Cenario 001", "Cenario 002" };

		boolean continua = true;

		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 006", null);

			switch (opcao) {
			case 1:
				criarListaDeContatos();
				break;

			case 2:
				criarListaDePessoa();
				break;
				
			case -1:
				continua = false;
				System.out.println("Saindo do sistema...");
			}
		} while (continua);

	}

	public static void criarListaDeContatos() throws Exception {
		ArrayList<Contato> contatos = new ArrayList<>();
		String[] opcoes = { "Inserir contato", "Listar contatos" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Contatos", null);

			switch (opcao) {
			case 1:
				Contato novo = criarContato();
				contatos.add(novo);
				System.out.println("Contato adicionado!");
				break;

			case 2:
				System.out.println();
				for (Contato contato : contatos) {
					System.out.println(contato + "\n");
				}
				System.out.println();
				break;
			case -1:
				continua = false;
				System.out.println("Saindo dos contatos...");
				break;
			}
		} while (continua);
	}

	private static Contato criarContato() throws Exception {
		int codigo = Console.recuperaInteiro("Informe o código: ");
		String nome = Console.recuperaTexto("Informe o nome: ");
		String telefone = Console.recuperaTexto("Informe o telefone: ");

		String tiposContato[] = { "Pessoal?", "Comercial?", "Familiar?" };
		Contato contato = null;
		int opcao = Console.mostrarMenu(tiposContato, "Tipo de contato", null);
		boolean continua = true;
		do {
			switch (opcao) {
			case 1:
				String celular = Console.recuperaTexto("Informe o celular: ");
				contato = new Pessoal(codigo, nome, telefone, celular);
				break;
			case 2:
				String empresa = Console.recuperaTexto("Informe a empresa: ");
				contato = new Comercial(codigo, nome, telefone, empresa);
				break;
			case 3:
				String grauParentesco = Console.recuperaTexto("Informe o seu grau de parentesco: ");
				contato = new Familiar(codigo, nome, telefone, grauParentesco);
				break;
			case -1:
				continua = false;
				System.out.println("Finalizando cadastro...");
			}
		} while (continua);
		
		return contato;
	}

	private static void criarListaDePessoa() throws Exception {
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		String[] opcoes = { "Criar novo cadastro", "Imprimir o cadastro"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Cadastro", null);

			switch (opcao) {
			case 1:
				Pessoa novo = criarCadastro();
				pessoas.add(novo);
				System.out.println("Cadastro realizado!");
				break;
				
			case 2:
				for (Pessoa pessoa : pessoas) {
					System.out.println();
					System.out.println(pessoa);
				}
				System.out.println();
				break;

			case -1:
				continua = false;
				System.out.println("Saindo do cadastro...");
				break;
			}
		} while (continua);
	}

	private static Pessoa criarCadastro() throws Exception {
		String nome = Console.recuperaTexto("Digite o seu nome: ");
		String telefone = Console.recuperaTexto("Digite o seu telefone: ");
		int matricula = Console.recuperaInteiro("Digite sua matricula: ");
		

		String[] tipoDeCadastro = { "Cadastro de Aluno", "Cadastro de Bolsista", "Cadastro de Funcionario",
				"Cadastro de Professor" };
		Pessoa pessoa = null;
		int opcao = Console.mostrarMenu(tipoDeCadastro, "Tipo de Cadastro", null);
		boolean continua = true;
		do {
			switch (opcao) {
			case 1:
				System.out.println("CADASTRO DE ALUNO");
				String curso = Console.recuperaTexto("Informe o seu curso");
				System.out.println("Olá, por favor escolha o turno que você gostaria de estudar: ");
				int menuTurno = Console.mostrarMenu(Turno.getTurnos(), "Turnos", null);
				Turno turnoEscolhido = Turno.values()[menuTurno - 1];
				pessoa = new Aluno(nome, telefone, matricula, curso, turnoEscolhido);
				break;

			case 2:
				System.out.println("CADASTRO DE BOLSISTA");
				System.out.println("Olá, por favor escolha o turno que você gostaria de estudar: ");
				int menuTurnoBolsista = Console.mostrarMenu(Turno.getTurnos(), "Turnos", null);
				Turno turnoEscolhidoBonsista = Turno.values()[menuTurnoBolsista - 1];
				String cursoBonsista = Console.recuperaTexto("Informe o seu curso");
				String projeto = Console.recuperaTexto("Qual será o seu projeto: ");
				String orientador = Console.recuperaTexto("Quem será o seu orientador? ");
				pessoa = new Bolsista(nome, telefone, matricula, cursoBonsista, turnoEscolhidoBonsista, projeto, orientador);
				break;

			case 3:
				System.out.println("CADASTRO DE FUNCIONARIO");
				String setor = Console.recuperaTexto("Qual o setor que você trabalha? ");
				Double salario = Console.recuperaDecimal("Informe o seu salario: ");
				pessoa = new Funcionario(nome, telefone, matricula, setor, salario);
				break;

			case 4:
				System.out.println("CADASTRO DE PROFESSOR");
				String setorProfessor = Console.recuperaTexto("Qual o setor que você trabalha? ");
				Double salarioProfessor = Console.recuperaDecimal("Informe o seu salario: ");
				System.out.println("Olá Professor, por favor escolha o seu regime de trabalho: ");
				int menuRegimeTrabalho = Console.mostrarMenu(RegimeDeTrabalho.getRegimeDeTrabalho(), "Regime de Trabalho",
						null);
				RegimeDeTrabalho regimeEscolhido = RegimeDeTrabalho.values()[menuRegimeTrabalho - 1];
				ArrayList<String> disciplinas = criarDisciplinas();
				pessoa = new Professor(nome, telefone, matricula, setorProfessor, salarioProfessor, regimeEscolhido,
						disciplinas);
				break;

			case -1:
				continua = false;
				System.out.println("Finalizando cadastros...");
			}

		} while (continua);
		
		return pessoa;
	}

	private static ArrayList<String> criarDisciplinas() {
		ArrayList<String> disciplinas = new ArrayList<>();
		int qtdDisciplinas = Console.recuperaInteiro("Quantas disciplinas você irá dar aula este semestre: ");

		for (int i = 0; i < qtdDisciplinas; i++) {
			String disciplina = Console.recuperaTexto("Qual disciplina que você dará aula: ");
			disciplinas.add(disciplina);
		}
		return disciplinas;

	}
}
