package lista06;

public class Contato {

	private int codigo;

	private String nome;

	private String telefone;

	public Contato(int codigo, String nome, String telefone) throws Exception {
		setCodigo(codigo);
		setNome(nome);
		setTelefone(telefone);

		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) throws Exception {
		if (codigo < 1) {
			throw new Exception("O código não pode ser inferior a 1.");
		}
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if (nome == null || nome.isEmpty()) {
			throw new Exception("O nome não pode ser nulo ou branco.");
		}
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws Exception {
		if (telefone == null || telefone.length() < 8) {
			throw new Exception("O telefone não pode ser nulo ou conter menos de 8 caracteres.");
		}
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "[" + "Codigo: " + this.codigo + ", Nome: " + this.nome + ", Telefone: " + this.telefone + "]";
	}

}
