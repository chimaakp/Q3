import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testgetPerimeter() {
		Triangle t1 = new Triangle();
		double Per = 3;
		
		assertEquals(t1.getPerimeter() , Per);
	}


	@Test
	public void testGetArea() {
		Triangle t2 = new Triangle(4, 3, 5);
		double Ar = 6;
		
		assertEquals( t2.getArea(), Ar);
		
	}

}
