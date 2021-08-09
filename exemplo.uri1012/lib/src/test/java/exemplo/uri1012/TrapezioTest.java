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
public class TrapezioTest {

	@Test
	public void test() {
		Trapezio t1 = new Trapezio(3.00, 4.00, 5.00);
		double expected = 17.500;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
