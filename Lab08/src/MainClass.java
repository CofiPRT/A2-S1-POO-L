import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TASK 8.1
		Set<String> readWords = new HashSet<String>();
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileReader(args[0]));
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
			System.exit(-1);
		}
		
		inputStream.useDelimiter("[., \n\r]+");
		
		while (inputStream.hasNext()) {
			String currentWord = inputStream.next();
			
			if (!currentWord.equals("")) {
				readWords.add(currentWord);
			}
		}
		
		System.out.println("My words: " + readWords);
		
		inputStream.close();

		// TASK 8.2
		Set<Student> students = new HashSet<Student>();
		students.add(new Student("Andy Blanaru", 4));
		students.add(new Student("Stircu Catalin", 7));
		students.add(new Student("Perete Rares", 4));
		students.add(new Student("Stircu Catalin", 10));
		
		System.out.println("My students: " + students);
		
		Set<Student> studentsBug = new HashSet<Student>();
		
		Student stud1 = new Student("Stircu Catalin", 7);
		Student stud2 = new Student("Stircu Catalin", 10);
		Student stud3 = new Student("Alt Catalin", 10);
		
		System.out.println("Compare: " + stud1.equals(stud2));
		
		studentsBug.add(stud1);
		studentsBug.add(stud2);
		studentsBug.add(stud3);
		
		System.out.println("My bugged students: " + studentsBug);
		
		// TASK 8.3
		StudentsData myData = new StudentsData();
		myData.add(new Student("Andy Blanaru", 4));
		myData.add(new Student("Stircu Catalin", 7));
		myData.add(new Student("Perete Rares", 4));
		myData.add(new Student("Stircu Catalin", 10));
		
		System.out.println("My data: " + myData);
		
		// BONUS 8.4
		PriorityQueue<Patient> myQueue = new PriorityQueue<Patient>();
		myQueue.add(new Patient("Andy Blanaru", 0));
		myQueue.add(new Patient("My loving grandma", 10999));
		myQueue.add(new Patient("eu", 10998));
		
		System.out.print("My hospital: ");
		while(!myQueue.isEmpty()) {
			System.out.print(myQueue.remove() + " ");
		}
	}

}
