package lista06;

public class Aluno extends Pessoa {

	private String curso;
	
	private String turno;


	public Aluno(String nome, String telefone, Integer matricula, String curso, String turno) throws Exception {
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
		if(curso == null || curso.isEmpty()) {
			throw new Exception("O curso não pode ser null ou “”");
		}
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) throws Exception {
		if(turno == null) {
			throw new Exception("O Turno só pode assumir os valores matutino, vespertino ou noturno");
		}
		this.turno = turno;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
