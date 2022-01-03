import java.util.ArrayList;

enum PizzaType {
	CLASSIC,
	BBQCHICKEN,
	HONEYMUSTARD,
	ALOHA
}

public class MainClass {
	
	public static void main(String args[]) {
		// TASK 4.1
		ArrayList<Pizza> myPizzas = new ArrayList<Pizza>();
		
		PizzaFactory myFactory = PizzaFactory.getInstance();
		
		myPizzas.add(myFactory.bakePizza(PizzaType.CLASSIC, 40F, 42.75F));
		myPizzas.add(myFactory.bakePizza(PizzaType.BBQCHICKEN, 20F, 32.75F));
		myPizzas.add(myFactory.bakePizza(PizzaType.HONEYMUSTARD, 40F, 42.75F));
		myPizzas.add(myFactory.bakePizza(PizzaType.ALOHA, 30F, 38.75F));
		myPizzas.add(myFactory.bakePizza(PizzaType.CLASSIC, 30F, 34.75F));


		for (Pizza currentPizza : myPizzas) {
			System.out.println(currentPizza);
		}
		
		// TASK 4.2 + 4.3
		TokenizerFactory myTokFactory = TokenizerFactory.getInstance();
		
		Tokenizer myTok = myTokFactory.create("Ana are mere");
		System.out.print("These words: ");
		myTok.exhaust();
		
		myTok = myTokFactory.create("Banana are pere", "l");
		System.out.print("These lowercase words: ");
		myTok.exhaust();
		
		myTok = myTokFactory.create("Suzana are bere", "c");
		System.out.print("These characters: ");
		myTok.exhaust();
		
		ArrayList<String> stopWords = new ArrayList<String>();
		stopWords.add("Cana");
		stopWords.add("are");
		stopWords.add("Miere");
		stopWords.add("segfault");
		
		myTok = myTokFactory.create("Cana are miere", "s", stopWords);
		System.out.print("These filtered words: ");
		myTok.exhaust();
		
		myTok = myTokFactory.create("Blana are eclerURI", "lc");
		System.out.print("These lowercase characters: ");
		myTok.exhaust();
		
		myTok = myTokFactory.create("Vrana are loc de parcare", "ls", stopWords);
		System.out.print("These filtered lowercase words: ");
		myTok.exhaust();
		
		myTok = myTokFactory.create("Borcana are rotopercutoare", "s");
		System.out.print("These non-filtered words: ");
		myTok.exhaust();
		
		myTok = myTokFactory.create("Pseudomembrana are simultaneizare", "sc", stopWords);
		System.out.print("These filtered characters: ");
		myTok.exhaust();
		
		myTok = myTokFactory.create("Termoenergeticiana are ultracentrifugare", "lsc", stopWords);
		System.out.print("These filtered lowercase characters: ");
		myTok.exhaust();
		
		
	}
}
