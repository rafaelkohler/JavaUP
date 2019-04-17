package lista06;

public enum Turno {

	MANHA("Manhã", 1), 
	TARDE("Tarde", 2), 
	NOITE("Noite", 3);
	
	private String turno;
	private int key;
	
	private Turno(String turno, int key){
		this.turno = turno;
		this.key = key;
	}
	
	public String getTurno() {
		return this.turno;
	}
	
	public Integer getKey() {
		return this.key;
	}
	
	public static String[] getTurnos() {
		String[] turnos = new String[Turno.values().length];
		for (int i = 0; i < Turno.values().length; i++) {
			turnos[i] = Turno.values()[i].getTurno();
		}
		return turnos;
	}

}
