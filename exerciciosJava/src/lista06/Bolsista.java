package lista06;

public class Bolsista extends Pessoa {

	private String projeto;
	
	private String orientador;
	
	public Bolsista(String nome, String telefone, Integer matricula, String projeto, String orientador) throws Exception {
		super(nome, telefone, matricula);
		this.projeto = projeto;
		this.orientador = orientador;
	}
	
	
	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
