package lista06;

/** 
 * Classe que representa uma revista
 * @author Rafael Kohler
 *
 */
public class Revista extends PublicacaoImpressa {
	
	private int edicao;
	
	private String materiaDaCapa;
	
	private int numeroDePaginas;

	public Revista(int codigo, String titulo, String editora, String ano, int edicao, String materiaDaCapa, int numeroDePaginas) {
		super(codigo, titulo, editora, ano);
		this.edicao = edicao;
		this.materiaDaCapa = materiaDaCapa;
		this.numeroDePaginas = numeroDePaginas;
	}


}
