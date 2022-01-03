
public class MyArray {
	int[] array;
	
	MyArray(int n) {
		array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
	}
	
	public class ArrayIterator {
		int iter;
		
		boolean hasNext() {
			//return iter + 1 < array.length;
			return iter < array.length;
		}
		
		boolean hasPrevious() {
			return iter - 1 >= 0;
		}
		
		int next() {
			if (hasNext()) {
				return array[iter++];
			}
			return -1;
		}
		
		int nextIndex() {
			if (hasNext()) {
				return iter;
			}
			return -1;
		}
		
		int previous() {
			if (hasPrevious()) {
				return array[iter--];
			}
			return -1;
		}
		
		int previousIndex() {
			if (hasPrevious()) {
				return iter;
			}
			return -1;
		}
	}
	
	void printForward() {
		ArrayIterator myIterator = new ArrayIterator();
		
		myIterator.iter = 0;
		System.out.println("Forward print:");
		while (myIterator.hasNext()) {
			System.out.print(myIterator.next() + " ");
		}
		System.out.println();
	}
	
	void printBackward() {
		ArrayIterator myIterator = new ArrayIterator();
		
		myIterator.iter = array.length - 1;
		System.out.println("Backward print:");
		while (myIterator.hasPrevious()) {
			System.out.print(myIterator.previous() + " ");
		}
		System.out.println();
	}
	
	int firstMultiple(int k) {
		ArrayIterator myIterator = new ArrayIterator();
		
		myIterator.iter = k + 1;
		while (myIterator.hasNext()) {
			if (myIterator.next() % k == 0) {
				return myIterator.iter - 1;
			}
		}
		return -1;
	}
	
}
