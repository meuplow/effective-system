/**
 * 
 */
package exemplo.uri1012;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Gabriel
 *
 */
public class TrianguloTest {

	@Test
	public void test3And5() {
		Triangulo t1 = new Triangulo(3.00, 5.00);
		double expected = 7.500;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
