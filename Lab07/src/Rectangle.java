
public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		if (width < 0) {
			throw new IllegalArgumentException("Width cannot be "
					+ "negative: " + width);
		}
		if (height < 0) {
			throw new IllegalArgumentException("Height cannot be "
					+ "negative: " + height);
		}
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public void display() {
		System.out.println("Rectangle with width " + width
					+ " and height " + height);	
	}
}
