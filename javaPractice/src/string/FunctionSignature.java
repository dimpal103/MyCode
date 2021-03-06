package string;
import java.util.*;

public class FunctionSignature {

	/*
	 * Given a string which represents paragraph, write functions to
Get number of words in the paragraph. 
Hint : Function signature may look like 
// Returns number of words in the paragraph e.g. if input is �This is a simple sentence�, it will return 5.
Int GetWordCount(String paragraph);
Get number of unique words.
Get all words
Get all unique words.
Get most frequent word/words.
Get most unique word/words.
Number of characters excluding white spaces.
Get paragraph in title case.
Get longest word in the paragraph.
Get shortest word in the paragraph.
Get word having least vowels.
Get word having maximum number of vowels.
Get word having maximum number of distinct characters e.g. word �simple� has 6 distinct character (s, i, m, p, l, e) but �sentence� has only 5 distinct characters (s, e, n, t, c).
Get paragraph with words in reverse order. E.g. 
Input : �This is simple sentence�, 
Output : �sentence simple is This�
Get top K words by frequency.

 



	 */
	
	//1.  Given a string which represents paragraph, write functions to
	//Get number of words in the paragraph.
	
	public static int getWordCount(String paragraph) {
		
		String[] words = paragraph.split("\\s");//splits the string based on whitespace  
		
		return words.length;
	}
	
	
	// 2. Get number of unique words.
	
	public static int getUniqueWordsCount(String paragraph) {
		
		String [] words = paragraph.split("\\s");
		Set<String> uniqueWords = new HashSet<String>();
		
		for (int i=0;i<words.length;i++) {
			uniqueWords.add(words[i]);
		}
		
		return uniqueWords.size();
	}
	
	
	//3. Get all words
	
	public static List<String> getAllWords(String paragraph) {
		List<String> allWords = new ArrayList<String>();
		
		String[] words = paragraph.split("\\s");
		
		for (int i=0;i<words.length;i++) {
			allWords.add(words[i]);
		}
		return allWords;
	}
	
	
	
	//  4.  Get all unique words.
	
	public static Set<String> getUniqueWord(String paragraph) {
		Set<String> uniqueWords = new HashSet<String>();
		
		String [] words = paragraph.split("\\s");
		
		for (int i=0;i<words.length;i++) {
			uniqueWords.add(words[i]);
		}
		
		return uniqueWords;
	}
	
	// 5.  Get most duplicate/repeated word/words .
	
	
	// 5.  Get most frequent word/words.
	
	public static List<String> getFrequentWord(String paragraph) {
		List<String> result = new ArrayList<String>();
		
		String [] str = paragraph.split("//s");
		
		
		return result;
	}
	
	
	
	// 6. Get most unique word/words.
	public static List<String> getMostUniqueWord(String paragraph) {
		List<String> result = new ArrayList<String>();
		
		String [] str = paragraph.split("//s");
		
		for (int i=0;i<str.length;i++) {
			for (int j=i+1;j<str.length;j++) {
				
				if (str[i] !=str[j]) {
					result.add(str[i]);
				}
			}
		}
		return result;
	}
	
	
	
	
	// 7. Number of characters excluding white spaces. (getCharWithoutWhiteSpace(String paragraph))
	
	public static int getCharacterCount(String paragraph) {
		
		String[] str = paragraph.split("\\s");
		
		int sum =0;
		for (int i=0;i<str.length;i++) {
			
			sum = sum+str[i].length();
		}
		
		return sum;
	}
	
	
	
	
	// 8. Get paragraph in title case. ((from given paragraph �This is a simple sentence�)
	public static List<String> getTitleCase(String paragraph) {
		
		List<String> titleCaseWord = new ArrayList<String>();
		
		String[] words = paragraph.split("\\s");
		//char[] ch = new char[200];
		
		//for (int i=0;i<words.length;i++) {
			
			//ch = words[i].toCharArray();
			
			//for (int j=0;j<ch.length;j++) {
			
				//String h = Character.toString(ch[j]).toUpperCase();
		
				titleCaseWord.add(words[0].toUpperCase());
				//break;
				
			//}
				
				//chars[0] = Character.toUpperCase(chars[0]);
			
		
		return titleCaseWord;
	}

	
	// 9. Get longest word in the paragraph.
	public static String getLongestWord(String paragraph) {
		
		String [] str = paragraph.split("\\s");
		
		int max = 0;
		
		String word ="";
		
		for (int i=0;i<str.length;i++) {
		
			if (max < str[i].length()) {
				max = str[i].length();
				word = str[i];
			}	
		}
		
		return word;
	}
	
	
	
