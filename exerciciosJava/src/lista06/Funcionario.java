package lista06;

public class Funcionario extends Pessoa {

	private String setor;
	
	private Double salario;

	public Funcionario(String nome, String telefone, Integer matricula, String setor, Double salario) throws Exception {
		super(nome, telefone, matricula);
		this.setor = setor;
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
