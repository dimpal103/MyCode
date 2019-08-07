
public class Immutable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "dimpal";
		String s2 = "dimpal";
		String s3 = new String("dimpal");
		
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s1.equals(s3));//true
		
		
		//=============================
		
		System.out.println(s1==s3);//false why?
		// because string compare by operator == compares reference and not values .....
		// Hence, though the value of s1 and s3 are same 
		//but (s1 and s3 are not referring the same string ..... what does it mean ... I did not get)
		
	}

}
