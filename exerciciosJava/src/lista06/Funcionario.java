package lista06;

public class Funcionario extends Pessoa {

	private String setor;

	private Double salario;

	public Funcionario(String nome, String telefone, Integer matricula, String setor, Double salario) throws Exception {
		super(nome, telefone, matricula);
		setSetor(setor);
		setSalario(salario);

		this.setor = setor;
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) throws Exception {
		if (setor == null || setor.isEmpty()) {
			throw new Exception("Os valores não podem ser null ou vazio");
		}
		this.setor = setor;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) throws Exception {
		if (salario < 1000 || salario > 20000) {
			throw new Exception("Os valores de salário só podem assumir valores entre R$1.000,00 e R$20.000,00");
		}
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSetor: " + this.setor + "\nSalário: R$ " + this.salario;
	}

}
