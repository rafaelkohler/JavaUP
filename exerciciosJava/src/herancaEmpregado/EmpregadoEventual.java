package herancaEmpregado;

import java.util.Date;

/**
 * Classe que representa {@link EmpregadoEventual}
 * @author Rafael Kohler
 *
 */
public class EmpregadoEventual extends Empregado {

	private Double valorContratado;

	/**
	 * Contrutor com todos os atributos da classe Pai
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 * @param valorContrato
	 */
	public EmpregadoEventual(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double valorContratado) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		this.valorContratado = valorContratado;
	}

	public Double getValorContrato() {
		return valorContratado;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContratado = valorContrato;
	}
	
	@Override
	public Double getValorAPagar() {
		return this.valorContratado;
	}

}
