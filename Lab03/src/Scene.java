
public class Scene {
	GeometricObject[] myObjects;
	private int objectNo;
	
	Scene(int size) {
		myObjects = new GeometricObject[size];
	}
	
	public void add(GeometricObject o) {
		myObjects[objectNo++] = o;
	}
	
	public void displayAll() {
		System.out.println("--------------------");
		
		System.out.println("Display everything: ");
		for (int i = 0; i < objectNo; i++) {
			myObjects[i].display();
		}
		
		System.out.println("--------------------");

	}
	
	public double areaAll() {
		double sum = 0;
		for (int i = 0; i < objectNo; i++) {
			sum += myObjects[i].getArea();
		}
		
		return sum;
	}
	
	public double perimeterAll() {
		double sum = 0;
		for (int i = 0; i < objectNo; i++) {
			sum += myObjects[i].getPerimeter();
		}
		
		return sum;
	}
	
	 public void sort() {
		 for (int i = 0; i < objectNo; i++) {
			 for (int j = i + 1; j < objectNo; j++) {
				 if (myObjects[i].compareTo(myObjects[j]) == 1) {
					 GeometricObject tmp = myObjects[i];
					 myObjects[i] = myObjects[j];
	                 myObjects[j] = tmp;
	             }
	         }
	     }
	}
	
}