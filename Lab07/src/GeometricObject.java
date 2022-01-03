
public abstract class GeometricObject implements Comparable<GeometricObject> {
	public abstract double getArea();
	
	public abstract void display();
	
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		}
		
		if (this.getArea() < o .getArea()) {
			return -1;
		}
		
		return 0;
	}
}
