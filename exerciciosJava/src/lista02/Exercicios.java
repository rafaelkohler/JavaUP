package lista02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe para executar os exercícios da Lista 02.
 * 
 * @author Rafael Kohler
 *
 */
public class Exercicios {
	
	/**
	 * Método de exemplo para trabalhar com vetor;
	 */
	public static void array() {
		
		int aleatorio = (int) (Math.random() * 100); //Math.random() retorna um inteiro, fazendo um casting ele tira a parte decimal.
		System.out.println(aleatorio);
		
		int[] idades = new int[aleatorio]; //cria um array de tamanho aleatório
		
		for(int i = 0; i < idades.length; i++) { // uma lógica com o índice da lista - for usado com o índice, você pega o valor do array através do índice
			idades[i] = (int) (Math.random() * 100);
		}
		
		for(int idade : idades) { // lógica somente com os resultados - for usado sem índice, você pega o valor do array se preocupa somente com o conteúdo do array.
			System.out.println(idade);
		}
		
		for(int i = 0; i < idades.length; i++) { //for usado com o índice, você pega o valor do array através do índice
			idades[i] = (int) (Math.random() * 100);
		}
		
		for(int i = 0; i < idades.length; i++) {
			int idade = idades[i];
			System.out.println(idade);
		}
	}
	
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
	public static int menorElemento(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posição " + (i + 1));
			vetor.add(numero);
			if (numero < menor) {
				menor = numero;
			}
		}
		System.out.println("O vetor de números é: " + vetor);
		int index = vetor.indexOf(menor);
		System.out.println("A posição do menor elemento é: " + (index + 1));
		
		return menor;
		
		
	}

	public static List<Integer> vetorInverso(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posição " + (i + 1));
			vetor.add(numero);
		}
		System.out.println("O vetor original é: " + vetor);
		Collections.reverse(vetor);
		return vetor;
	}

}