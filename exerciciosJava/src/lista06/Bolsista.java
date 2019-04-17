package lista06;

public class Bolsista extends Aluno {

	private String projeto;
	
	private String orientador;
	
	public Bolsista(String nome, String telefone, Integer matricula, String curso, Turno turno, String projeto, String orientador) throws Exception {
		super(nome, telefone, matricula, curso, turno);
		setProjeto(projeto);
		setOrientador(orientador);
		
		this.projeto = projeto;
		this.orientador = orientador;

	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) throws Exception {
		if(projeto == null || projeto.isEmpty()) {
			throw new Exception("O projeto não pode ser null ou vazio");
		}
		this.projeto = projeto;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) throws Exception {
		if(orientador == null || orientador.isEmpty()) {
			throw new Exception("O projeto não pode ser null ou vazio");
		}
		this.orientador = orientador;
	}
	
	@Override
	public String toString() {
		return super.toString() +  "\nProjeto: " + this.projeto + "\nOrientador: " + this.orientador;
	}
}
