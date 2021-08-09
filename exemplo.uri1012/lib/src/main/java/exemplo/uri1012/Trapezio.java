/*
 * Direitos Autorais, 2021, Gabriel Menin.
 */

package exemplo.uri1012;

/**
 * A classe <code>Trapezio<code> representa um trap�zio com bases e altura.
 * 
 * @author Gabriel
 *
 */

public class Trapezio {

	private double baseUm;
	private double baseDois;
	private double altura;
	
	/**
	 * Cria um trap�zio com base <code>baseUm</code> base <code>baseDois</code> e altura <code>altura</code>.
	 * 
	 * @param baseUm uma das bases do novo trap�zio
	 * 			baseDois uma das bases do novo trap�zio
	 * 			altura a altura do novo trap�zio
	 * @throws IllegalArgumentException
	 * 			Quando o valor da baseUm � menor ou igual a zero.
	 * 			Quando o valor da baseDois � menor ou igual a zero.
	 * 			Quando o valor da altura � menor ou igual a zero.
	 * 			Quando o valor da baseUm � igual ao da baseDois.
	 */
	
	public Trapezio(double baseUm, double baseDois, double altura) {
		super();
		if (baseUm <= 0.0) {
			throw new IllegalArgumentException();
		}else if(baseDois <= 0.0) {
			throw new IllegalArgumentException();
		}else if(altura <= 0.0) {
			throw new IllegalArgumentException();
		}else if(baseUm == baseDois) {
			throw new IllegalArgumentException();
		}
		this.baseUm = baseUm;
		this.baseDois = baseDois;
		this.altura = altura;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return ((baseDois+baseUm)*altura)/2;
	}
	
}
