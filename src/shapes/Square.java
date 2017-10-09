package shapes;

public class Square extends Shape {
	private double side;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Squares cannot have a negative side length.
	 */
	public Square(double side) throws IllegalArgumentException{
		if (side >= 0) {
			this.side = side; 
		}
		else throw new IllegalArgumentException();
	}
	
	@Override
	 public double calculateArea(){
		 double area = Math.pow(this.side,2);
		 return area;
	 }

	public double getSide() {
		return side;
	}


	
}
