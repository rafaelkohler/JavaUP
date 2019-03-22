package lista02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import javafx.util.Pair;

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

		int aleatorio = (int) (Math.random() * 100); // Math.random() retorna um inteiro, fazendo um casting ele tira a
														// parte decimal.
		System.out.println(aleatorio);

		int[] idades = new int[aleatorio]; // cria um array de tamanho aleatório

		for (int i = 0; i < idades.length; i++) { // uma lógica com o índice da lista - for usado com o índice, você
													// pega o valor do array através do índice
			idades[i] = (int) (Math.random() * 100);
		}

		for (int idade : idades) { // lógica somente com os resultados - for usado sem índice, você pega o valor do
									// array se preocupa somente com o conteúdo do array.
			System.out.println(idade);
		}

		for (int i = 0; i < idades.length; i++) { // for usado com o índice, você pega o valor do array através do
													// índice
			idades[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < idades.length; i++) {
			int idade = idades[i];
			System.out.println(idade);
		}

		int[] idades2 = new int[4];
		System.out.println(idades2.length);
		idades2 = aumentarVetor(idades2);
		System.out.println(idades2.length);
	}

	/**
	 * Estudo de coleções de ArrayList
	 */
	public void colecoes() {
		ArrayList<Integer> idades = new ArrayList<>();
		System.out.println(idades.size()); // size = 0
		System.out.println(idades); // conteudo [] vazio
		idades.add(10);

		System.out.println(idades.size()); // size = 1
		System.out.println(idades); // conteudo [10]

	}

	public static int[] aumentarVetor(int[] vetor) {
		int[] vetorNovo = new int[vetor.length + 1];
		for (int i = 0; i < vetor.length; i++) {
			vetorNovo[i] = vetor[i];
		}
		return vetorNovo;
	}

	/**
	 * Método para criar um vetor de valores inteiros
	 * 
	 * @param tamanhoVetor
	 * @return
	 */
	public static List<Integer> criarVetorInteiro(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posição " + (i + 1));
			vetor.add(numero);
		}
		return vetor;
	}

	/**
	 * Método para criar um vetor de valores decimais
	 * 
	 * @param tamanhoVetor
	 * @return
	 */
	public static List<Double> criarVetorDecimal(int tamanhoVetor) {
		List<Double> vetor = new ArrayList<Double>();
		for (int i = 0; i < tamanhoVetor; i++) {
			Double numero = Console.recuperaDecimal("Digite um valor para o vetor na posição " + (i + 1));
			vetor.add(numero);
		}
		return vetor;
	}

	/**
	 * ex001 - Método responsável por montar uma lista de números inteiros.
	 * 
	 * @param tamanhoVetor recebe como parâmetro o tamanho do vetor
	 * @return Lista de números inteiros.
	 */
	public static List<Integer> mostraVetor(int tamanhoVetor) {
		return criarVetorInteiro(tamanhoVetor);
	}

	/**
	 * ex002 - Método responsável por montar um vetor e mostrar o maior elemento
	 * deste vetor.
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
	 * ex003 - Método responsável por montar um vetor e mostrar o menor elemento
	 * deste vetor.
	 * 
	 * @param tamanhoVetor O método recebe como parâmetro o tamanho do vetor.
	 * @return O menor elemento do vetor.
	 */
	public static int menorElemento(int tamanhoVetor) {
		List<Integer> vetor = criarVetorInteiro(tamanhoVetor);
		Integer menor = Collections.min(vetor);
		Integer posicao = vetor.indexOf(Collections.min(vetor));

		System.out.println("Este é o vetor de números inteiros " + vetor);
		System.out.println("O menor valor é? " + menor);
		return posicao + 1;
	}

	/**
	 * ex004 - étodo responsável por montar a lista inversa
	 * 
	 * @param tamanhoVetor Recebe como parâmetro o tamanho do vetor que será criado
	 * @return Retorna a lista inversa utilizando a Classe Collections com o método
	 *         reverse.
	 */
	public static List<Integer> vetorInverso(int tamanhoVetor) {
		List<Integer> vetor = criarVetorInteiro(tamanhoVetor);
		System.out.println("O vetor original é: " + vetor);

		Collections.reverse(vetor);
		return vetor;
	}

	/**
	 * ex005 - Método para montar duas listas e multiplicar seus valores.
	 * 
	 * @param tamanhoVetor
	 * @return retorna a lista multiplicada
	 */
	public static List<Double> multiplicarVetor(int tamanhoVetor) {
		List<Double> vetor1 = new ArrayList<Double>();
		List<Double> vetor2 = new ArrayList<Double>();
		List<Double> vetor3 = new ArrayList<Double>();
		for (int i = 0; i < tamanhoVetor; i++) {
			Double numero = Console.recuperaDecimal("Digite um valor para o vetor na posição " + (i + 1));
			vetor1.add(numero);
		}
		for (int i = 0; i < tamanhoVetor; i++) {
			Double numero = Console.recuperaDecimal("Digite um valor para o vetor na posição " + (i + 1));
			vetor2.add(numero);
		}

		for (int i = 0; i < tamanhoVetor; i++) {
			Double valor = (vetor1.get(i) * vetor2.get(i));
			vetor3.add(valor);
		}
		return vetor3;
	}

	/**
	 * ex006 - Método responsável por calcular o produto escalável de dois vetores.
	 * 
	 * @param tamanhoVetor
	 * @return retorna um número inteiro com a soma da multiplicação dos dois
	 *         vetores.
	 */
	public static Integer calcularProdutoEscalavel(int tamanhoVetor) {
		List<Integer> vetor1 = criarVetorInteiro(tamanhoVetor);
		List<Integer> vetor2 = criarVetorInteiro(tamanhoVetor);
		Integer numero = 0, soma = 0;

		for (int i = 0; i < tamanhoVetor; i++) {
			numero = (vetor1.get(i) * vetor2.get(i));
			soma += numero;
		}
		return soma;
	}

	/**
	 * Cria a serie de Fibonacci utilizando vetor primitivo
	 * 
	 * @param quantidade de elementos da serie
	 * @return um vetor primitivo de inteiros com a serie de Fibonacci.
	 */
	public static int[] criaSeriefibonacciComVetor(int quantidade) {
		int[] serieFibonacci = new int[quantidade];

		for (int i = 0; i < serieFibonacci.length; i++) {
			if (i == 0 || i == 1) {
				serieFibonacci[i] = 1;
			} else {
				serieFibonacci[i] = serieFibonacci[i - 1] + serieFibonacci[i - 2];
			}
		}
		return serieFibonacci;

	}

	/**
	 * Cria a serie de Fibonacci utilizando ArrayList
	 * 
	 * @param quantidade de elementos da serie
	 * @return um arrayList de inteiros com a serie de Fibonacci.
	 */
	public static ArrayList<Integer> criarSerieFibonacciComArray(int quantidade) {
		ArrayList<Integer> fibonacci = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {
			if (i == 0 || i == 1) {
				fibonacci.add(1);
			} else {
				fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
			}

		}
		return fibonacci;
	}

	/**
	 * Cria a soma dos elementos pares de uma lista.
	 * 
	 * @param tamanhoVetor
	 * @return
	 */
	public static Integer produtorioNumerosPares(int tamanhoVetor) {
		List<Integer> vetor = criarVetorInteiro(tamanhoVetor);
		Integer n = 0, soma = 0;
		for (int i = 0; i < tamanhoVetor; i++) {
			if (vetor.get(i) > 0) {
				if (vetor.get(i) % 2 == 0) {
					n = vetor.get(i);
					soma += n;
				}
			}
		}
		return soma;
	}

	/**
	 * Ordena a lista do menor para o maior elemento
	 * 
	 * @param tamanhoVetor
	 * @return
	 */
	public static List<Double> ordenaMaior(int tamanhoVetor) {
		List<Double> vetor = criarVetorDecimal(tamanhoVetor);
		Collections.sort(vetor);

		return vetor;
	}

	/**
	 * Retorna o vator com 
	 * @param tamanhoVetor
	 * @return
	 */
	public static List<Double> analiseVetor(int tamanhoVetor) {
		List<Double> vetorA = criarVetorDecimal(tamanhoVetor);
		List<Double> vetorB = new ArrayList<>();
		Double maiorElemento = 0.0, menorElemento = 0.0, soma = 0.0, media = 0.0;

		for (int i = 0; i < tamanhoVetor; i++) {
			maiorElemento = vetorA.get(i).MAX_VALUE;
			menorElemento = vetorA.get(i).MIN_VALUE;
			soma += vetorA.get(i);
		}
		media = soma / tamanhoVetor;
		vetorB.add(maiorElemento);
		vetorB.add(menorElemento);
		vetorB.add(soma);
		vetorB.add(media);

		return vetorB;
	}
}
