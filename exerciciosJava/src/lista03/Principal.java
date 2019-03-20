package lista03;

import java.util.ArrayList;
import java.util.List;

import lista01.Console;

/**
 * Essa classe vai servir para a resolu��o da lista 01 de exerc�cios.
 * 
 * @author Rafael Kohler
 *
 */
public class Principal {

	/**
	 * Fun��o que da in�cio ao programa.
	 * 
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

		String[] opcoes = { "C�lculo do peso ideal", "Equa��o de segundo grau", "Pagamento", "Calculadora simples", "C�lculo dist�ncia dos trin�ngulos" };
		int menu = Console.mostrarMenu(opcoes, "Selecione a op��o desejada da lista 03:", null);
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
			pesoIdeal();
			break;
		case 2:
			equacaoSegundoGrau();
			break;
		case 3:
			pagamento();
			break;
		case 4:
			calculadora();
			break;
		case 5:
			triangulo();
			break;
		case 6:
			break;
		case 7:
			break;
		}
	}

	/**
	 * Calcula o peso ideal.
	 */
	public static void pesoIdeal() {
		double altura = Console.recuperaDecimal("Favor digitar sua altura: ");
		String sexo = Console.recuperaTexto("Qual o seu sexo? M para masculino e F para feminino");

		double resultado = Exercicios.calcularPesoIdeal(sexo, altura);
		System.out.printf("O peso ideal �: %.2f kilos.\n\n", resultado);
	}

	/**
	 * Calcula a euqa��o de segundo grau conforme B�skara.
	 */
	public static void equacaoSegundoGrau() {
		double a = Console.recuperaDecimal("Favor digitar o valor de a: ");
		double b = Console.recuperaDecimal("Favor digitar o valor de b: ");
		double c = Console.recuperaDecimal("Favor digitar o valor de c: ");

		double[] equacao = Exercicios.calcularEquacao2Grau(a, b, c);
		if (equacao.length == 0) {
			System.out.println("N�o existem ra�zes reais");
		} else if (equacao.length == 1) {
			System.out.printf("Existe uma raiz real, e seu valor �:%.2f\n", equacao[0]);
		} else {
			System.out.printf("Raiz 1:%.2f\n", equacao[0]);
			System.out.printf("Raiz 2:%.2f\n\n", equacao[1]);
		}
	}

	/**
	 * Calcula o valor do pagamento.
	 */
	public static void pagamento() {
		System.out.println("Digite 1 - para pagamento � vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("Digite 2 - para pagamento � vista no cart�o de cr�dito, com 5% de desconto");
		System.out.println("Digite 3 - para pagamento em 2 vezes, pre�o normal da etiqueta sem juros");
		System.out.println("Digite 4 - para pagamento em 3 vezes, pre�o normal da etiqueta mais 10% de juros");
		int codigo = Console.recuperaInteiro("Favor escolher a forma de pagamento");
		double valor = Console.recuperaDecimal("Informe o valor do produto: ");

		double valorPago = Exercicios.calcularPagamento(codigo, valor);
		if(codigo == 1) {
			System.out.println("O valor a ser pago com 10% �: " + valorPago);
			System.out.println();
		} else if (codigo == 2) {
			System.out.println("O valor a ser pago com 5% �: " + valorPago);
			System.out.println();
		} else if (codigo == 3) {
			System.out.printf("O valor da parcela �: %.2f\n", valorPago);
			System.out.println("O valor total da compra �: " + (valorPago*2));
			System.out.println();
		} else {
			System.out.printf("O valor da parcela �: %.2f\n", valorPago);
			System.out.println("O valor total da compra com 10% de juros �: " + (valorPago*3));	
			System.out.println();
		}
	}
	
	/**
	 * M�todo de calculadora simples.
	 */
	public static void calculadora() {
		double valor1 = Console.recuperaDecimal("Favor digitar o primeiro valor");
		System.out.println("Digite 1 - para adi��o");
		System.out.println("Digite 2 - para subtra��o");
		System.out.println("Digite 3 - para multiplica��o");
		System.out.println("Digite 4 - para divis�ao");
		int operacao = Console.recuperaInteiro("Favor escolher uma das op��es");
		double valor2 = Console.recuperaDecimal("Favor digitar o segundo valor");
		
		double resultado = Exercicios.usarCalculadora(valor1, valor2, operacao);
		System.out.println("O resultado da opera��o �: " + resultado);
	}
	
	/**
	 * M�todo que retorna uma string com o tipo do tri�ngulo.
	 */
	public static void triangulo() {
		double x1 = Console.recuperaDecimal("Favor passar o valor de x1: ");
		double y1 = Console.recuperaDecimal("Favor passar o valor de y1: ");
		double x2 = Console.recuperaDecimal("Favor passar o valor de x2: ");
		double y2 = Console.recuperaDecimal("Favor passar o valor de y2: ");
		double x3 = Console.recuperaDecimal("Favor passar o valor de x3: ");
		double y3 = Console.recuperaDecimal("Favor passar o valor de y3: ");
		
		String tipoTriangulo = Exercicios.identificarTriangulo(x1, x2, y1, y2, x3, y3);
		System.out.println(tipoTriangulo);
		
		
	}
	
}