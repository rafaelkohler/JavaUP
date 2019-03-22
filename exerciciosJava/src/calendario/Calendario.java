package calendario;
import java.util.ArrayList;

public class Calendario {

	/**
	 * Metodo que verifica se um ano eh bissexto ou nao
	 * 
	 * @param ano
	 * @return um booleano se eh verdadeiro ou nao
	 */
	public static boolean isBissexto(int ano) {
		boolean bissexto = false;

		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			bissexto = true;
		}
		return bissexto;
	}

	/**
	 * Cria uma lista com os dias do mes e ano informado.
	 * 
	 * @param mes 
	 * @param ano
	 * @return Lista com os dias do mes
	 */
	public static ArrayList<Integer> diasMes(int mes, int ano) {
		ArrayList<Integer> dias = new ArrayList<Integer>();

		if (isBissexto(ano)) {
			if (mes == 2) {
				for (int i = 0; i < 30; i++) {
					dias.add(i);
				}
			} else if (mes == 2) {
				for (int i = 0; i < 29; i++) {
					dias.add(i);
				}
			}
		}

		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			for (int i = 0; i < 31; i++) {
				dias.add(i);
			}
		} else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12 ) {
			for (int i = 0; i < 32; i++) {
				dias.add(i);
			}
		}
		return dias;
	}
	
	/**
	 * Resolucao em sala de aula
	 * @param mes
	 * @param ano
	 * @return
	 */
	public static ArrayList<Integer> criarDiasMes (int mes, int ano){
		int quantidadeDias = 31;
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			quantidadeDias = 30;
		}
		
		if(mes == 2) {
			boolean eBissexto = isBissexto(ano);
			if(eBissexto) {
				quantidadeDias = 29;
			} else {
				quantidadeDias = 28;
			}
		}
		
		ArrayList<Integer> diasDoMes = new ArrayList<Integer>();
		for (int i = 1; i <= quantidadeDias; i++) {
			diasDoMes.add(i);
		}
		return diasDoMes;
	}
	
	/**
	 * 
	 * @param ano
	 * @return
	 */
	public static ArrayList<ArrayList<Integer>> criarCalendarioAnual(int ano) {
		
		ArrayList<ArrayList<Integer>> calendario = new ArrayList<>();
		
		for (int mes = 1; mes <= 12; mes++) {
			ArrayList<Integer> diasMes = criarDiasMes(mes, ano);
			calendario.add(diasMes);
		}
		return calendario;
	}
}
