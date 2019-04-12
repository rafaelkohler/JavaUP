package herancaEmpregado;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
	
	public static void main(String[] args) {
		
		EmpregadoMensal empMensal = new EmpregadoMensal("Lidia", new Date(), 
				"lidia@uol.com", "41 999998888", new Date(), null, "789456", 8574.23d);
		
		EmpregadoHorista empHorista = new EmpregadoHorista("Carlos", new Date(), "carlos@gmail.com", "41 988884455", new Date(), null, "12345", 75.62, 44);
		
		ArrayList<Empregado> empregados = new ArrayList<>();
		empregados.add(empMensal);
		empregados.add(empHorista);
		
		FolhaPagamento pagamento = new FolhaPagamento();
		pagamento.imprimirFolhaEmpregado(empregados);
	}

}
