
public interface Tokenizer {
	public String getNext();
	public void resetIndex();
	public void exhaust();
}
