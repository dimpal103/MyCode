package arraysQ;

public class CommonElementInArrayDate8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {1,8,3,10};
		
		int[] array2 = {4,3,11,9};
		
		int duplicate = 0;
		
		for (int i=0;i<array1.length;i++) {
			
			for (int j=0;j<array2.length;j++) {
				
				if (array1[i]== array2[j]) {
			
					duplicate = array1[i];
					break;
				}
			}
		}
		
		System.out.println("Duplicate element in two array : "+duplicate);
	}

}
