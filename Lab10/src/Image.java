
public class Image implements Cloneable {
	public double height;
	public double width;
	public double rotation;
	public boolean blurred;
	
	public Image() {
		height = 1080;
		width = 1920;
		rotation = 0;
		blurred = false;
	}
	
	public Image(double height, double width) {
		this();
		this.height = height;
		this.width = width;
	}
	
	public Image clone() {
		return new Image()
				.setHeight(height)
				.setWidth(width)
				.setRotation(rotation)
				.setBlurred(blurred);
	}
	
	public String toString() {
		return "Size: " + height + " x " + width + ", rotation: " + rotation + ", blurred: " + blurred;
	}
	
	public void print() {
		System.out.println(this);
	}
	
	public double getHeight() {
		return height;
	}
	public Image setHeight(double height) {
		this.height = height;
		
		return this;
	}
	public double getWidth() {
		return width;
	}
	public Image setWidth(double width) {
		this.width = width;
		
		return this;
	}
	public double getRotation() {
		return rotation;
	}
	public Image setRotation(double rotation) {
		this.rotation = rotation;
		
		return this;
	}
	public boolean isBlurred() {
		return blurred;
	}
	public Image setBlurred(boolean blurred) {
		this.blurred = blurred;
		
		return this;
	}
	
	
	
}
