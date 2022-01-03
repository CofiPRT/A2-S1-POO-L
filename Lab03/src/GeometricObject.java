import java.util.Date;

public abstract class GeometricObject implements Comparable {
	private String color;
	private boolean filled;
	private Date dateCreated;

	protected GeometricObject() {
		color = "red";
		filled = false;
		dateCreated = new Date();
	}

	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}
	
	public String getColor() {
		return color;
	}
	
	protected void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	protected void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public abstract void display();

	@Override
	public int compareTo(Object o) {
		if (getPerimeter() > ((GeometricObject)o).getPerimeter())
			return 1;
			
		if (getPerimeter() < ((GeometricObject)o).getPerimeter())
			return -1;
		
		return 0;
	}
	
}