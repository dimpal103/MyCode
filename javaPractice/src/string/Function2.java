package string;

import java.util.HashSet;
import java.util.Set;

// 2. Get number of unique words. of paragraph "This is a simple sentence"
// Using For Each

public class Function2 {
	
	public int getUniqueWordCount(String paragraph) {
		
		String[] words = paragraph.split("\\s");
		
		Set<String> uniqueWords = new HashSet<String>();
		
		
		for (String name : words) {
			uniqueWords.add(name);
		}
		
		
		return uniqueWords.size();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//paragraph e.g. if input is “This is a simple sentence”, it will return 5.
		
				String str = "This is a simple sentence";
				Function2 ff = new Function2();
				
				System.out.println("Unique Word count : "+ff.getUniqueWordCount(str));
	}

}

// OUTPUT
//Unique Word count : 5