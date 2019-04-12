package lista06;

public class Pessoal extends Contato {

	private String celular;
	
	public Pessoal(int codigo, String nome, String telefone, String celular) throws Exception {
		super(codigo, nome, telefone);
		setCelular(celular);
		this.celular = celular;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) throws Exception {
		if (celular == null || celular.length() < 8) {
			throw new Exception("O celular não pode ser nulo ou conter menos de 8 caracteres.");
		}
		this.celular = celular;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[" + "Celular: " + this.celular + "]";
	}
	
}
