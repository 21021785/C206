import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class findMaxTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void findMaxTest1() {
		int[] arrA = {1,3,2,4};
		assertEquals("Test if the biggest integer is 4", 4, HelloWorld1.findMax(arrA));
	}
	
	@Test
	public void findMaxTest2() {
		int[] arrB = {-11,-3,-1,-2,-4};
		assertEquals("Test if the biggest integer is -1", -1, HelloWorld1.findMax(arrB));
	}

}
