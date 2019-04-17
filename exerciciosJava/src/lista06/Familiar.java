package lista06;

public class Familiar extends Contato{
	
	private String grauParentesco;

	public Familiar(int codigo, String nome, String telefone, String grauDeParentesco) throws Exception {
		super(codigo, nome, telefone);
		this.grauParentesco = grauDeParentesco;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nGrau de parentesco familiar: " + this.grauParentesco;
	}

}
