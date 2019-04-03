package lista04;

/**
 * Classe para representar um ponto no plano cartesiano.
 * @author Rafael Kohler
 *
 */
public class Ponto {

	private Double x;
	
	private Double y;

	/**
	 * Cria um ponto na origem (0, 0)
	 */
	public Ponto() {
		this.x = 0d;
		this.y = 0d;
	}
	
	public Ponto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
	
	/**
	 * Calcula a distancia do ponto atual ate as coordenadas informadas.
	 * @param x
	 * @param y
	 * @return a distancia
	 */
	public Double distancia(Double x, Double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
	
	/**
	 * Calcula a distancia do ponto atual ate outro ponto informado
	 * @param ponto
	 * @return a distancia
	 */
	public Double distancia(Ponto ponto) {
		return distancia(ponto.getX(), ponto.getY());
	}
}
