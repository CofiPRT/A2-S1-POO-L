import java.util.ArrayList;

public class MessageSet implements Subject {
	public ArrayList<String> messages;
	
	public MessageSet() {
		messages = new ArrayList<String>();
	}
	
	public void addMessage(String newMessage) {
		messages.add(newMessage);
		
		notifyObservers();
	}
	
	public void registerObserver(LanguageObserver o) {
		observers.add(o);
	}
	
	public void removeObserver(LanguageObserver o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		if (messages.isEmpty()) {
			// no messages
			return;
		}
		
		for (LanguageObserver o : observers) {
			o.update(messages.get(messages.size() - 1));
		}
	}
}
