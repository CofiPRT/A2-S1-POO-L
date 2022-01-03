import java.lang.Math;

public class Circle extends GeometricObject {
	private double radius;
	
	public Circle (String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}

	@Override
	public void display() {
		System.out.println("Circle with radius: " + radius);
	}

}