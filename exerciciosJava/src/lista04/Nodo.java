package lista04;

public class Nodo {
	
	/** 
	 * Representa uma posicao na {@link Fila}.
	 */
	private Paciente paciente;
	
	private Nodo proximo;

	public Nodo(Paciente paciente) {
		this.paciente = paciente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	
	
	
}
