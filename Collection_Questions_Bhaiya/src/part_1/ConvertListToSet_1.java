// Collection Questions


package part_1;

import java.util.*;

public class ConvertListToSet_1 {
	
	// 1. Convert list to set
	public static Set<String> convertListToSet(List<String> list) {
		
		List<String> list1 = list;
		
		Set<String> wordSet = new HashSet<String>();
		
		for (String s : list1) {
			
			wordSet.add(s);
		}
		
		return wordSet;
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> wordList = new ArrayList<String>();
		
		wordList.add("anamika");
		wordList.add("dimpal");
		wordList.add("chanchal");
		wordList.add("monu");
		
		
		System.out.println(convertListToSet(wordList));
		
	}

}
