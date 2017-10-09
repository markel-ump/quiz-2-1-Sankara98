package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import shapes.Circle;

public class CircleTest {

	@Test
	public void testCalculateArea() {
		assertEquals(12.56, new Circle(2).calculateArea(), .0000000001);
		
	}

	@Test
	public void testCircle() {
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeCircle() {
		new Circle(-1);
	}

	@Test
	public void testGetRadius() {
		assertEquals(5,new Circle(5).getRadius(), 0000001);

	}

}
