package array;

public class Profesor extends Persoana {
	String materie;
	
	Profesor() {
		
	}
	
	Profesor(String nume, String materie) {
		this.nume = nume;
		this.materie = materie;
	}
	
	public String toString() {
		return "Profesor: " + super.toString() + ", " + materie;
	}
	
	public String preda() {
		return super.toString() + " preda...";
	}
}
