package string;

public class StringPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123 ";
		System.out.println("Length of 123  : "+str.length());
		System.out.println("Length of 123 after trim() : "+str.trim().length());
		
		String s1 = "anamika";
		String s2 = new String("anamika");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		// Q : What will be value of toUpperCase of �dimpal.tarwan1� ?
           String dimpal = "dimpal.tarwan1";
           System.out.println(dimpal.toUpperCase());
           
       // String substring(int index);
           String subStr = "anamika";
           System.out.println(subStr.substring(3));
	}

}
