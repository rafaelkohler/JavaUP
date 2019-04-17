package lista06;

import java.util.ArrayList;

public class Professor extends Funcionario {

	private RegimeDeTrabalho regimeDeTrabalho;

	private ArrayList<String> disciplinas;

	public Professor(String nome, String telefone, Integer matricula, String setor, Double salario, RegimeDeTrabalho regimeTrabalho, ArrayList<String> disciplinas) throws Exception {
		super(nome, telefone, matricula, setor, salario);
		setRegimeDeTrabalho(regimeTrabalho);
		setDisciplinas(disciplinas);
		
		this.regimeDeTrabalho = regimeTrabalho;
		this.disciplinas = disciplinas;
	}

	public RegimeDeTrabalho getRegimeDeTrabalho() {
		return regimeDeTrabalho;
	}

	public void setRegimeDeTrabalho(RegimeDeTrabalho regimeDeTrabalho) throws Exception {
		if (regimeDeTrabalho == null) {
			throw new Exception("O Regime de trabalho só pode assumir os valores horista, integral ou parcial");
		}
		this.regimeDeTrabalho = regimeDeTrabalho;
	}

	public ArrayList<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<String> disciplinas) throws Exception {
		if (disciplinas == null || disciplinas.isEmpty()) {
			throw new Exception("não pode ser null ou vazia");
		}
		this.disciplinas = disciplinas;
	}
	
	public Double getValorAPagar() {
		return 0d;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRegime de trabalho: " + this.regimeDeTrabalho + "\nDisciplinas: " + this.disciplinas;
	}
}
