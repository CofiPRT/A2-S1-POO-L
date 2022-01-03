import java.util.Random;

public class MyArray {
	int[] array;
	
	MyArray() {
		array = new int[50];
		
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			array[i] = rand.nextInt(100);
		}
	}
	
	public int getNumber(int index) throws ArrayIndexOutOfBoundsException {
		if (index < 0 || index >= array.length) {
			throw new ArrayIndexOutOfBoundsException("Invalid index!");
		}
		
		return array[index];
	}
}
