package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FunctionDel {
	// 1. Get number of words in the paragraph. 
	//Hint : Function signature may look like 
	// Returns number of words in the paragraph 
	//e.g. if input is “This is a simple sentence”, it will return 5.
	// Paragraph = “This is a simple sentence”
	//Int GetWordCount(String paragraph);

	public static int getWordCount(String paragraph) {
		String parts[] = paragraph.split("\\s");
		return parts.length;
	}

	// 2. Get number of unique words of Paragraph = “This is a simple sentence”
	public static int getUniqueWordsCount(String paragraph) {
		String []parts = paragraph.split("\\s");
		
		Set<String> uniqueWords = new HashSet<String>();
		
		for (String s : parts) {
			uniqueWords.add(s);
			}
		
		return uniqueWords.size();
	}
	
	// 3. Get all words of Paragraph = “This is a simple sentence”
	public static String getAllWords(String paragraph) {
		
		String[] parts = paragraph.split("\\s");
		return Arrays.toString(parts);
	}
	
	
	// 4. Get all unique words of Paragraph = “This is a simple sentence”
	public static Set<String> getUniqueWords(String paragraph) {
		String[] parts = paragraph.split("\\s");
		Set<String> uniqueWords = new HashSet<String>();
		for (String s : parts) {
			uniqueWords.add(s);
		}
		
		return uniqueWords;
	}
	
	
	// 5. Get most frequent word/words. of Paragraph = “This is a simple sentence”
	
	//String paragraph = "This is a simple sentance is";
	
	public static Map<String,Integer> getFrequentWords(String paragraph) {
		
		String[] parts = paragraph.split("\\s");
		
		int count = 1;
		
		Map<String,Integer> mapValue = new LinkedHashMap<String, Integer>();
		
		String str = "";
		
		for(int i=0;i<parts.length;i++) {
			
			for (int j=i+1;j<parts.length;j++) {
				
				if (parts[i].equals(parts[j])) {
					
					int ii = count+1;
					
					str = parts[i];
					
					mapValue.put(str,ii);
				}
	
			}
			
		}
		return mapValue;
	}
	
	// 5. Get most frequent wordsword/words. of Paragraph = “This is a simple sentence”
	
	public static Map<String, Integer> getFrequentWords1(String paragraph) {
		
		String []parts = paragraph.split("\\s");
		
		Map<String, Integer> words = new LinkedHashMap<String, Integer>();
		
		Map<String, Integer> words1 = new LinkedHashMap<String, Integer>();
		
		int max = 0;
		String str = "";
		
		List<String> wordList = new ArrayList<String>();
		
		for (int i=0;i<parts.length;i++) {
			wordList.add(parts[i]);
		}
		
		for (int j=0;j<wordList.size();j++) {
			
			String name = wordList.get(j);
			
			for (String s : words.keySet()) {
				
				int count = words.get(s);
				
				words.put(s, count);
			}
				
		}
		
		return words;
	}
	
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		String paragraph = "This is a simple sentance is";
		
		//String p = "a h b a c d a j a";
		
		
		// 1. (1. Get number of words in the paragraph.) public static int getWordCount(String paragraph)
		System.out.println("1. Get number of words in the paragraph.: "+getWordCount(paragraph));
		
		// 2. Get number of unique words of Paragraph = “This is a simple sentence”
		//public static int getUniqueWords(String paragraph) 
		System.out.println("2. Get number of unique words of Paragraph = “This is a simple sentence” : "+getUniqueWordsCount(paragraph));
		
		//  3. Get all words of Paragraph = “This is a simple sentence” getAllWords(String paragraph)
		System.out.println("3. Get all words of Paragraph = “This is a simple sentence”: "+getAllWords(paragraph));
		
		//  4. Get all unique words of Paragraph = “This is a simple sentence”
		//public static Set<String> getUniqueWords(String paragraph)
		System.out.println("4. Get all unique words of Paragraph = “This is a simple sentence”: "+getUniqueWords(paragraph));
		
		// 5. Get most frequent word/words. of Paragraph = “This is a simple sentence”
		//public static List<String> getFrequentWords(String paragraph)
		//List<String> s1 = getFrequentWords(paragraph);
		//System.out.println("5. Get most frequent word/words. of Paragraph = “This is a simple is sentence” : "+s1);
		
		// getFrequentWords1(String paragraph)
		System.out.println("\"5. Get most frequent word/words : "+getFrequentWords(paragraph));
	}

}
