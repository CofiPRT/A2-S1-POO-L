import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {
	public static Scanner consoleInput;
	
	public static int countChar(String string, char letter) {
		int count = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == letter) {
				count++;
			}
		}
		
		return count;
	}
	
	public static char maxChar(String fileName) {
		char maxChar = '-';
		int maxCount = 0;
				
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			
			while (fileScanner.hasNextLine()) {
				String newLine = fileScanner.nextLine();
				
				for (char i = 'a'; i <= 'z'; i++) {
					int count = countChar(newLine.toLowerCase(), i);
					
					if (count >= maxCount) {
						maxCount = count;
						maxChar = i;
					}
				}
			}
			
			fileScanner.close();
		}
		catch (FileNotFoundException exc) {
			System.out.println(exc);
		}
		
		return maxChar;
	}
	
	public static int cloneFile(String inputFile, String outputFile) {
		int byteCount = 0;
		
		try {
			FileInputStream inputStream = new FileInputStream(inputFile);
			FileOutputStream outputStream = new FileOutputStream(outputFile);
			
			int readBytes;
			while ((readBytes = inputStream.read()) != -1) {
				outputStream.write(readBytes);
				
				byteCount++;
			}
			
			inputStream.close();
			outputStream.close();
		}
		catch (FileNotFoundException exc) {
			System.out.println(exc);
		}
		catch (IOException exc) {
			System.out.println(exc);
		}
		
		return byteCount;
	}
	
	public static int countWords(String inputFile) {
		int wordCount = 0;
		
		try {
			Scanner inputScanner = new Scanner(new File(inputFile));
			inputScanner.useDelimiter("[. ]");
			
			while (inputScanner.hasNext()) {
				String newWord = inputScanner.next();
				System.out.println("New word: " + newWord);
				
				if (!newWord.contentEquals("")) {
					wordCount++;
				}
			}
			
			inputScanner.close();
		}
		catch (FileNotFoundException exc) {
			System.out.println(exc);
		}
		
		return wordCount;
	}
	
	public static void replaceWords(String fileName, String word1, String word2) {
		try {
			RandomAccessFile inputFile = new RandomAccessFile(fileName, "rw");
			StringBuilder newString = new StringBuilder();
			
			// read
			while (inputFile.getFilePointer() != inputFile.length()) {				
				newString.append(inputFile.readLine().replaceAll(word1, word2));
			}
			
			// write
			inputFile.setLength(newString.length());
			inputFile.seek(0);
			
			long cursor = 0;
			long fileEnd = inputFile.length();
			
			while ((cursor = inputFile.getFilePointer()) != fileEnd) {
				inputFile.writeChars(newString.substring(cursor, Math.min(cursor+512, fileEnd)));;
			}
			
//			byte[] fileBuffer = new byte[(int)inputFile.length()];
//			inputFile.readFully(fileBuffer);
//			
//			String wholeFile = new String(fileBuffer);
//			String newString = wholeFile.replaceAll(word1, word2);
//			
//			inputFile.setLength(newString.length());
//			inputFile.seek(0);
//			inputFile.writeBytes(newString);
			
			inputFile.close();
		}
		catch (FileNotFoundException exc) {
			System.out.println(exc);
		}
		catch (IOException exc) {
			System.out.println(exc);
		}
	}

	public static void main(String[] args) {
		consoleInput = new Scanner(System.in);
		
		// TASK 8.1
//		System.out.print("Task 1 | String: ");
//		String newLine = consoleInput.nextLine();
//		
//		for (char i = 'a'; i <= 'z'; i++) {
//			int count = countChar(newLine.toLowerCase(), i);
//			
//			if (count != 0) {
//				System.out.println("'" + i + "' apare de " + count + " ori");
//			}
//		}
		
		// TASK 8.2
//		System.out.print("Task 2 | Filename: ");
//		String fileName_2 = consoleInput.next();
//		
//		System.out.println("Caracterul cu frecventa de aparitie maxima "
//				+ "este: " + maxChar(fileName_2));
		
		// TASK 8.3
//		System.out.print("Task 3 | Input file: ");
//		String fileName_3_1 = consoleInput.next();
//		
//		System.out.print("Task 3 | Output file: ");
//		String fileName_3_2 = consoleInput.next();
//		
//		System.out.println("Cloned bytes: "
//						+ cloneFile(fileName_3_1, fileName_3_2));
		
		// TASK 8.4
		String fileName_4 = args[0];
		System.out.println("Task 4 | Input file: " + fileName_4);
		
		System.out.println("Word counter: " + countWords(fileName_4));
		
		// TASK 8.5
		String string1 = args[1];
		String string2 = args[2];
		String filename_5 = args[3];
		System.out.println("Task 5 | Word 1: " + string1
						+ ", word 2: " + string2
						+ ", input file: " + filename_5);
		
		replaceWords(filename_5, string1, string2);
		
		consoleInput.close();
	}

}
