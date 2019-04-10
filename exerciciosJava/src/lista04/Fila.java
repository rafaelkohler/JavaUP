package lista04;

/**
 * Representa a fila de atendimento de {@link Paciente}
 * 
 * @author Rafael Kohler
 *
 */
public class Fila {

	private Nodo head;

	public Fila() {

	}

	/**
	 * Adiciona um primeiro elemento na Fila
	 * 
	 * @param paciente
	 */
	public void enqueue(Paciente paciente) {
		if (this.head == null) {
			Nodo primeiroNodo = new Nodo(paciente);
			this.head = primeiroNodo;
		} else {
			Nodo atual = this.head;
			while (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			atual.setProximo(new Nodo(paciente));
		}
	}

	/**
	 * Remove o primeiro elemento da fila
	 * 
	 * @return
	 */
	public Paciente dequeue() {
		if (this.head == null) {
			return null;
		} else {
			Paciente paciente = this.head.getPaciente();
			this.head = this.head.getProximo();
			return paciente;
		}
	}

	@Override
	public String toString() {
		if (this.head == null) {
			return "";
		} else {
			String retorno = "";
			Nodo atual = this.head;
			while (atual.getProximo() != null) {
				retorno += atual.getPaciente() + "\n";
				atual = atual.getProximo();
			}
			return retorno;
		}
	}
}
