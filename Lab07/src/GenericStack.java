import java.util.ArrayList;

public class GenericStack<E> {
	public ArrayList<E> list;
	
	public GenericStack() {
		list = (ArrayList<E>) new ArrayList<E>();
	}
	
	public int getSize() {
		return list.size();
	}
	
	public void push (E o) {
		list.add(o);
	}
	
	public E peek() {
		return list.get(list.size() - 1);
	}
	
	public E pop() {
		return list.remove(list.size() - 1);
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
}
