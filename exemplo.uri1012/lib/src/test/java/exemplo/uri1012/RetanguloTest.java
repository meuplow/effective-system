package exemplo.uri1012;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RetanguloTest {

	@Test
	public void test12And4() {
		Retangulo r1 = new Retangulo(12.00, 4.00);
		double expected = 48.000;
		double actual = r1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
