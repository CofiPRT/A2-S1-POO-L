
public class Circle extends GeometricObject {
	private double radius;
	
	public Circle(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Radius cannot be "
					+ "negative: " + radius);
		}
		
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void display() {
		System.out.println("Circle with radius " + radius);
	}
}
