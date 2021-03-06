package string;

import java.util.Arrays;

public class Split1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc, 4, 5";
		
		int[] a1 = {1,4,5};
		System.out.println(Arrays.toString(a1));
		
		String parts[] = s1.split(",");
		
		System.out.println("Array printing using Arrays.toString()");
		System.out.println(Arrays.toString(parts));
		
		System.out.println("Array printing using for each");
		for(String s2 : parts) {
			System.out.println(s2);
		}
		
		System.out.println("Array printing using basic way");
		for (int i=0;i<parts.length;i++) {
			System.out.println(parts[i]);
		}
	}

}
