package shapes;

public class Circle extends Shape {
	private double radius;
	
	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Circles cannot have a negative radius.
	 */
	public Circle(double radius) throws IllegalArgumentException {
		if( radius <= 0) {
			this.radius = radius;
		}else throw new IllegalArgumentException();
	}
	
	@Override
	public double calculateArea(){
		return Math.PI * Math.pow(this.radius,2);
	}
	
	public double getRadius() {
		return radius;
	}
}
