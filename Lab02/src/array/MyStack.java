package array;
import java.util.ArrayList;

public class MyStack {
	ArrayList<Integer> list;
	
	MyStack() {
		list = new ArrayList<Integer>();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int getSize() {
		return list.size();
	}
	
	public Integer peek() {
		return list.get(list.size() - 1);
	}
	
	public Integer pop() {
		Integer poppedObj = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		
		return poppedObj;
	}
	
	public void push(Integer pushedObj) {
		list.add(pushedObj);
	}
	
	public int search(Integer number) {
		return list.indexOf(number);
	}
	
	public String toString() {
		String newString = "";
		
		for (int i = 0; i < list.size(); i++) {
			newString = newString + list.get(i) + " ";
		}
		
		return newString;
	}
}
