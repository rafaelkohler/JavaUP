package herancaEmpregado;

import java.util.Date;

/**
 * Classe que representa um empregado por Produtividade
 * @author Rafael Kohler
 *
 */
public class EmpregadoProdutividade extends Empregado {

	private Double salarioBase;
	
	private Double produtividade;
	

	public EmpregadoProdutividade(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salarioBase, Double produtividade) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		this.salarioBase = salarioBase;
		this.produtividade = produtividade;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getProdutividade() {
		return produtividade;
	}

	public void setProdutividade(Double produtividade) {
		this.produtividade = produtividade;
	}

	@Override
	public Double getValorAPagar() {
		return this.salarioBase * this.produtividade;
	}
	
}
