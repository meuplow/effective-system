package exemplo.uri1012;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	public void test2() {
		Circulo c1 = new Circulo(2.00);
		double expected = 12.566;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void test100Dot64() {
		Circulo c1 = new Circulo(100.64);
		double expected = 31819.310;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void test150() {
		Circulo c1 = new Circulo(150.00);
		double expected = 70685.775;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
