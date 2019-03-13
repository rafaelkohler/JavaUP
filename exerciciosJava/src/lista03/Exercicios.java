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
}