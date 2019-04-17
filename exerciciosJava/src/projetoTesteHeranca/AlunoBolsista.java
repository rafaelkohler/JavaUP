package projetoTesteHeranca;

public class AlunoBolsista extends Aluno {
	
	public Double getSalario() {
		return 1000.00;
	}
	
	@Override
	public String toString() {
		return "Bolsista";
	}

}
