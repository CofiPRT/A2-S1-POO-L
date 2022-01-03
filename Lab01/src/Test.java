
public class Test {

	public static void main(String[] args) {
		NumarComplex numar1 = new NumarComplex(1, 3);
		NumarComplex numar2 = new NumarComplex(2, 4);
		
		Operatii op = new Operatii();
		NumarComplex numar3 = op.aduna(numar1, numar2);
		
		System.out.print(numar3.re + " + " + numar3.im + "i");

	}

}
