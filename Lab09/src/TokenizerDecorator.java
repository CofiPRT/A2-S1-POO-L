
public abstract class TokenizerDecorator implements Tokenizer {
	Tokenizer tokenizer;
	
	public TokenizerDecorator(Tokenizer tokenizer) {
		this.tokenizer = tokenizer;
	}
	
	public String getNext() {
		return tokenizer.getNext();
	}
	
	public void resetIndex() {
		tokenizer.resetIndex();
	}
	
	public void exhaust() {
		String currTok;
		boolean printComma = false;
		
		while ((currTok = this.getNext()) != null) {
			if (printComma) {
				System.out.print(", ");
			}
			System.out.print(currTok);
			
			printComma = true;
		}
		System.out.println();
	}
}
