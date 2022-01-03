
public class Account {
	double sum;
	
	static class Transaction {
		final Account acc;
		
		Transaction(Account acc) {
			this.acc = acc;
		}
		
		void withdraw(double amount) {
			acc.sum -= amount;
		}
		
		void deposit(double amount) {
			acc.sum += amount;
		}
	}
	
	void displaySum() {
		System.out.println("Current sum: " + sum + " RON");
	}
}
