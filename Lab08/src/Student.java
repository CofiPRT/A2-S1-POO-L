
public class Student {
	private String name;
	private float mark;
	
	public Student(String name, float mark) {
		this.name = name;
		this.mark = mark;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Student && ((Student) o).getName().equals(this.name)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public String toString() {
		return "[" + this.name + ": " + this.mark + "]";
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getMark() {
		return this.mark;
	}
}
