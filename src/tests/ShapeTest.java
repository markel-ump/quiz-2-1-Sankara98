package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;
import shapes.Square;

public class ShapeTest {

	/*
	 * Write a test for Shape's compareTo method.
	 * 
	 * Also create SquareTest.java and CircleTest.java JUnit test cases.
	 * Test each class's constructor method and calculateArea method.
	 */
	@Test
	public void testCompareTo() {
		Square smallerSquare = new Square(1); 
		Circle biggerCircle = new Circle(1);
		assertEquals(-1, smallerSquare.compareTo(biggerCircle));

	}

}
