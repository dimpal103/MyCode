package interviewPractice;

public class ReverseStringDate8 {

	public static String getReverseString (String str) {
		
		int length = str.length()-1;
		String reverse = "";
		
		for (int i = length;i>=0;i--) {
			
			reverse = reverse + str.charAt(i);
		}
		
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.println("Reverse of anamika : "+getReverseString("anamika"));
	}

}
