import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		//Arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.add(a, b);
		
		//Assert
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		
		//Arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.substract(a, b);
		
		//Assert
		int expected = 3087;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		
		//Arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.multiply(a, b);
		
		//Assert
		int expected = 5332114;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		
		//Arrange
		int a = 4;
		int b = 2;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.divide(a, b);
		
		//Assert
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivideWithDenominator() {
		//fail("Not yet implemented");
		
		int a = 4;
		int c = 0;
		
		try {
			Calculator cal = new Calculator();
			cal.divide(a, c);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
		} catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}

}