	// 10. Get shortest word in the paragraph.
	public static String getShortestWord(String paragraph) {
		
      String [] str = paragraph.split("\\s");
		int min = 1;
		
		String word ="";
		
		for (int i=0;i<str.length;i++) {
		
			if (min >= str[i].length()) {
				min = str[i].length();
				word = str[i];
			}	
		}
		
		return word;
	}
	
	
	
	
	
	// 11. Get word having least vowels.
	public static String getLessVowelWord(String paragraph) {
		
		String[] str = paragraph.split("\\s");
		
		Map<String,Integer> maps = new TreeMap<String,Integer>();
		char[] ch = new char[200];
		
		int minVowelCount =0;
		int vowel =0;
		
		String word = "";
		int min = 1;
		
		for (int i=0;i<str.length;i++) {
			
			ch = str[i].toCharArray(); // (from given paragraph �This is a simple sentence�)
			
			for (int j=0;j<ch.length;j++) {
				if (ch[j]=='i'||ch[j]=='a'||ch[j]=='e'||ch[j]=='o'||ch[j]=='u')
					vowel = minVowelCount+1;
			}
		if (min <=vowel) {
			min = vowel;
			word = str[i];
		}
		}
		return word;
	
	}
	
	//Get word having maximum number of vowels.
	
	public static String getMaxVowelWord(String paragraph) {
		return "";
	}
	
	
	
	//Get word having maximum number of distinct characters e.g. word �simple� has 6 distinct character (s, i, m, p, l, e) but �sentence� has only 5 distinct characters (s, e, n, t, c).
	
	public static String getMaxDistinctCharWord(String paragraph) {
		return "";
	}
	
	// public static string titleCase(String s)
	
	//Get paragraph with words in reverse order. E.g. 
	//Input : �This is simple sentence�, 
	//Output : �sentence simple is This�
	
	public static List<String> getReverseParagraph(String paragraph) {
		
		String[] str = paragraph.split("\\s");
		List<String> reverseParagraph = new ArrayList<String>();
	
		for (int i=str.length-1;i>=0;i--) {
			reverseParagraph.add(str[i]);
			}
		
		return reverseParagraph;
	}
	

	//Get top K words by frequency. (Did not get)
	
	public static void main(String[] args)throws Exception,ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		String paragraph = "This is a simple sentence";
		int len = getWordCount(paragraph);
		
		System.out.println("Word count : "+len);
		
		
		// Map<String,Integer> getUniqueWordsCount(String paragraph)
		// Get number of unique words.
		
		//public static Map<String,Integer> getUniqueWordsCount(String paragraph)
		
		
		int result = getUniqueWordsCount(paragraph);
		System.out.println("unique word count : "+result);
		
		//System.out.println("Number of characters excluding white spaces : "+str.length);
		int result1 = getCharacterCount(paragraph);
		System.out.println("Number of characters excluding white spaces : "+result1);
		
		
		//Get longest word in the paragraph.
		//public static String getLongestWord(String paragraph)
		
		String str1 = getLongestWord(paragraph);
		System.out.println("//Get longest word in the paragraph : "+str1);
		
		
		
		// Get paragraph in title case. ((from given paragraph �This is a simple sentence�)
		//public static List<String> getTitleCase(String paragraph)

		List<String> rs1 = getTitleCase(paragraph);
		System.out.println("Title Case Char : "+rs1);
		
		
		//Get longest word in the paragraph.
		//public static String getLongestWord(String paragraph)
		
		String st2 = getLongestWord(paragraph);
		System.out.println("Longest word : "+st2);
		
		
		//Get shortest word in the paragraph.
		//public static String getShortestWord(String paragraph)
		
		String sr3 = getShortestWord(paragraph);
		System.out.println("Shortest word : "+sr3);
		
		
		// 11. Get word having least vowels.
		//public static String getLessVowelWord(String paragraph)
		
		String bt = getLessVowelWord(paragraph);
		System.out.println("Least vowel word : "+bt);
		
		
		
		//Get paragraph with words in reverse order. E.g. 
		//Input : �This is simple sentence�, 
		//Output : �sentence simple is This�
		
		//public static String[] getReverseParagraph(String paragraph)
		
		List<String> vg = getReverseParagraph(paragraph);
		System.out.println(vg);
		
	}

}
