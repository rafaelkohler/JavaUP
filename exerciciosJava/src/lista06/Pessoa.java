package lista06;

public class Pessoa {

	private String nome;

	private String telefone;

	private Integer matricula;

	public Pessoa(String nome, String telefone, Integer matricula) throws Exception {
		setNome(nome);
		setTelefone(telefone);
		setMatricula(matricula);

		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if (nome == null || nome.isEmpty() || nome.length() < 5) {
			throw new Exception("O nome não pode ser null, vazio ou conter menos de 5 caracteres.");
		}
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws Exception {
		if (telefone == null || telefone.isEmpty() || telefone.length() != 10) {
			throw new Exception("O telefone não pode ser null ou vazio e deve ter exatamente 10 caracteres");
		}
		this.telefone = telefone;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) throws Exception {
		if (matricula < 0) {
			throw new Exception("A matricula não pode ser um número negativo");
		}
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nMatricula: " + this.matricula;
	}

}
