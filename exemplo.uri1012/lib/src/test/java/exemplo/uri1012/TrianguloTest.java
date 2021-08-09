/**
 * 
 */
package exemplo.uri1012;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * @author Gabriel
 *
 */
public class TrianguloTest {

	@Test
	public void test3And5() {
		Retangulo r1 = new Retangulo(3.00, 5.00);
		double expected = 7.500;
		double actual = r1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
