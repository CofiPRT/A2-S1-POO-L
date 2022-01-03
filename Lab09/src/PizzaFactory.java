
public class PizzaFactory {
	private static PizzaFactory uniqueInstance;
	
	private PizzaFactory() {}
	
	public static PizzaFactory getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new PizzaFactory();
		}
		
		return uniqueInstance;
	}
	
	public Pizza bakePizza(PizzaType type, Float size, Float price) {
		switch(type) {
		case CLASSIC:
			return new PizzaClassic(size, price);
		case BBQCHICKEN:
			return new PizzaBBQChicken(size, price);
		case HONEYMUSTARD:
			return new PizzaHoneyMustardChicken(size, price);
		case ALOHA:
			return new PizzaAloha(size, price);
		}
		
		return null;
	}
}
