package string;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "dimpal";
		
		String s1 = new String("dimpal");
		
		String s2 = new String("dimpal");
		
		// here in above ........ Three objects are created 
		// and There are three reference variables .... s, s1 and s2
		
		System.out.println("See result of == : "+(s==s1));
		
		System.out.println("See result of .equals() : "+s.equals(s1));
		
		System.out.println("See result of == : "+(s1==s2));
	}

}
// OUTPUT
//false
//See result of .equals() : true