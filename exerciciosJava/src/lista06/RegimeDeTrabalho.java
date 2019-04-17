package lista06;

public enum RegimeDeTrabalho {
	
	HORISTA("Horista", 1),
	INTEGRAL("Integral", 2),
	PARCIAL("Parcial", 3);
	
	private String descricao;
	private int key;
	
	private RegimeDeTrabalho(String descricao, int key){
		this.descricao = descricao;
		this.key = key;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public Integer getKey() {
		return this.key;
	}
	
	public static String[] getRegimeDeTrabalho() {
		String[] regimes = new String[RegimeDeTrabalho.values().length];
		for (int i = 0; i < RegimeDeTrabalho.values().length; i++) {
			regimes[i] = RegimeDeTrabalho.values()[i].getDescricao();
		}
		return regimes;
	}
}
