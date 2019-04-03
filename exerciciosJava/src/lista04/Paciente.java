package lista04;

import java.util.ArrayList;

/**
 * Classe para representar um paciente em um compromisso
 * @author Rafael Kohler
 *
 */
public class Paciente {

	private String codigo;
	
	private String nome;
	
	private ArrayList<String> doencas;

	public Paciente(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.doencas = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addHistorico(String doenca) {
//		if(this.doencas == null) {
//			this.doencas = new ArrayList<>();
//		}
		this.doencas.add(doenca);
	}
	
	public ArrayList<String> getHistorico() {
		return this.doencas;
	}
	
	@Override
	public String toString() {
		return "Paciente: "	+ this.nome + " de código " + this.codigo + " com histórico registrado de "	+ this.doencas + ".";
	}
}
