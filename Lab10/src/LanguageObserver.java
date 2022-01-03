import java.util.HashMap;
import java.util.Scanner;

public abstract class LanguageObserver {
	public String printMessage;
	public HashMap<String, String> translation = new HashMap<>();
	
	public void update(String message) {
		Scanner lineScanner = new Scanner(message);
		
		System.out.print(this.printMessage);
		
		while (lineScanner.hasNext()) {
			String word = lineScanner.next();
			
			if (!translation.containsKey(word.toLowerCase())) {
				// no translation
				System.out.print(word + " ");
				continue;
			}
			
			System.out.print(translation.get(word.toLowerCase()) + " ");
		}
		
		System.out.println();
		
		lineScanner.close();
	}
	
}
