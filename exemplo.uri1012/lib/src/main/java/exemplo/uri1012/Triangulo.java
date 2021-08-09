/*
 * Direitos Autorais, 2021, Gabriel Menin.
 */

package exemplo.uri1012;

/**
 * A classe <code>Triangulo<code> representa um triângulo retângulo com base e altura.
 * 
 * @author Gabriel
 *
 */

public class Triangulo {
	
	private double base;
	private double altura;
	
	/**
	 * Cria um triângulo retângulo com base <code>base</code> e altura <code>altura</code>.
	 * 
	 * @param base a base do novo triângulo
	 * @param altura a altura do novo triângulo
	 * @throws IllegalArgumentException
	 * 			Quando o valor da base é menor ou igual a zero.
	 * 			Quando o valor da altura é menor ou igual a zero.
	 */
	
	public Triangulo(double base, double altura) {
		super();
		if (base <= 0.0) {
			throw new IllegalArgumentException();
		}else if(altura <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return (base*altura)/2;
	}
	
}
