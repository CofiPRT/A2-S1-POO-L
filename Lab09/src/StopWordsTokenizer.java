import java.util.ArrayList;

public class StopWordsTokenizer extends TokenizerDecorator {
	private ArrayList<String> stopWords;
	
	public StopWordsTokenizer(Tokenizer tokenizer, ArrayList<String> stopWords) {
		super(tokenizer);
		
		this.stopWords = stopWords;
	}
	
	public String getNext() {
		String word = super.getNext();
		
		if (word == null) {
			return null;
		}
		
		if (stopWords.contains(word)) {
			return this.getNext();
		}
		
		return word;
	}
	
}
