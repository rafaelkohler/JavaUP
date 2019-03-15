package lista02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe para executar os exerc�cios da Lista 02.
 * 
 * @author Rafael Kohler
 *
 */
public class Exercicios {
	
	/**
	 * M�todo de exemplo para trabalhar com vetor;
	 */
	public static void array() {
		
		int aleatorio = (int) (Math.random() * 100); //Math.random() retorna um inteiro, fazendo um casting ele tira a parte decimal.
		System.out.println(aleatorio);
		
		int[] idades = new int[aleatorio]; //cria um array de tamanho aleat�rio
		
		for(int i = 0; i < idades.length; i++) { // uma l�gica com o �ndice da lista - for usado com o �ndice, voc� pega o valor do array atrav�s do �ndice
			idades[i] = (int) (Math.random() * 100);
		}
		
		for(int idade : idades) { // l�gica somente com os resultados - for usado sem �ndice, voc� pega o valor do array se preocupa somente com o conte�do do array.
			System.out.println(idade);
		}
		
		for(int i = 0; i < idades.length; i++) { //for usado com o �ndice, voc� pega o valor do array atrav�s do �ndice
			idades[i] = (int) (Math.random() * 100);
		}
		
		for(int i = 0; i < idades.length; i++) {
			int idade = idades[i];
			System.out.println(idade);
		}
	}
	
	/**
	 * M�todo respons�vel por montar uma lista de n�meros inteiros.
	 * 
	 * @param tamanhoVetor recebe como par�metro o tamanho do vetor
	 * @return Lista de n�meros inteiros.
	 */
	public static List<Integer> mostraVetor(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor.add(numero);
		}
		return vetor;
	}

	/**
	 * M�todo respons�vel por montar um vetor e mostrar o maior elemento deste
	 * vetor.
	 * 
	 * @param tamanhoVetor O m�todo recebe como par�metro o tamanho do vetor.
	 * @return O maior elemento do vetor.
	 */
	public static int maiorElemento(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		int maior = 0;
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor.add(numero);
			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O vetor de n�meros �: " + vetor);
		return maior;
	}

	/**
	 * M�todo respons�vel por montar um vetor e mostrar o menor elemento deste
	 * vetor.
	 * 
	 * @param tamanhoVetor O m�todo recebe como par�metro o tamanho do vetor.
	 * @return O menor elemento do vetor.
	 */
	public static int menorElemento(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor.add(numero);
			if (numero < menor) {
				menor = numero;
			}
		}
		System.out.println("O vetor de n�meros �: " + vetor);
		int index = vetor.indexOf(menor);
		System.out.println("A posi��o do menor elemento �: " + (index + 1));
		
		return menor;
		
		
	}

	public static List<Integer> vetorInverso(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor.add(numero);
		}
		System.out.println("O vetor original �: " + vetor);
		Collections.reverse(vetor);
		return vetor;
	}

}