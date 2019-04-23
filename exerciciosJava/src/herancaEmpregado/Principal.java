package herancaEmpregado;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
	
	public static void main(String[] args) {
		
		EmpregadoMensal empMensal = new EmpregadoMensal("Ana", new Date(), 
				"lidia@uol.com", "41 999998888", new Date(), null, "789456", 8574.23d);
		
		EmpregadoHorista empHorista = new EmpregadoHorista("Carlos", new Date(), "carlos@gmail.com", "41 988884455", new Date(), null, "12345", 75.62, 44);
		
		EmpregadoProdutividade rafael = new EmpregadoProdutividade("Rafael", new Date(), "r@gmail.com", "41 123456789", new Date(), null, "23456", 10000.00, 1.8);
		
		ArrayList<Empregado> empregados = new ArrayList<>();
		empregados.add(empMensal);
		empregados.add(empHorista);
		empregados.add(rafael);
		
		FolhaPagamento pagamento = new FolhaPagamento();
		pagamento.imprimirFolhaEmpregado(empregados);
	}

}
