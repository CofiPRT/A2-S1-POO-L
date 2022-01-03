package array;


public class MyArrayList {
	private int[] v;
	private int size;
	private int capacity;
	
	MyArrayList() {
		v = new int[10];
		capacity = 10;
	}
	
	MyArrayList(int n) {
		v = new int[n];
		capacity = n;
	}
	
	public void add(int value) {
		if (size == capacity)
			resize();
		v[size++] = value;
	}
	
	private void resize() {
		int[] v_copy = new int [capacity *= 2];
		for (int i = 0; i < size; i++) {
			v_copy[i] = v[i];
		}
		
		v = v_copy;
	}
	
	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}
	
	public void size() {
		System.out.println("Size: " + size);
	}
	
	public void get(int index) {
		System.out.println("Element at index " + index + " is: " + v[index]);
	}
	
}
