package string_Bhaiya;

public class StringLength {
	/*
	 * Q : Write a function which extracts last 3 characters in the given string.
           e.g. if input = �Anamika�, then output should be �ika�;
           If input = �1234�, then output should be �234�.

	 */

	public String getSubString(String name) {
		
		int len1 = name.length()-3;
	
		return name.substring(len1);
	}
	
	
	public String getFileExtension(String name) {
		
		int length = 0;
		char s = '.'; 
		
		for (int i=0;i<name.length();i++) {
			if (name.charAt(i)==s) {
				length = i;
				break;
			}
		}
		return name.substring(length+1);
	}
	
	/*
	 * Q : Define this function.
         // Returns true if firstString contains secondString ignoring case.
         // Returns false otherwise.
          boolean containsIgnoreCase(String firstString, String secondString);

	 */
	public boolean getString1(String s1, String s2) {
		return s1.contains(s2);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Anamika Kumari";
		System.out.println(name.length());
		
		// Q : What will be length of string �123  � ?

		String length1 = "123 ";
		System.out.println("Q : What will be length of string 123  : " +length1.length());
		
		
		//Q : What will be value of toUpperCase of �dimpal.tarwan1� ?
        
		String value = "dimpal.tarwan1";
		System.out.println("Q : What will be value of toUpperCase of �dimpal.tarwan1� ? "+value.toUpperCase());
		
		//String substring(int index);

		String name1 = "dimpal";
		// find substring at index 3
		
		try {
		
		System.out.println("Substring of dimpal at index 3 is : "+name1.substring(3));
		
		}catch(Exception e) {
			System.out.println("Exception found");
		}
		
		
		// getSubString(String name)
		StringLength ss = new StringLength();
		
		String namename = "dimpal";
		
		String s1 = ss.getSubString(namename);
		System.out.println("Substring : "+s1);
		
		
		// file extension 
		StringLength sss = new StringLength();
		String h = "abc.txt";
		String df = "C://ab/myfile.jpg";
		String sd = sss.getFileExtension(df);
		System.out.println("File extension : "+sd);
		
		
		//Q : What will be value of comparison of �100� and �21� ?

		String a1 = "100";
		String a2 = "21";
		System.out.println(a1.compareTo(a2));
		
		String as = "AL";
		StringLength ss1 = new StringLength();
		
		// getContainsString(String s1, String s2)
		boolean res = ss1.getString1(namename, as);
		System.out.println(res);
		
		/*
		 * Splits the string based on regex. e.g.
String s = �abc, 4, 5�;
String[] parts = s.split(�,�);
In string array , parts[0] will be �abc�, parts[1] = 4 and parts[2] will be 5.

		 */
		
		String s3 = "abc, 4, 5";
		String[] parts = s3.split(",");
		for(String s4 : parts) {
			System.out.print(s4+" ");
		}
		
		System.out.println();
		// Q : Split �Anamika Kumari� using space.
		
		String s5 = "Anamika Kumari";
		String[] parts1 = s5.split("\\s");
		for(String namee : parts1) {
			System.out.print(namee+" ");
		}
		System.out.println();
		
		// Q : Split �Mukesh 40 67 50� using space.
		String s6 = "Mukesh 40 67 50";
		String[] parts2 = s6.split("\\s");
		for(String nam : parts2) {
			System.out.println(nam);
		}
		
		// Trim()
		String s7 = " anamika kumari  ";
		
		String trim1 = s7.trim();
		System.out.println(trim1);
		
		// replace all
		String s8 = "1==2==3-4";
		String replace = s8.replaceAll("==", ",");
		System.out.println(replace);
	}

}
