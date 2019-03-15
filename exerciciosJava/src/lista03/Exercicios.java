package lista03;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para executar os exercícios da Lista 02.
 * 
 * @author Rafael Kohler
 */
public class Exercicios {

	/**
	 * Fator fixo para utilização no cálculo de peso ideal para homens
	 */
	public static final double FATOR_MASCULINO_1 = 72.7d; // "final" significa que esta variável não será alterado o
															// valor ao longo do código.
	/**
	 * Fator fixo para utilização no cálculo de peso ideal para homens
	 */
	public static final double FATOR_MASCULINO_2 = 58d;
	/**
	 * Fator fixo para utilização no cálculo de peso ideal para mulheres
	 */
	public static final double FATOR_FEMININO_1 = 62.1d;
	/**
	 * Fator fixo para utilização no cálculo de peso ideal para mulheres
	 */
	public static final double FATOR_FEMININO_2 = 44.7d;

	/**
	 * Calcula o peso ideal de uma pessoa baseado no sexo e na altura
	 * 
	 * @param sexo   utilize M para Masculino e F para Feminino
	 * @param altura Altura em metros da pessoa.
	 * @return O peso ideal.
	 */
	public static double calcularPesoIdeal(String sexo, double altura) {
		double pesoIdeal = 0;
		if (sexo.equalsIgnoreCase("M")) {
			return (FATOR_MASCULINO_1 * altura) - FATOR_MASCULINO_2;
		}
		if (sexo.equalsIgnoreCase("F")) {
			return (FATOR_FEMININO_1 * altura) - FATOR_FEMININO_2;
		}
		return pesoIdeal;
	}

	/**
	 * Faz o cálculo de Báskara para a equacao de segundo grau.
	 * 
	 * @param a Termo em x ao quadrado.
	 * @param b Termo em x.
	 * @param c Termo em x elevado a zero.
	 * @return
	 */
	public static double[] calcularEquacao2Grau(double a, double b, double c) {

		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0) {
			// Não tem raízes reais.
			double[] vazio = {};
			return vazio;
		}

		if (delta == 0) {
			// Apenas uma razi real.
			double raiz = -b / 2 * a;
			double[] umaRaiz = { raiz };
			return umaRaiz;

		}

		// Duas raízes reais.
		double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
		double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
		double[] raizes = { raiz1, raiz2 };
		return raizes;
	}

	/**
	 * Método para fazer a o cálculo de formas de pagamento.
	 * 
	 * @param codigo Seleção da opção de pagamento
	 * @param valor  Valor do produto
	 * @return
	 */
	public static double calcularPagamento(int codigo, double valor) {
		switch (codigo) {
		case 1:
			valor = valor * 0.9;
			return valor;
		case 2:
			valor = valor * 0.95;
			return valor;
		case 3:
			valor = valor / 2;
			return valor;
		case 4:
			valor = (valor * 1.1) / 3;
			return valor;
		}
		return (Double) null;
	}

	/**
	 * Método para montar uma calculadora simples
	 * 
	 * @param valor1   Primeiro valor informado
	 * @param valor2   Segundo valor informado
	 * @param operacao Seleção da operação
	 * @return
	 */
	public static double usarCalculadora(double valor1, double valor2, int operacao) {
		switch (operacao) {
		case 1:
			return valor1 + valor2;
		case 2:
			return valor1 - valor2;
		case 3:
			return valor1 * valor2;
		case 4:
			return valor1 / valor2;
		}
		return (Double) null;
	}

	public static double calcularDistancia(double x1, double x2, double y1, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
}