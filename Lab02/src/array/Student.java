package array;

public class Student extends Persoana {
	int nota;
	
	Student() {
		
	}
	
	Student(String nume, int nota) {
		this.nume = nume;
		this.nota = nota;
	}
	
	public String toString() {
		return "Student: " + super.toString() + ", " + nota;
	}
	
	public String invata() {
		return super.toString() + " invata...";
	}
}
