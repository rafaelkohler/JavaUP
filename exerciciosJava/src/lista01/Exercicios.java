package lista01;

/**
 * Classe para executar os exerc�cios da Lista 01.
 * @author Rafael Kohler
 *
 */
public class Exercicios {
	
	/**
	 * Ex01 . Fun��o que calcula o en�simo termo da PA.
	 * @param a1 - Primeiro termo.
	 * @param n - �ndice do en�simo termo.
	 * @param r - raz�o da PA.
	 * @return - En�simo termo da PA.
	 */
	public static int calcularEnesimoTermoPA(int a1, int n, int r) {
		
		int an = a1 + (n-1) * r;
		return an;
	}
	
	/**
	 * Ex02 . Fun��o para calcular a m�dia aritmetica de tr�s notas.
	 * @param nota1 - Primeira nota.
	 * @param nota2 - Segunda nota.
	 * @param nota3 - Terceira nota.
	 * @return - M�dia aritmetica das tr�s notas.
	 */
	public static double calcularMediaAritmetica(double nota1, double nota2, double nota3) {
		
		return ((nota1 + nota2 + nota3) / 3);
	}
	
	/**
	 * Ex03 . Fun��o para calcular a m�dia ponderada de tr�s notas.
	 * @param dnota1 - Primeira nota.
	 * @param peso1 - Peso da primeira nota.
	 * @param dnota2 - Segunda nota.
	 * @param peso2 - Peso da segunda nota.
	 * @param dnota3 - Terceira nota.
	 * @param peso3 - Peso da terceira nota.
	 * @return - M�dia ponderada das tr�s notas.
	 */
	public static double calcularMediaPonderada(double dnota1, double peso1, double dnota2, double peso2, double dnota3, double peso3) {
		
		return ((dnota1 * peso1 + dnota2 * peso2 + dnota3 * peso3) / (peso1 + peso2 + peso3));
	}
	
	/**
	 * Ex04 . Fun��o para converter uma temperatura em celsius para fahrenheint.
	 * @param tempCelsius - Temperatura em celsius.
	 * @return - Temperatura convertida para fahrenheint
	 */
	public static double converterCelsiusParaFahrenheint(double tempCelsius) {
		
		return ((9 * tempCelsius + 160) / 5);
	}
	
	/**
	 * Ex05 . Fun��o para calcular o volume de um cilindro.
	 * @param raio - Raio do cilindro.
	 * @param altura - Altura do cilindro
	 * @return - Volume do cilindro
	 */
	public static double calcularVolumeCilindro(double raio, double altura) {
		
		return (3.14 * Math.pow(raio, 2) * altura);
	}
	
	/**
	 * Ex06 . Fun��o para calcular o consumo de combust�vel em uma viagem.
	 * @param tempo - Dura��o da viagem em minutos.
	 * @param velocidadeMedia - Velocidade m�dia durante a viagem em quil�metros por hora.
	 * @return - Gasto total de combust�vel em litros.
	 */
	public static double calcularCombustivel(double tempo, double velocidadeMedia) {
		
		double distancia = tempo / 60;
		
		distancia = distancia * velocidadeMedia;
				
		return (distancia / 12);
	}
	
	/**
	 * Ex07 . Fun��o para calcular o valor final a ser pago por um compra com acr�scimo.
	 * @param valorInicial - Valor inicial sem o acr�scimo.
	 * @param acrescimo - Acr�scimo a ser adicionado sob o valor inicial.
	 * @return - Valor final.
	 */
	public static double calcularValorPago(double valorInicial, double acrescimo) {
		
		return (valorInicial + (valorInicial * (acrescimo / 100)));
	}

}