package lista02;

import java.util.ArrayList;
import java.util.Arrays;
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

		int aleatorio = (int) (Math.random() * 100); // Math.random() retorna um inteiro, fazendo um casting ele tira a
														// parte decimal.
		System.out.println(aleatorio);

		int[] idades = new int[aleatorio]; // cria um array de tamanho aleat�rio

		for (int i = 0; i < idades.length; i++) { // uma l�gica com o �ndice da lista - for usado com o �ndice, voc�
													// pega o valor do array atrav�s do �ndice
			idades[i] = (int) (Math.random() * 100);
		}

		for (int idade : idades) { // l�gica somente com os resultados - for usado sem �ndice, voc� pega o valor do
									// array se preocupa somente com o conte�do do array.
			System.out.println(idade);
		}

		for (int i = 0; i < idades.length; i++) { // for usado com o �ndice, voc� pega o valor do array atrav�s do
													// �ndice
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
	 * Estudo de cole��es de ArrayList
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
	 * M�todo para criar um vetor de valores inteiros
	 * 
	 * @param tamanhoVetor
	 * @return
	 */
	public static List<Integer> criarVetorInteiro(int tamanhoVetor) {
		List<Integer> vetor = new ArrayList<Integer>();
		for (int i = 0; i < tamanhoVetor; i++) {
			int numero = Console.recuperaInteiro("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor.add(numero);
		}
		return vetor;
	}

	/**
	 * M�todo para criar um vetor de valores decimais
	 * 
	 * @param tamanhoVetor
	 * @return
	 */
	private static List<Double> criarVetorDecimal(int tamanhoVetor) {
		List<Double> vetor = new ArrayList<Double>();
		for (int i = 0; i < tamanhoVetor; i++) {
			Double numero = Console.recuperaDecimal("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor.add(numero);
		}
		return vetor;
	}

	/**
	 * ex001 - M�todo respons�vel por montar uma lista de n�meros inteiros.
	 * 
	 * @param tamanhoVetor recebe como par�metro o tamanho do vetor
	 * @return Lista de n�meros inteiros.
	 */
	public static List<Integer> mostraVetor(int tamanhoVetor) {
		return criarVetorInteiro(tamanhoVetor);
	}

	/**
	 * ex002 - M�todo respons�vel por montar um vetor e mostrar o maior elemento
	 * deste vetor.
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
	 * ex003 - M�todo respons�vel por montar um vetor e mostrar o menor elemento
	 * deste vetor.
	 * 
	 * @param tamanhoVetor O m�todo recebe como par�metro o tamanho do vetor.
	 * @return O menor elemento do vetor.
	 */
	public static int menorElemento(int tamanhoVetor) {
		List<Integer> vetor = criarVetorInteiro(tamanhoVetor);
		Integer menor = Collections.min(vetor);
		Integer posicao = vetor.indexOf(Collections.min(vetor));

		System.out.println("Este � o vetor de n�meros inteiros " + vetor);
		System.out.println("O menor valor �? " + menor);
		return posicao + 1;
	}

	/**
	 * ex004 - �todo respons�vel por montar a lista inversa
	 * 
	 * @param tamanhoVetor Recebe como par�metro o tamanho do vetor que ser� criado
	 * @return Retorna a lista inversa utilizando a Classe Collections com o m�todo
	 *         reverse.
	 */
	public static List<Integer> vetorInverso(int tamanhoVetor) {
		List<Integer> vetor = criarVetorInteiro(tamanhoVetor);
		System.out.println("O vetor original �: " + vetor);

		Collections.reverse(vetor);
		return vetor;
	}

	/**
	 * ex005 - M�todo para montar duas listas e multiplicar seus valores.
	 * 
	 * @param tamanhoVetor
	 * @return retorna a lista multiplicada
	 */
	public static List<Double> multiplicarVetor(int tamanhoVetor) {
		List<Double> vetor1 = new ArrayList<Double>();
		List<Double> vetor2 = new ArrayList<Double>();
		List<Double> vetor3 = new ArrayList<Double>();
		for (int i = 0; i < tamanhoVetor; i++) {
			Double numero = Console.recuperaDecimal("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor1.add(numero);
		}
		for (int i = 0; i < tamanhoVetor; i++) {
			Double numero = Console.recuperaDecimal("Digite um valor para o vetor na posi��o " + (i + 1));
			vetor2.add(numero);
		}

		for (int i = 0; i < tamanhoVetor; i++) {
			Double valor = (vetor1.get(i) * vetor2.get(i));
			vetor3.add(valor);
		}
		return vetor3;
	}

	/**
	 * ex006 - M�todo respons�vel por calcular o produto escal�vel de dois vetores.
	 * 
	 * @param tamanhoVetor
	 * @return retorna um n�mero inteiro com a soma da multiplica��o dos dois
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
	 * Retorna o vetor com menor elemento
	 * 
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

	/**
	 * ex012 Mostra os elementos repetidos e a quantidade de elementos repetidos
	 * 
	 * @param vetor        valores a serem verificados
	 * @param tamanhoVetor
	 * @return um conjunto de valores do tipo int[] com dois valores a saber: index
	 *         0 eh o elemento que repetiu, index 1 eh a quantidade de repeticoes.
	 */
	public static int[][] verificarElementosRepetidos(int[] valores) {
		// {0, 8, 5, 4, 7, 0, 6, 3, 4, 0, 7}
		int[] avaliados = new int[0];
		int[][] repetidos = new int[0][2];
		for (int i = 0; i < valores.length; i++) {
			// Tenho que guardar que o zero ja foi avaliado.
			int paraAvaliar = valores[i];
			if (precisaAvaliar(avaliados, paraAvaliar)) {
				avaliados = adicionarValorNoVetor(avaliados, paraAvaliar);
				int[] repeticoes = contarRepeticoes(valores, paraAvaliar);
				if (repeticoes != null) {
					repetidos = adicionarRepetidos(repetidos, repeticoes);
				}
			}
		}
		return repetidos;
	}

	/**
	 * Adiciona um valor na ultima posicao, aumento o vetor de
	 * 
	 * @param vetor com os valores atuais
	 * @param valor valor a ser inserido no vetor
	 * @return um novo vetor com tamanho +1 e com o valor na ultima posicao
	 */
	private static int[] adicionarValorNoVetor(int[] vetor, int valor) {
		int[] novo = new int[vetor.length + 1];
		for (int i = 0; i < vetor.length; i++) {
			novo[i] = vetor[i];
		}
		novo[novo.length - 1] = valor;
		return novo;
	}

	/**
	 * Verifica se um valor ja foi avaliado
	 * 
	 * @param avaliados   valores que ja foram avaliados
	 * @param paraAvaliar o valor novo questionado
	 * @return TRUE para tem que avaliar, FALSE para nao precisa avaliar
	 */
	private static boolean precisaAvaliar(int[] avaliados, int paraAvaliar) {
		for (int i = 0; i < avaliados.length; i++) {
			if (avaliados[i] == paraAvaliar) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Contabiliza a quantidade de ocorrencias de um valor no vetor de de valores
	 * 
	 * @param valores     a serem avaliados
	 * @param paraAvaliar o valor a ser encontrado e contabilizado em repeticoes.
	 * @return vetor int[] com dois valores, a saber: index 0 eh a quantidade de
	 *         repeticoes e o index 1 eh o valor avaliado.
	 */
	private static int[] contarRepeticoes(int[] valores, int paraAvaliar) {
		int repeticoes = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == paraAvaliar) {
				repeticoes++;
			}
		}
		if (repeticoes < 2) {
			return null;
		} else {
			int[] ocorrenciasCurto = { repeticoes, paraAvaliar };
//			int[] ocorrencias = new int[2];
//			ocorrencias[0] = repeticoes;
//			ocorrencias[1] = paraAvaliar;
			return ocorrenciasCurto;
		}
	}

	/**
	 * Adiciona um par de repeticoes no Vetor de repetidos
	 * 
	 * @param repetidos  Array de repetidos
	 * @param repeticoes representa um par de quantidade e valor repetido
	 * @return um novo vetor com o valor repetido adicionado ao final.
	 */
	private static int[][] adicionarRepetidos(int[][] repetidos, int[] repeticoes) {
		int[][] novo = new int[repetidos.length + 1][2];
		for (int i = 0; i < repetidos.length; i++) {
			novo[i] = repetidos[i];
		}
		novo[novo.length - 1] = repeticoes;
		return novo;
	}
	
	/**
	 * Metodo com ArrayList
	 * @param valores
	 * @return
	 */
	public static ArrayList<ArrayList<Integer>> verificarElementosRepetidosArray(int tamanho) {
		List<Integer> valores = criarVetorInteiro(tamanho);
		ArrayList<Integer> avaliados = new ArrayList<>();
		ArrayList<ArrayList<Integer>> repetidos = new ArrayList<>();
		
		for (int i = 0; i < valores.size(); i++) {
			int paraAvaliar = valores.get(i);
			if(!avaliados.contains(paraAvaliar)) {
				avaliados.add(paraAvaliar);
				int[] repeticoes = contarRepeticoesArray(valores, paraAvaliar);
				if(repeticoes != null) {
					ArrayList<Integer> repeticoesArray = new ArrayList<>();
					for (int j = 0; j < repeticoes.length; j++) {
						repeticoesArray.add(repeticoes[j]);
					}
					repetidos.add(repeticoesArray);
				}
			}
		}
		
		return repetidos;
	}
	
	private static int[] contarRepeticoesArray(List<Integer> valores, int paraAvaliar) {
		int repeticoes = 0;
		for (int i = 0; i < valores.size(); i++) {
			if (valores.get(i) == paraAvaliar) {
				repeticoes++;
			}
		}
		if (repeticoes < 2) {
			return null;
		} else {
			int[] ocorrenciasCurto = { repeticoes, paraAvaliar };
//			int[] ocorrencias = new int[2];
//			ocorrencias[0] = repeticoes;
//			ocorrencias[1] = paraAvaliar;
			return ocorrenciasCurto;
		}
	}

	// [[0,1,2][0][0,1]]
}
