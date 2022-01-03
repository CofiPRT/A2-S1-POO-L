
public class Octagon extends GeometricObject implements Cloneable {
	private double side;
	
	public Octagon (String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return (2 + 4/java.lang.Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	@Override
	public void display() {
		System.out.println("Octagon with side: " + side);
	}
	
	@Override
	public Object clone() {
		Octagon newOct = new Octagon(getColor(), isFilled(), side);
		
		return (Object)newOct;
	}
}
