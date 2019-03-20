package lista03;

import java.util.ArrayList;
import java.util.List;

import lista01.Console;

/**
 * Essa classe vai servir para a resolução da lista 01 de exercícios.
 * 
 * @author Rafael Kohler
 *
 */
public class Principal {

	/**
	 * Função que da início ao programa.
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
	 * Faz a execução da tela com as opções ao usuário e devolve a escolha.
	 * 
	 * @return - Opção selecionada pelo usuário.
	 */
	public static int menu2() {

		String[] opcoes = { "Cálculo do peso ideal", "Equação de segundo grau", "Pagamento", "Calculadora simples", "Cálculo distância dos trinângulos" };
		int menu = Console.mostrarMenu(opcoes, "Selecione a opção desejada da lista 03:", null);
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
		System.out.printf("O peso ideal é: %.2f kilos.\n\n", resultado);
	}

	/**
	 * Calcula a euqação de segundo grau conforme Báskara.
	 */
	public static void equacaoSegundoGrau() {
		double a = Console.recuperaDecimal("Favor digitar o valor de a: ");
		double b = Console.recuperaDecimal("Favor digitar o valor de b: ");
		double c = Console.recuperaDecimal("Favor digitar o valor de c: ");

		double[] equacao = Exercicios.calcularEquacao2Grau(a, b, c);
		if (equacao.length == 0) {
			System.out.println("Não existem raízes reais");
		} else if (equacao.length == 1) {
			System.out.printf("Existe uma raiz real, e seu valor é:%.2f\n", equacao[0]);
		} else {
			System.out.printf("Raiz 1:%.2f\n", equacao[0]);
			System.out.printf("Raiz 2:%.2f\n\n", equacao[1]);
		}
	}

	/**
	 * Calcula o valor do pagamento.
	 */
	public static void pagamento() {
		System.out.println("Digite 1 - para pagamento à vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("Digite 2 - para pagamento à vista no cartão de crédito, com 5% de desconto");
		System.out.println("Digite 3 - para pagamento em 2 vezes, preço normal da etiqueta sem juros");
		System.out.println("Digite 4 - para pagamento em 3 vezes, preço normal da etiqueta mais 10% de juros");
		int codigo = Console.recuperaInteiro("Favor escolher a forma de pagamento");
		double valor = Console.recuperaDecimal("Informe o valor do produto: ");

		double valorPago = Exercicios.calcularPagamento(codigo, valor);
		if(codigo == 1) {
			System.out.println("O valor a ser pago com 10% é: " + valorPago);
			System.out.println();
		} else if (codigo == 2) {
			System.out.println("O valor a ser pago com 5% é: " + valorPago);
			System.out.println();
		} else if (codigo == 3) {
			System.out.printf("O valor da parcela é: %.2f\n", valorPago);
			System.out.println("O valor total da compra é: " + (valorPago*2));
			System.out.println();
		} else {
			System.out.printf("O valor da parcela é: %.2f\n", valorPago);
			System.out.println("O valor total da compra com 10% de juros é: " + (valorPago*3));	
			System.out.println();
		}
	}
	
	/**
	 * Método de calculadora simples.
	 */
	public static void calculadora() {
		double valor1 = Console.recuperaDecimal("Favor digitar o primeiro valor");
		System.out.println("Digite 1 - para adição");
		System.out.println("Digite 2 - para subtração");
		System.out.println("Digite 3 - para multiplicação");
		System.out.println("Digite 4 - para divisçao");
		int operacao = Console.recuperaInteiro("Favor escolher uma das opções");
		double valor2 = Console.recuperaDecimal("Favor digitar o segundo valor");
		
		double resultado = Exercicios.usarCalculadora(valor1, valor2, operacao);
		System.out.println("O resultado da operação é: " + resultado);
	}
	
	/**
	 * Método que retorna uma string com o tipo do triângulo.
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