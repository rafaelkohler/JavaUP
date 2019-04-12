package herancaEmpregado;

import java.util.Date;

/**
 * Classe que representa {@link EmpregadoMensal}
 * @author Rafael Kohler
 *
 */
public class EmpregadoMensal extends Empregado {

	private Double salario;
	
	/**
	 * Construtor vazio
	 */
	public EmpregadoMensal() {
		
	}
	
	/**
	 * Contrutor com todos os atributos da classe Pai
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 */
	public EmpregadoMensal(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salario) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public Double getValorAPagar() {
		return this.salario;
	}

}
