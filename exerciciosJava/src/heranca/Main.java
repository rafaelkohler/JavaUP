package heranca;

import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente();
		paciente.setCodigo("123");
		paciente.setNome("Joao");
		
		PacienteSUS pacienteSUS = new PacienteSUS();
		pacienteSUS.setCodigo("987");
		pacienteSUS.setNome("Rafael");
		pacienteSUS.setCodigoSUS("Aj78");
		
		ArrayList<Paciente> pacientes = new ArrayList<>();
		pacientes.add(paciente);
		pacientes.add(pacienteSUS);
		
		Object obj = new Object();
		
		
		for (Paciente aux : pacientes) {
			System.out.println(aux);
		}
	}
}
