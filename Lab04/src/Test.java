
public class Test {

	public static void main(String[] args) {
		MyArray newArr = new MyArray(20);
		
		newArr.printForward();
		newArr.printBackward();
		System.out.println("First multiple: " + newArr.firstMultiple(5));
		
		Person newPerson = new Person();
		System.out.println("Valid person: " + newPerson.verify());
		
		Account otherAcc = new Account();
		Account.Transaction otherTran = new Account.Transaction(otherAcc);
		otherTran.deposit(10000);
		otherAcc.displaySum();
		
		Account newAcc = new Account() {
			void displaySum() {
				System.out.printf("Current sum: %.2f EUR\n", sum/4.75);
			}
		};
		
		Account.Transaction newTran = new Account.Transaction(newAcc);
		newTran.deposit(5000);
		newAcc.displaySum();

	}

}
