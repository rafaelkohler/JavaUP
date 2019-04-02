package lista04;

public class Ponto {

	private double x;
	
	private double y;

	public Ponto() {
		
	}
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}



	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distancia(double x, double y) {
		return Math.pow((x - y), 2);
	}
	
	public double distancia(Ponto p) {
		double ponto = 0;
		return ponto;
	}
	
	public static double calcularDistancia(Ponto ponto1, Ponto ponto2) {
		return Math.sqrt(Math.pow((ponto2.x - ponto1.x), 2) + Math.pow((ponto2.y - ponto1.y), 2));
	}
	
}
