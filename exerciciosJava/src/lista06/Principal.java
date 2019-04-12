package lista06;

public class Principal {

	public static void main(String[] args) throws Exception {

		String[] opcoes = { "Cenario 001" };

		boolean continua = true;

		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 006", null);

			switch (opcao) {
			case 1:
				Contato pessoal = new Pessoal(123, "Rafael", "30026549", "999449784");
				Comercial comercial = new Comercial(0, "Jose", "30154857", "Qualquer");

				System.out.println(pessoal);
				System.out.println();
				System.out.println(comercial);
				break;

			case 2:
				
				break;
			}

		} while (continua);

	}
}
