package array;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		// 1111111111
		
		Random generator = new Random();
		
		MyArrayList v = new MyArrayList(2);
		v.add(15);
		v.add(100);
		v.add(1000);
		
		MyArrayList vRandom = new MyArrayList(5);
		
		for (int i = 0; i < 10; i++) {
			vRandom.add(generator.nextInt());
		}
		vRandom.print();
		vRandom.size();
		vRandom.get(2);
		
		// 2222222222
		
		Profesor prof1 = new Profesor("Omurzac", "geografie");
		Student stud1 = new Student("Casu Olga", 10);
		
		System.out.println(prof1.toString());
		System.out.println(stud1.toString());
		
		// 3333333333
		
		ArrayList<Persoana> myArray = new ArrayList<Persoana>();
		
		myArray.add(prof1);
		myArray.add(stud1);
		
		for (int i = 0 ; i < myArray.size(); i++) {
			System.out.println((myArray.get(i)).toString());
		}
		
		// 4444444444
		
		for (int i = 0 ; i < myArray.size(); i++) {
			if (myArray.get(i) instanceof Profesor) {
				System.out.println(((Profesor)myArray.get(i)).preda());
			}
			if (myArray.get(i) instanceof Student) {
				System.out.println(((Student)myArray.get(i)).invata());
			}
		}
		
		// 5555555555
		
		MyStack newStack = new MyStack();
		
		if (newStack.isEmpty())
			System.out.println("It really is empty");
		
		newStack.push(3);
		newStack.push(3);
		newStack.push(5);
		
		System.out.println("Size is: " + newStack.getSize());
		System.out.println("String List: " + newStack.toString());
		System.out.println("Top of the stack: " + newStack.peek());
		System.out.println("First index of 3 is: " + newStack.search(3));
		newStack.pop();
		System.out.println("Size is: " + newStack.getSize());
		System.out.println("String List after pop: " + newStack.toString());
		
		int[] testArray = new int[25];
		
//		System.out.println("Array .length is: " + testArray.length );
	}
}
