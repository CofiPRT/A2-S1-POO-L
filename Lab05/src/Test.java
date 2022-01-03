public class Test {
	
	static int binaryToDecimal(String binaryString)
			throws NumberFormatException {		
		try {
			return Integer.parseInt(binaryString, 2);
		}
		catch (NumberFormatException ex) {
			throw new NumberFormatException("Not a binary string!");
		}
	}
	
	static int hexToDecimal(String hexString)
			throws NumberFormatException {
		try {
			return Integer.parseInt(hexString, 16);
		}
		catch (NumberFormatException ex) {
			throw new NumberFormatException("Not a hex string!");
		}
	}
	
	static void throwOOME() throws OutOfMemoryError {
		int size = 1024;

		for (;;) {
			try {
				System.out.println("Size = " + size + ", still not there?");
			
				int[] array = new int[size];
				array[0] = 0;
				
				size *= 2;
			}
			catch (OutOfMemoryError ex) {
				throw new OutOfMemoryError("Looks like you finally did it");
			}
		}
	}
	
	static void throwSOE() {
		throwSOE();
	}

	public static void main(String[] args) {
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(-3);
		Circle circle3 = new Circle(2);
		
		System.out.println("Area of circle1: " + circle1.getArea());
		System.out.println("Area of circle2: " + circle2.getArea());
		System.out.println("Area of circle3: " + circle3.getArea());

		System.out.println("Number of Circle objects: " + circle1.getNumber());
		
		try {
			System.out.println("Decimal from bin: "
					+ binaryToDecimal("12101001"));
		}
		catch (NumberFormatException ex) {
			System.out.println(ex);
		}
		
		try {
			System.out.println("Decimal from hex: " + hexToDecimal("af"));
		}
		catch (NumberFormatException ex) {
			System.out.println(ex);
		}
		
		MyArray newArray = new MyArray();
		
		try {
			System.out.println("Element from newArray: "
					+ newArray.getNumber(50));
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
		
		try {
			throwOOME();
		}
		catch (OutOfMemoryError err) {
			System.out.println(err);
		}
		
		try {
			throwSOE();
		}
		catch (StackOverflowError err) {
			System.out.println("For more stack overflows visit"
					+ "stackoverflow.com");
		}
		
		System.out.println("Still alive?");
	}

}
