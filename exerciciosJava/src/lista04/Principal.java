package lista04;

import java.util.ArrayList;

/**
 * Classe para executar os exercícios da lista 004.
 * @author Rafael Kohler
 *
 */
public class Principal {

	public static void main(String[] args) {
		
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

	}
}
