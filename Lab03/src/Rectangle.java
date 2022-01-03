
public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	
	public Rectangle (String color, boolean filled, double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public void display() {
		System.out.println("Rectangle with dimensions: "
				+ width + " and " + height);
	}

}