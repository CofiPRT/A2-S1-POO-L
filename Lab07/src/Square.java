
public class Square extends GeometricObject{
	private double side;
	
	public Square(double side) {
		if (side < 0) {
			throw new IllegalArgumentException("Side cannot be "
					+ "negative: " + side);
		}
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}

	@Override
	public void display() {
		System.out.println("Square with side " + side);
	}
}
