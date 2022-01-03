
public class LowerCaseTokenizer extends TokenizerDecorator {
	
	public LowerCaseTokenizer(Tokenizer tokenizer) {
		super(tokenizer);
	}
	
	public String getNext() {
		String word = super.getNext();
		
		return word == null ? word : word.toLowerCase();
	}
}
