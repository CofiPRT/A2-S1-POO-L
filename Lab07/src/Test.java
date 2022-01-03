import java.util.ArrayList;

public class Test {

	public static <E> void printStack(GenericStack<E> st) {
		GenericStack<E> auxiliaryStack = new GenericStack<E>();
		
		System.out.println("Started printing: ");
		
		// get elements one by one
		while (!st.isEmpty()) {
			auxiliaryStack.push(st.pop());
		}
		
		// restore original
		while (!auxiliaryStack.isEmpty()) {
			E element = auxiliaryStack.pop();
			
			System.out.print(element.toString() + " ");
			
			st.push(element);
		}
		
		System.out.println();
	}
	
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int leftLimit = 0;
		int rightLimit = list.length - 1;
		
		while (list[rightLimit] == null) rightLimit--;
		
		while (leftLimit <= rightLimit) {
			int middle = (leftLimit + rightLimit) / 2;
			
			if (list[middle].compareTo(key) == 0) {
				// element found
				return middle;
			}
			
			if (list[middle].compareTo(key) < 0) {
				leftLimit = middle + 1;
			} else {
				rightLimit = middle - 1;
			}
		}
		
		// element not found
		return -1;
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		if (list.length == 0) {
			System.out.println("The list is empty!");
			return null;
		}
		
		E maxElem = list[0];
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) break;
			
			if (list[i].compareTo(maxElem) >= 0) {
				maxElem = list[i];
			}
		}
		
		return maxElem;
	}
	
	public static void maximumArea(ArrayList<? extends GeometricObject> list) {
		if (list.isEmpty()) {
			System.out.println("This list empty, YEET");
			return;
		}
		
		GeometricObject maxAreaObject = list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).compareTo(maxAreaObject) >= 0) {
				maxAreaObject = list.get(i);
			}
		}
		
		maxAreaObject.display();
	}
	
	public static <E extends Comparable<E>> void selectionSort(E[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] == null) break;
			
			// find index
			int minElementIndex = i;
			for (int j = i + 1; j < list.length - 1; j++) {
				if (list[j] == null) break;
				
				if (list[j].compareTo(list[minElementIndex]) < 0) {
					minElementIndex = j;
				}
			}
			
			// swap
			E temp = list[i];
			list[i] = list[minElementIndex];
			list[minElementIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		
		// TASK 3.1
		GenericStack<Integer> integerStack = new GenericStack<Integer>();
		GenericStack<Double> doubleStack = new GenericStack<Double>();
		GenericStack<String> stringStack = new GenericStack<String>();
		
		integerStack.push(5);
		integerStack.push(10);
		integerStack.push(15);
		integerStack.push(25);
		
		doubleStack.push(3.14);
		doubleStack.push(9.8);
		doubleStack.push(9.8);

		stringStack.push("Epstein");
		stringStack.push("didn't");
		stringStack.push("kill");
		stringStack.push("himself");
		
		printStack(integerStack);
		System.out.println(integerStack.peek().toString());
		printStack(doubleStack);
		System.out.println(doubleStack.peek().toString());
		printStack(stringStack);
		System.out.println(stringStack.peek().toString());
		
		// TASK 3.4
		ArrayList<GeometricObject> mySpace = new ArrayList<GeometricObject>();
		
		mySpace.add(new Circle(3));
		mySpace.add(new Square(6));
		mySpace.add(new Rectangle(5, 1));
		
		maximumArea(mySpace);
		
		Square[] mySquares = new Square[50];
		
		mySquares[0] = new Square(5);
		mySquares[1] = new Square(7);
		mySquares[2] = new Square(3);
		
		System.out.println("My squares: ");
		
		mySquares[0].display();
		max(mySquares).display();
		
		selectionSort(mySquares);
		
		System.out.println("After selection: ");
		
		mySquares[0].display();
		mySquares[1].display();
		mySquares[2].display();
		
		Rectangle myRectangle = new Rectangle(40, 1);
		
		System.out.println(binarySearch(mySquares, myRectangle));
	}

}
