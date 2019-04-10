package lista04;

import java.util.ArrayList;

/**
 * Representa uma pilha de {@link Livro}
 * 
 * @author Rafael Kohler
 *
 */
public class Pilha {

	private ArrayList<Livro> pilhaDeLivros;

	private Integer topo;

	public Pilha() {
		this.topo = 5;
		this.pilhaDeLivros = new ArrayList<Livro>();
	}

	/**
	 * Verifica se a pilha esta cheia
	 * 
	 * @return
	 */
	public boolean cheia() {
		return this.topo == this.pilhaDeLivros.size();
	}

	/**
	 * Verifica se a pilha esta vazia
	 * 
	 * @return
	 */
	public boolean vazia() {
		return this.pilhaDeLivros.size() == 0;
	}

	/**
	 * Adiciona um Livro na Pilha
	 * 
	 * @param livro
	 */
	public void push(Livro livro) {
		if (!cheia()) {

		}
		this.pilhaDeLivros.add(livro);
	}

	/**
	 * Retorna a ultima posicao de um ArrayList
	 * @return
	 */
	private int indiceDoTopo() {
		return this.pilhaDeLivros.size() - 1;
	}
	/**
	 * Remove o ultimo Livro da Pilha
	 * 
	 * @return
	 */
	public Livro pop() {
		if (vazia()) {
			return null;
		} else {
			return this.pilhaDeLivros.remove(indiceDoTopo());
		}
	}

	/**
	 * Retorna o Livro do topoda Pilha
	 * 
	 * @return
	 */
	public Livro peek() {
		if (vazia()) {
			return null;
		} else {
			return this.pilhaDeLivros.get(indiceDoTopo());
		}
	}

	@Override
	public String toString() {
		String retorno = "";
		for (int i = indiceDoTopo(); i >= 0; i--) {
			retorno += this.pilhaDeLivros.get(i) + "\n\n";
		}
		return retorno;
	}
}
