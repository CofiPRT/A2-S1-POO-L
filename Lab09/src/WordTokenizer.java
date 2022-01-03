
public class WordTokenizer implements Tokenizer {
	private String[] words;
	private Integer currentWord = 0;
	
	public WordTokenizer(String inputString) {
		words = inputString.split(" ");
		currentWord = 0;
	}
	
	public void resetIndex() {
		this.currentWord = 0;
	}
	
	public String getNext() {
		if (currentWord == words.length) {
			return null;
		}
		
		return words[currentWord++];
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
