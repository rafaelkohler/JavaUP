package lista06;

public class Aluno extends Pessoa {

	private String curso;

	private Turno turno;

	public Aluno(String nome, String telefone, Integer matricula, String curso, Turno turno) throws Exception {
		super(nome, telefone, matricula);
		setCurso(curso);
		setTurno(turno);

		this.curso = curso;
		this.turno = turno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) throws Exception {
		if (curso == null || curso.isEmpty()) {
			throw new Exception("O curso não pode ser null ou vazio");
		}
		this.curso = curso;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) throws Exception {
		if (turno.getKey() == null) {
			throw new Exception("O Turno só pode assumir os valores matutino, vespertino ou noturno");
		}
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString() +  "\nCurso: " + this.curso + "\nTurno: " + this.turno;
	}

}
