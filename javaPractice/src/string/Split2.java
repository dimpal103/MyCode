package string;

import java.util.Arrays;

public class Split2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q : Split �Anamika Kumari� using space.

		String s1 = "Anamika Kumari";
		String [] parts = s1.split("\\s");
		System.out.println(Arrays.toString(parts));
		
		
		// Q : Split �Mukesh 40 67 50� using space.
		String s2 = "Mukesh 40 67 50";
		System.out.println(s2.length());
		String[] parts1 = s2.split("\\s");
		System.out.println(Arrays.toString(parts1));
		
		System.out.println(parts1.length);
		
		// String trim()

		String s3 = " anamika kumari ";
		System.out.println(s3.trim());
		
		// String s = �1==2==3-4�;
         String s4 = "1==2==3-4";
         System.out.println(s4.replaceAll("==", ","));
	}

}
