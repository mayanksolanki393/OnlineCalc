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
	
	@Test
	public void testMultiply(){
		assertEquals(20.0,Calculator.multiply(4, 5));
		assertEquals(-20.0,Calculator.multiply(4, -5));
		assertEquals(-20.0,Calculator.multiply(-4, 5));
		assertEquals(0.0,Calculator.multiply(4, 0));
	}
	
	@Test
	public void testSubtract(){
		assertEquals(-1.0,Calculator.subtract(4, 5));
		assertEquals(9.0,Calculator.subtract(4, -5));
		assertEquals(-9.0,Calculator.subtract(-4, 5));
		assertEquals(8.0,Calculator.subtract(4, -4));
	}
	
	@Test
	public void testDivide(){
		try{
			assertEquals(0.8,Calculator.divide(4, 5));
			assertEquals(-0.8,Calculator.divide(4, -5));
			assertEquals(-0.8,Calculator.divide(-4, 5));
			assertEquals(-1.0,Calculator.divide(4, -4));
		}
		catch(Exception ex){
			fail(ex.getMessage());
		}
		
		try{
			Calculator.divide(4, 0);
			fail("Divide by zero should throw an exception");
		}
		catch(Exception ex){
			
		}
	}
}
