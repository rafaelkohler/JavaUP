package heranca;

public class PacienteSUS extends Paciente {

	private String codigoSUS;
	
	public PacienteSUS() {
		
	}

	public String getCodigoSUS() {
		return codigoSUS;
	}

	public void setCodigoSUS(String codigoSUS) {
		this.codigoSUS = codigoSUS;
	}

	@Override
	public String toString() {
		return "Codigo do SUS: " + this.codigoSUS;
	}
}
