package lista06;

/**
 * Classe que representa um livro
 * @author Rafael Kohler
 *
 */
public class Livro extends PublicacaoImpressa {

	private String autor;
	
	private int isbn;
	
	public Livro(int codigo, String titulo, String editora, String ano, String autor, int isbn) {
		super(codigo, titulo, editora, ano);
		this.autor = autor;
		this.isbn = isbn;
	}
	
	

}
