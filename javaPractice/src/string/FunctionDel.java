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
	//e.g. if input is �This is a simple sentence�, it will return 5.
	// Paragraph = �This is a simple sentence�
	//Int GetWordCount(String paragraph);

	public static int getWordCount(String paragraph) {
		String parts[] = paragraph.split("\\s");
		return parts.length;
	}

	// 2. Get number of unique words of Paragraph = �This is a simple sentence�
	public static int getUniqueWordsCount(String paragraph) {
		String []parts = paragraph.split("\\s");
		
		Set<String> uniqueWords = new HashSet<String>();
		
		for (String s : parts) {
			uniqueWords.add(s);
			}
		
		return uniqueWords.size();
	}
	
	// 3. Get all words of Paragraph = �This is a simple sentence�
	public static String getAllWords(String paragraph) {
		
		String[] parts = paragraph.split("\\s");
		return Arrays.toString(parts);
	}
	
	
	// 4. Get all unique words of Paragraph = �This is a simple sentence�
	public static Set<String> getUniqueWords(String paragraph) {
		String[] parts = paragraph.split("\\s");
		Set<String> uniqueWords = new HashSet<String>();
		for (String s : parts) {
			uniqueWords.add(s);
		}
		
		return uniqueWords;
	}
	
	
	// 5. Get most frequent word/words. of Paragraph = �This is a simple sentence�
	
	public static List<String> getFrequentWords(String paragraph) {
		String[] parts = paragraph.split("\\s");
		
		List<String> words = new ArrayList<String>();
		
		for(int i=0;i<parts.length;i++) {
			
			for (int j=i+1;j<parts.length;j++) {
				
				if (parts[i].equals(parts[j])) {
					
					words.add(parts[i]);
				}
			}
			
		}
		return words;
	}
	
	// 5. Get most frequent word/words. of Paragraph = �This is a simple sentence�
	
	public static Map<String, Integer> getFrequentWords1(String paragraph) {
		
		String []parts = paragraph.split("\\s");
		
		Map<String, Integer> words = new LinkedHashMap<String, Integer>();
		
	   List<String> w1 = new ArrayList<String>();
	   int count = 1;
		
		for (int i=0;i<parts.length;i++) {
					
			w1.add(parts[i]);
					
				}
			
		for (int i=1;i<=w1.size()-1;i++) {
			
			
			
			for (int j=i+1;j<=w1.size()-1;j++) {
				
				
				
				if (w1.get(i).equals(w1.get(j))) {
					
					words.put(parts[i], count+1);
				}
				
				
			}
		}
		
		return words;
	}
	
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		String paragraph = "This is is this";
		
		
		// 1. (1. Get number of words in the paragraph.) public static int getWordCount(String paragraph)
		System.out.println("1. Get number of words in the paragraph.: "+getWordCount(paragraph));
		
		// 2. Get number of unique words of Paragraph = �This is a simple sentence�
		//public static int getUniqueWords(String paragraph) 
		System.out.println("2. Get number of unique words of Paragraph = �This is a simple sentence� : "+getUniqueWordsCount(paragraph));
		
		//  3. Get all words of Paragraph = �This is a simple sentence� getAllWords(String paragraph)
		System.out.println("3. Get all words of Paragraph = �This is a simple sentence�: "+getAllWords(paragraph));
		
		//  4. Get all unique words of Paragraph = �This is a simple sentence�
		//public static Set<String> getUniqueWords(String paragraph)
		System.out.println("4. Get all unique words of Paragraph = �This is a simple sentence�: "+getUniqueWords(paragraph));
		
		// 5. Get most frequent word/words. of Paragraph = �This is a simple sentence�
		//public static List<String> getFrequentWords(String paragraph)
		List<String> s1 = getFrequentWords(paragraph);
		System.out.println("5. Get most frequent word/words. of Paragraph = �This is a simple is sentence� : "+s1);
		
		// getFrequentWords1(String paragraph)
		System.out.println(getFrequentWords1(paragraph));
	}

}
