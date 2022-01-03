
public class Patient implements Comparable<Patient> {
	private String name;
	private int priority;
	
	public Patient(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	
	@Override
	public int compareTo(Patient patient) {
		if (this.priority > patient.getPriority()) {
			return -1;
		} else if (this.priority < patient.getPriority()) {
			return 1;
		}
		
		return 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPriority() {
		return this.priority;
	}
	
	@Override
	public String toString() {
		return "[" + this.name + ": " + this.priority + "]";
	}
}
