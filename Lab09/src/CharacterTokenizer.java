
public class CharacterTokenizer extends TokenizerDecorator {
	private String chars;
	private Integer currChar;
	
	public CharacterTokenizer(Tokenizer tokenizer) {
		super(tokenizer);
		
		nextWord();
	}
	
	private void nextWord() {
		chars = this.tokenizer.getNext();
		currChar = 0;
	}
	
	public String getNext() {
		if (currChar == chars.length()) {
			nextWord();
			
			if (chars == null) {
				return null;
			}
		}
		
		return String.valueOf(chars.charAt(currChar++));
	}
}
