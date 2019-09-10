package part_1;

import java.util.ArrayList;
import java.util.List;

//Q.3 List to list after removing duplicates

public class Q3 {
	public static List<String> removeduplicateFromOneListAndPutInAnotherList(List<String> list) {
		List<String> list1 = list;
		
		List<String> list2 = new ArrayList<String>();
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)!=list1.get(i+1)) {
				
				list2.add(list1.get(i));
			}
		}
		
		return list2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<String>();
		list1.add("ana");
		list1.add("sonu");
		list1.add("ana");
		list1.add("monu");
		
		
		System.out.println(removeduplicateFromOneListAndPutInAnotherList(list1));

	}

}
