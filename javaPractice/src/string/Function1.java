package string;
/*Given a string which represents paragraph, write functions to
Get number of words in the paragraph. 
Hint : Function signature may look like 
// Returns number of words in the paragraph e.g. if input is “This is a simple sentence”, it will return 5.
Int GetWordCount(String paragraph);
*/
public class Function1 {
	
	public int getWordCount(String paragraph) {
		
		String[] str = paragraph.split("\\s");
		return str.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//paragraph e.g. if input is “This is a simple sentence”, it will return 5.
		
		String str = "This is a simple sentence";
		Function1 ff = new Function1();
		
		System.out.println("Word count : "+ff.getWordCount(str));
		
	}

}
