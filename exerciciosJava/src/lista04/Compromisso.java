package lista04;

/**
 * Representa um compromisso medico
 * @author Rafael Kohler
 *
 */
public class Compromisso {

	private String data;

	private String hora;

	private String medico;

	private Paciente paciente;

	public Compromisso(String data, String hora, String medico, Paciente paciente) {
		this.data = data;
		this.hora = hora;
		this.medico = medico;
		this.paciente = paciente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "Consulta marcada com " + this.medico + ", dia " + this.data + ", às " + this.hora + ". " + this.paciente;
	}

}
