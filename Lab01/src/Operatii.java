
public class Operatii {
	public NumarComplex aduna(NumarComplex a, NumarComplex b) {
		NumarComplex numarNou = new NumarComplex();
		
		numarNou.re = a.re + b.re;
		numarNou.im = a.im + b.im;
		
		return numarNou;
	}
	
	public NumarComplex inmulteste(NumarComplex a, NumarComplex b) {
		NumarComplex numarNou = new NumarComplex();
		
		numarNou.re = a.re * b.re - a.im * b.im;
		numarNou.im = a.re * b.im + a.im * b.re;
		
		return numarNou;
	}
}
