public class Circle {
	double radius;
	static int number;
	
	Circle() {
		
	}
	
	Circle(double newRadius) {
		try {
			setRadius(newRadius);
			number++;
		}
		catch (InvalidRadiusException ex) {
			System.out.println(ex);
		}
	}
	
	class InvalidRadiusException extends Exception {	
		private static final long serialVersionUID = -6365344691707122719L;

		InvalidRadiusException() {
			super("Invalid radius");
		}
	}
	
	void setRadius(double newRadius) throws InvalidRadiusException {
		if (newRadius < 0) {
			throw new InvalidRadiusException();
		}
		
		radius = newRadius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	int getNumber() {
		return number;
	}
}
