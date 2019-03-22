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

		int menu = Console.mostrarMenu(opcoes, "Selecione uma op��es do menu", null);

		return menu;

	}

	/**
	 * Chama as fun��es de acordo com a sele��o do usu�rio.
	 * 
	 * @param menu - Op��o selecionada pelo usu�rio.
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
	 * M�todo para verificar se o ano � bissexto ou n�o.
	 */
	public static void anoBissexto() {
		int ano = Console.recuperaInteiro("Digite um ano qualquer para saber se ele � bissexto.");
		
		System.out.println("O ano de " + ano + " � bissexto? " + Calendario.isBissexto(ano));
	}
	
	/**
	 * M�todo para retornar os dias do m�s de acordo com o ano.
	 */
	public static void diasMes() {
		int ano = Console.recuperaInteiro("Digite um ano.");
		int mes = Console.recuperaInteiro("Digite um m�s.");
		
		System.out.println("Estes sao os dias do mes " + mes + " do ano " + ano + " " + Calendario.diasMes(mes, ano) + "\n" );
	}
	
	/**
	 * Resolucao em sala do mesmo exercicio para mostrar quantos dias tem em um mes
	 */
	public static void mostrarMes() {
		int ano = Console.recuperaInteiro("Digite um ano.");
		int mes = Console.recuperaInteiro("Digite um m�s.");
		
		System.out.println("Estes sao os dias do mes " + mes + " do ano " + ano + " " + Calendario.criarDiasMes(mes, ano) + "\n");
	}
	
}
