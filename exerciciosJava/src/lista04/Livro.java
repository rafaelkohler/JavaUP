package lista04;

import java.util.ArrayList;

/**
 * Classe para representar um Livro
 * @author 1810647
 *
 */
public class Livro {

	private String codigo;
	
	private String titulo;
	
	private ArrayList<String> autores;
	
	private String isbn;
	
	private Integer ano;
	
	public Livro(String codigo, String titulo, ArrayList<String> autores, String isbn, Integer ano) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autores = autores;
		this.isbn = isbn;
		this.ano = ano;
	}
	
	public Livro(){
		
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<String> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public void adicionarAutroes(String autor) {
		getAutores().add(autor);
	}
	
	@Override
	public String toString() {
		return "\nC�digo: " + getCodigo() + "\nT�tulo: " + getTitulo() + "\nAutor: " + getAutores() + "\nISBN: "
				+ getIsbn() + "\nAno: " + getAno();
	}
	
}
