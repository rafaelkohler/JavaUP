package lista02;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para executar os exercícios da Lista 02.
 * 
 * @author Rafael Kohler
 *
 */
public class Exercicios {

	/**
	 * Método responsável por montar uma lista de números inteiros.
	 * 
	 * @param tamanhoVetor recebe como parâmetro o tamanho do vetor
	 * @return Lista de números inteiros.
	 */
	public static List<Integer> mostraVetor(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posição " + (i + 1));
			vetor.add(numero);
		}
		return vetor;
	}

	/**
	 * Método responsável por montar um vetor e mostrar o maior elemento deste
	 * vetor.
	 * 
	 * @param tamanhoVetor O método recebe como parâmetro o tamanho do vetor.
	 * @return O maior elemento do vetor.
	 */
	public static int maiorElemento(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		int maior = 0;
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posição " + (i + 1));
			vetor.add(numero);
			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O vetor de números é: " + vetor);
		return maior;
	}

	/**
	 * Método responsável por montar um vetor e mostrar o menor elemento deste
	 * vetor.
	 * 
	 * @param tamanhoVetor O método recebe como parâmetro o tamanho do vetor.
	 * @return O menor elemento do vetor.
	 */
	public static int menorrElemento(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		int menor = 0;
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posição " + (i + 1));
			vetor.add(numero);
			if (numero < menor) {
				menor = numero;
				vetor.get(i);
			}
		}
		System.out.println("O vetor de números é: " + vetor);
		
		return menor;
	}

	public static List<Integer> vetorInverso(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posição " + (i + 1));
			vetor.add(numero);
		}
		return vetor;
	}

}