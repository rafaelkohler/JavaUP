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
	 * ex002 - Método responsável por montar um vetor e mostrar o maior elemento deste
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
	 * ex003 - Método responsável por montar um vetor e mostrar o menor elemento deste
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

	/**
	 * ex004 - étodo responsável por montar a lista inversa
	 * @param tamanhoVetor Recebe como parâmetro o tamanho do vetor que será criado
	 * @return Retorna a lista inversa utilizando a Classe Collections com o método reverse.
	 */
	public static List<Integer> vetorInverso(int tamanhoVetor) {
		List<Integer> vetor = criarVetorInteiro(tamanhoVetor);
		System.out.println("O vetor original é: " + vetor);
		
		Collections.reverse(vetor);
		return vetor;
	}
	
	/**
	 * ex005 - Método para montar duas listas e multiplicar seus valores.
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
			double valor = (vetor1.get(i) * vetor2.get(i));
			vetor3.add(valor);
		}
		return vetor3 ;
	}
	
	/**
	 * ex006 - Método responsável por calcular o produto escalável de dois vetores.
	 * @param tamanhoVetor
	 * @return retorna um número inteiro com a soma da multiplicação dos dois vetores.
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
	
	


}