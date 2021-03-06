package string;

public class Last3SubString {
	/*
	 * Q : Write a function which extracts last 3 characters in the given string.
           e.g. if input = �Anamika�, then output should be �ika�;
           If input = �1234�, then output should be �234�.

	 */
	public static String getLast3SubString(String str) {
		return str.substring(str.length()-3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "chanchal";
		String result = getLast3SubString(str);
		System.out.println("Last 3 substring of ["+str+"] : "+result);
	}

}
