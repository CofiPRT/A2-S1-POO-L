import java.util.ArrayList;

public interface Subject {
	public ArrayList<LanguageObserver> observers = new ArrayList<>();
	
	public void registerObserver(LanguageObserver o);
	public void removeObserver(LanguageObserver o);
	public void notifyObservers();
}
