import java.util.Scanner;

public class Person {
	String name;
	String CNP;
	
	Person() {
		Scanner input = new Scanner(System.in);
		
		name = input.nextLine();
		CNP = input.nextLine();
		
		input.close();
	}
	
	boolean verify() {
		class CheckPerson {
			boolean check() {
				if (!Character.isUpperCase(name.charAt(0))) {
					return false;
				}
				
				if (!(CNP.charAt(0) == '1' || CNP.charAt(0) == '2')) {
					return false;
				}
				
				if (!(CNP.matches("[0-9]+") && CNP.length() == 13)) {
					return false;
				}
				
				return true;
			}
		}
		
		CheckPerson whyAmIDoingThis = new CheckPerson();
		
		return whyAmIDoingThis.check();
	}
}
