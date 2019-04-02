package lista04;

import java.util.ArrayList;

/**
 * Classe para executar os exercícios da lista 004.
 * @author Rafael Kohler
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		/** 
		 * Exercicio001 da lista
		 */
		Livro livro01 = new Livro();
		livro01.setCodigo("1598FHK");
		livro01.setTitulo("Core Java 2");
		
		ArrayList<String> autoresLivro01 = new ArrayList<>();
		autoresLivro01.add("Cay S. Horstmann");
		autoresLivro01.add("Gary Cornell");
		
		livro01.setAutores(autoresLivro01);
		livro01.setIsbn("0130819336");
		livro01.setAno(1999);
		System.out.println("Livro 01:" + livro01);
		
		Livro livro02 = new Livro();
		livro02.setCodigo("9865PLO");
		livro02.setTitulo("Java, How to Program");
		
		ArrayList<String> autoresLivro02 = new ArrayList<>();
		autoresLivro02.add("Harvey Deitel");
		
		livro02.setAutores(autoresLivro02);
		livro02.setIsbn("0130341517");
		livro02.setAno(1999);
		System.out.println("\nLivro 02: " + livro02);
		
		
		/**
		 * Usando o contrutor para popular um objeto.
		 */
		ArrayList<String> autores = new ArrayList<>();
		autores.add("Kathy Sierra");
		autores.add("Bert Bates");
		Livro livro03 = new Livro("9865PLO", "Use a cabeça! Java", autores, "0138426846", 2003);

		System.out.println("\nLivro 03: " + livro03);
		System.out.println();
		
		
		
		/**
		 * Exercicio002 da lista
		 */
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto(2.0, 5.0);
		double distancia = Ponto.calcularDistancia(ponto1, ponto2);
		System.out.printf("%.2f\n", distancia);
		
		Ponto ponto3 = new Ponto(7.0, 2.0);
		double distancia2 = Ponto.calcularDistancia(ponto2, ponto3);
		System.out.printf("%.2f\n", distancia2);
		
		ponto1.setX(10.0);
		ponto1.setY(3.0);
		double distancia3 = Ponto.calcularDistancia(ponto1, ponto2);
		System.out.printf("%.2f\n", distancia3);
		

		Paciente p1 = new Paciente("00021", "Fulano da Silva");
		Paciente p2 = new Paciente("000171", "Ciclano dos Santos");
		p2.addHistorico("dor de cabeça");
		
		Compromisso c1 = new Compromisso("24/08/2005", "14h30min", "Beltrano Oliveira", p1);
		Compromisso c2 = new Compromisso("26/08/2005", "17h", "João Camargo", p2);
		
		System.out.println(c1);
		System.out.println(c2);

	}
}
