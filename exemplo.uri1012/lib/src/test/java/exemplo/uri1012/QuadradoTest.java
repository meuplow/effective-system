package exemplo.uri1012;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadradoTest {

	@Test
	public void test5() {
		Quadrado q1 = new Quadrado(5.00);
		double expected = 25.000;
		double actual = q1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
