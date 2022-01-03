import java.util.*;

public class StudentsData {
	private Map<Integer, List<Student>> data;
	
	public StudentsData() {
		this.data = new HashMap<Integer, List<Student>>();
	}
	
	public void add(Student stud) {
		int roundedMark = Math.round(stud.getMark());
		
		if (!data.containsKey(Math.round(roundedMark))) {
			List<Student> newList = new ArrayList<Student>();
			
			data.put(roundedMark, newList);
			newList.add(stud);
		} else {
			data.get(roundedMark).add(stud);
		}
	}
	
	@Override
	public String toString() {
		String toPrint = "";
		
		for (Map.Entry<Integer, List<Student>> currentEntry : data.entrySet()) {
			toPrint += " " + currentEntry.getValue().toString();
		}
		
		return "[" + toPrint.trim() + "]";
	}
}
