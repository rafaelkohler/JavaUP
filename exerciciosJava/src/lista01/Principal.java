package lista01;

/**
 * Essa classe vai servir para a resolu��o da lista 01 de exerc�cios.
 * 
 * @author Rafael Kohler
 *
 */
public class Principal {

	/**
	 * Fun��o que da in�cio ao programa.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int menu = menu2();
		do {
			selecaoMenu(menu);
			menu = menu2();
			
		} while (menu > -1); 
	}

	/**
	 * Faz a execu��o da tela com as op��es ao usu�rio e devolve a escolha.
	 * 
	 * @return - Op��o selecionada pelo usu�rio.
	 */
	public static int menu2() {

		String[] opcoes = { "C�lculo do en�simo termo da PA.", "C�lculo da m�dia Aritmetica.",
				"C�lculo da m�dia ponderada.", "C�lculo de convers�o de celsius para fahrenheint.",
				"C�lculo de volume do cilindro.", "C�lculo de gasto de combustivel.",
				"C�lculo do valor final a ser pago por uma compra." };

		String titulo = "Selecione a op��o desejada:";

		String descricao = null;

		int menu = Console.mostrarMenu(opcoes, titulo, descricao);

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
			calcularEnesimoTermoPA();
			break;
		case 2:
			calcularMediaAritmetica();
			break;
		case 3:
			calcularMediaPonderada();
			break;
		case 4:
			converterCelsiusParaFahrenheint();
			break;
		case 5:
			calcularVolumeCilindro();
			break;
		case 6:
			calcularCombustivel();
			break;
		case 7:
			calcularValorPago();
			break;
		}
	}

	/**
	 * Faz a execu��o de tela do c�lculo do en�simo termo da PA.
	 */
	public static void calcularEnesimoTermoPA() {

		// Pega as variaveis do teclado
		int a1 = Console.recuperaInteiro("Digite o valor de a1:");
		int n = Console.recuperaInteiro("Digite o valor de n:");
		int r = Console.recuperaInteiro("Digite o valor de r:");

		// Executa o calculo
		int an = Exercicios.calcularEnesimoTermoPA(a1, n, r);

		// Printa na tela
		System.out.println("O resultado da an = " + an);
	}

	/**
	 * Faz a execu��o de tela do c�lculo da m�dia aritmetica.
	 */
	public static void calcularMediaAritmetica() {

		// Pega as variaveis do teclado
		double nota1 = Console.recuperaDecimal("Digite a primeira nota:");
		double nota2 = Console.recuperaDecimal("Digite a segunda nota:");
		double nota3 = Console.recuperaDecimal("Digite a terceira nota:");

		// Executa o calculo
		double mediaAritmetica = Exercicios.calcularMediaAritmetica(nota1, nota2, nota3);

		// Printa na tela
		System.out.printf("A m�dia aritmetica � = %.2f\n\n", mediaAritmetica);
	}

	/**
	 * Faz a execu��o de tela do c�lculo da m�dia ponderada.
	 */
	public static void calcularMediaPonderada() {

		// Pega as variaveis do teclado
		double dnota1 = Console.recuperaDecimal("Digite a primeira nota:");
		double peso1 = Console.recuperaDecimal("Digite o peso da primeira nota:");
		double dnota2 = Console.recuperaDecimal("Digite a segunda nota:");
		double peso2 = Console.recuperaDecimal("Digite o peso da segunda nota:");
		double dnota3 = Console.recuperaDecimal("Digite a terceira nota:");
		double peso3 = Console.recuperaDecimal("Digite o peso da terceira nota:");

		// Executa o calculo
		double mediaPonderada = Exercicios.calcularMediaPonderada(dnota1, peso1, dnota2, peso2, dnota3, peso3);

		// Printa na tela
		System.out.printf("A m�dia ponderada � = %.2f\n\n", mediaPonderada);
	}

	/**
	 * Faz a execu��o de tela do c�lculo de convers�o de celsius para fahrenheint.
	 */
	public static void converterCelsiusParaFahrenheint() {

		// Pega as variaveis do teclado
		double tempCelsius = Console.recuperaDecimal("Digite a temperatura em Celsius:");

		// Executa o calculo
		double tempFahrenheint = Exercicios.converterCelsiusParaFahrenheint(tempCelsius);

		// Printa na tela
		System.out.printf("A temperatura convertida para fahrenheint ficou = %.2f\n\n", tempFahrenheint);
	}

	/**
	 * Faz a execu��o de tela do c�lculo de volume do cilindro.
	 */
	public static void calcularVolumeCilindro() {

		// Pega as variaveis do teclado
		double raio = Console.recuperaDecimal("Digite o raio do cilindro:");
		double altura = Console.recuperaDecimal("Digite a altura do cilindro:");

		// Executa o calculo
		double volume = Exercicios.calcularVolumeCilindro(raio, altura);

		// Printa na tela
		System.out.printf("O volume do cilindro inserido � = %.2f\n\n", volume);
	}

	/**
	 * Faz a execu��o de tela do c�lculo de gasto de combustivel.
	 */
	public static void calcularCombustivel() {

		// Pega as variaveis do teclado
		double tempo = Console.recuperaDecimal("Digite o tempo total da viagem em minutos:");
		double velocidadeMedia = Console.recuperaDecimal("Digite a velocidade m�dia da viagem:");

		// Executa o calculo
		double gastoTotal = Exercicios.calcularCombustivel(tempo, velocidadeMedia);

		// Printa na tela
		System.out.printf("O gasto total de combustivel em litros foi = %.2f\n\n", gastoTotal);
	}

	/**
	 * Faz a execu��o de tela do c�lculo do valor final a ser pago por uma compra.
	 */
	public static void calcularValorPago() {

		// Pega as variaveis do teclado
		double valorInicial = Console.recuperaDecimal("Digite o valor inicial do compra:");
		double acrescimo = Console.recuperaDecimal("Digite o valor do acrescimo:");

		// Executa o calculo
		double valorFinal = Exercicios.calcularValorPago(valorInicial, acrescimo);

		// Printa na tela
		System.out.printf("O valor final a ser pago � = %.2f\n\n", valorFinal);
	}
}