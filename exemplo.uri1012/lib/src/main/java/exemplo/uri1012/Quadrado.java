/*
 * Direitos Autorais, 2021, Gabriel Menin.
 */

package exemplo.uri1012;

/**
 * A classe <code>Quadrado<code> representa um quadrado com lado.
 * 
 * @author Gabriel
 *
 */

public class Quadrado {
	
	private double lado;
	
	/**
	 * Cria um quadrado com lado <code>lado</code>.
	 * 
	 * @param lado o lado do novo quadrado
	 * @throws IllegalArgumentException
	 * 			Quando o valor do lado é menor ou igual a zero.
	 */
	
	public Quadrado(double lado) {
		super();
		if (lado <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.lado = lado;
	}
	
	/**
	 * @return the area
	 */
	public double getArea() {
		return Math.pow(lado, 2);
	}
	
}
