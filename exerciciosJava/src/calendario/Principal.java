package calendario;

public class Principal {

	public static void main(String[] args) {
		
		int menu = menu2();
		do {
			selecaoMenu(menu);
			menu = menu2();

		} while (menu > -1);
	}
	public static int menu2() {

		String[] opcoes = { "Ano bissexto", "Dias do mes", "Dias do mes (RESOLUCAO EM SALA)" };

		int menu = Console.mostrarMenu(opcoes, "Selecione uma opções do menu", null);

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
			anoBissexto();
			break;
		case 2:
			diasMes();
			break;
		case 3:
			mostrarMes();
			break;
		}
	}
	/**
	 * Método para verificar se o ano é bissexto ou não.
	 */
	public static void anoBissexto() {
		int ano = Console.recuperaInteiro("Digite um ano qualquer para saber se ele é bissexto.");
		
		System.out.println("O ano de " + ano + " é bissexto? " + Calendario.isBissexto(ano));
	}
	
	/**
	 * Método para retornar os dias do mês de acordo com o ano.
	 */
	public static void diasMes() {
		int ano = Console.recuperaInteiro("Digite um ano.");
		int mes = Console.recuperaInteiro("Digite um mês.");
		
		System.out.println("Estes sao os dias do mes " + mes + " do ano " + ano + " " + Calendario.diasMes(mes, ano) + "\n" );
	}
	
	/**
	 * Resolucao em sala do mesmo exercicio para mostrar quantos dias tem em um mes
	 */
	public static void mostrarMes() {
		int ano = Console.recuperaInteiro("Digite um ano.");
		int mes = Console.recuperaInteiro("Digite um mês.");
		
		System.out.println("Estes sao os dias do mes " + mes + " do ano " + ano + " " + Calendario.criarDiasMes(mes, ano) + "\n");
	}
	
}
