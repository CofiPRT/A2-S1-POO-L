
public abstract class Pizza {
	String name;
	Float size;
	Float price;
	
	public String toString() {
		return this.name + ": " + this.size + "cm, " + this.price + " RON";
	}
}

class PizzaClassic extends Pizza {
	PizzaClassic(Float size, Float price) {
		this.name = "Classic";
		this.size = size;
		this.price = price;
	}
}

class PizzaBBQChicken extends Pizza {
	PizzaBBQChicken(Float size, Float price) {
		this.name = "BBQ Chicken";
		this.size = size;
		this.price = price;
	}
}

class PizzaHoneyMustardChicken extends Pizza {
	PizzaHoneyMustardChicken(Float size, Float price) {
		this.name = "Honey Mustard Chicken";
		this.size = size;
		this.price = price;
	}
}

class PizzaAloha extends Pizza {
	PizzaAloha(Float size, Float price) {
		this.name = "Who in God's name eats this?";
		this.size = size;
		this.price = price;
	}
}