package part_1;
import java.util.*;

public class ConvertSetToList {
	// 2. Convert Set to list
	
	public static List<String> convertSetToList(Set<String> wordSet) {
		
		Set<String> wordSet1 = wordSet;
		
		List<String> wordList = new ArrayList<String>();
		
		for (String s : wordSet1) {
			
			wordList.add(s);
		}
		
		return wordList;
	}
	
	// 3. List to list after removing duplicates
	
	public static List<String> reomoveDuplicateListElement(List<String> wordList) {
		
		List<String> wordList1 = wordList;
		
		List<String> listWithNoDuplicate = new ArrayList<String>();
		
		Set<String> wordSet = new HashSet<String>();
		wordSet.addAll(wordList1);
		
		listWithNoDuplicate.addAll(wordSet);
		
		return listWithNoDuplicate;
	}
	
	
	
	// 4. List to sorted list.
	
	public static List<String> getSortedList(List<String> wordList) {
		
		List<String> wordList1 = wordList;
		
		Collections.sort(wordList1);
		
		return wordList1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> wordSet = new HashSet<String>();
		wordSet.add("anamika");
		wordSet.add("dimpal");
		wordSet.add("ana");
		wordSet.add("sonu");
		wordSet.add("de");
		
		System.out.println("ConvertSetToList : "+convertSetToList(wordSet));
		
		System.out.println();
		
		
		
		// 3. List to list after removing duplicates
		//public static List<String> reomoveDuplicateListElement(List<String> wordList)
		
		List<String> wordList = new ArrayList<String>();
		wordList.add("anamika");
		wordList.add("dimpal");
		wordList.add("ana");
		wordList.add("sonu");
		wordList.add("ana");
		
		System.out.println("ReomoveDuplicateListElement : " +reomoveDuplicateListElement(wordList));
		
		System.out.println();
		// 4. List to sorted list.
		//public static List<String> getSortedList(List<String> wordList) 
		System.out.println("Sorted list : "+getSortedList(wordList) );
		
	}

}
