package string;

public class ReturnFileExtension {
	/*
	 * Q : Write a function, which takes file_name as input and return file extension as output.
           e.g. input  = “abc.txt”, output = “txt”;
           input “C://ab/myfile.jpg”, output = “jpg”.

	 */
	public static String getFileExtension(String str) {
		
	    char ch = '.';
	    int a = 0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)==ch) {
				a = i;
				break;
			}
		}
		return str.substring(a+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input  = "abc.txt"; // output = “txt”;
		String input1 =  "C://ab/myfile.jpg";  // output = “jpg”.
		System.out.println(getFileExtension(input));
		System.out.println(getFileExtension(input1));


	}

}
