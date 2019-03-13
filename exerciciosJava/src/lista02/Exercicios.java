package lista02;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para executar os exerc�cios da Lista 02.
 * 
 * @author Rafael Kohler
 *
 */
public class Exercicios {

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
	public static int menorrElemento(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		int menor = 0;
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor.add(numero);
			if (numero < menor) {
				menor = numero;
				vetor.get(i);
			}
		}
		System.out.println("O vetor de n�meros �: " + vetor);
		
		return menor;
	}

	public static List<Integer> vetorInverso(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor.add(numero);
		}
		return vetor;
	}

}