package lista06;

import java.util.ArrayList;

public class Professor extends Pessoa {

	private String regimeDeTrabalho;

	private ArrayList<String> disciplinas;

	public Professor(String nome, String telefone, Integer matricula, String regimeDeTrabalho,
			ArrayList<String> disciplinas) throws Exception {
		super(nome, telefone, matricula);
		this.regimeDeTrabalho = regimeDeTrabalho;
		this.disciplinas = disciplinas;
	}

	public String getRegimeDeTrabalho() {
		return regimeDeTrabalho;
	}

	public void setRegimeDeTrabalho(String regimeDeTrabalho) {
		this.regimeDeTrabalho = regimeDeTrabalho;
	}

	public ArrayList<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
