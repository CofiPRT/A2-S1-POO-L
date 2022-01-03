import java.util.ArrayList;

public class TokenizerFactory {
	private static TokenizerFactory uniqueInstance;
	
	private TokenizerFactory() {}
	
	public static TokenizerFactory getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new TokenizerFactory();
		}
		
		return uniqueInstance;
	}
	
	public Tokenizer create(String string, String format, ArrayList<String> stopWords) {
		Tokenizer newTok = new WordTokenizer(string);
		
		for (int i = 0; i < format.length(); i++) {
			switch (format.charAt(i)) {
			case 'c':
				newTok = new CharacterTokenizer(newTok);
				break;
			case 'l':
				newTok = new LowerCaseTokenizer(newTok);
				break;
			case 's':
				if (stopWords == null) {
					break;
				}
				
				newTok = new StopWordsTokenizer(newTok, stopWords);
				break;
			}
		}
		
		return newTok;
	}
	
	public Tokenizer create(String string, String format) {
		return create(string, format, null);
	}
	
	public Tokenizer create(String string) {
		return create(string, "");
	}
}