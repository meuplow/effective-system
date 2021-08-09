/*
 * Direitos Autorais, 2021, Gabriel Menin.
 */

package exemplo.uri1012;

import java.util.Scanner;

/**
 * 
 * @author Gabriel
 *
 */

public class Main {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner entrada;
		double a;
		double b;
		double c;
		Triangulo triangulo1;
		Circulo circulo1;
		Quadrado quadrado1;
		Retangulo retangulo1;
		Trapezio trapezio1;
		
		entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		entrada.close();
		
		triangulo1 = new Triangulo(a, c);
		circulo1 = new Circulo(c);
		trapezio1 = new Trapezio(a, b, c);
		quadrado1 = new Quadrado(b);
		retangulo1 = new Retangulo(a, b);
		
		
		System.out.printf("TRIANGULO: %2.3f\n", triangulo1.getArea());
		System.out.printf("CIRCULO: %2.3f\n", circulo1.getArea());
		System.out.printf("TRAPEZIO: %2.3f\n", trapezio1.getArea());
		System.out.printf("QUADRADO: %2.3f\n", quadrado1.getArea());
		System.out.printf("RETANGULO: %2.3f\n", retangulo1.getArea());
	}

}
