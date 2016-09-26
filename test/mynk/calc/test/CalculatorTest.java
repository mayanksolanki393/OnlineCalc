package mynk.calc.test;

import org.junit.Test;

import junit.framework.TestCase;
import mynk.calc.Calculator;


public class CalculatorTest extends TestCase{
	@Test
	public void testAdd(){
		assertEquals(9.0,Calculator.add(4, 5));
		assertEquals(-1.0,Calculator.add(4, -5));
		assertEquals(1.0,Calculator.add(-4, 5));
		assertEquals(0.0,Calculator.add(4, -4));
	}
}
