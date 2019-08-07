package array;

import java.util.Arrays;

public class CompareTwoNumericArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {4,6,2};
		int[] array2 = {5,8,1};
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		System.out.println("array1 and array2 are equals : "+array1.equals(array2));
		
		// user define
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array2.length;j++) {
				if (array1[i] !=array2[j]) {
					break;
				}
			}
		}
		
		System.out.println("array1 and array2 are not equals");
	}

}
