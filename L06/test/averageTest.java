import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class averageTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//Arrange
		int a = 1;
		int b = 2;
		int c = 4;
		int d = 4;
		int e = 5;
		average ave = new average();
		
		//Act
		String actualAve = String.format("%.2f", ave.averageOf(a, b, c, d, e));
		
		//Assert
		String expectedAve = "3.20";
		assertSame(expectedAve, actualAve);
	}

}
