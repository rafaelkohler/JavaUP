package lista04;

public class Paciente {

	private String codigo;
	
	private String nome;
	
	private String historico;

	public Paciente(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addHistorico(String doenca) {
		this.historico = doenca;
	}
	
	public String getHistorico() {
		return historico;
	}
	
	
}
