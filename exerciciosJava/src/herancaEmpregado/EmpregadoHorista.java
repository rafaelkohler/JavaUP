package herancaEmpregado;

import java.util.Date;

/**
 * Classe que representa {@link EmpregadoHorista}
 * @author Rafael Kohler
 *
 */
public class EmpregadoHorista extends Empregado {

	private Double salarioPorHora;

	private Integer quantidadeHoras;

	/**
	 * Contrutor com todos os atributos da classe Pai
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 * @param salarioPorHora
	 * @param quantidadeHoras
	 */
	public EmpregadoHorista(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salarioPorHora, Integer quantidadeHoras) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		this.salarioPorHora = salarioPorHora;
		this.quantidadeHoras = quantidadeHoras;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(Double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public int getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	
	@Override
	public Double getValorAPagar() {
		return this.salarioPorHora * this.quantidadeHoras;
	}

}
