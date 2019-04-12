package lista06;

public class Comercial extends Contato {

	private String empresa;
	
	public Comercial(int codigo, String nome, String telefone, String empresa) throws Exception {
		super(codigo, nome, telefone);
		setEmpresa(empresa);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) throws Exception {
		if(empresa == null || empresa.isEmpty()) {
			throw new Exception("A empresa não pode ser nula ou branca.");
		}
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return super.toString() + "[" + "Empresa: " + this.empresa + "]";
	}
	
}
