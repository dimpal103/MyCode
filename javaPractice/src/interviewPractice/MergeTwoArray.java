
package interviewPractice;

import java.util.Arrays;
import java.util.List;

// take array1 : {8,2,9};   array2 = {3,4}; .... merge this two array in another array

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {8,2,9};
		int[] array2 = {3,4};
	
		
		int[] array3 = new int[array1.length+array2.length];
		int count = 0;
		
		
		for (int i=0;i<array1.length;i++) {
			array3[i] = array1[i];
			count++;
		}
		for (int j=0;j<array2.length;j++) {
			array3[count++] = array2[j];
		}
		
		//List<Integer> array1List = Arrays.asList(array1);
		//System.out.println("Arrays 1 : " + array1List);

		// Array1 elements
		System.out.print("Array1 : ");
		System.out.print(Arrays.toString(array1));
		
		
		//System.out.println(Arrays.asList(array1));

		
		System.out.println();
		// Array2 elements
		System.out.print("Array2 : ");
		for (int jj=0;jj<array2.length;jj++) {
			System.out.print(array2[jj]+" ");
		}
		
		System.out.println();
		// merged array
		System.out.print("Merged Array i.e Array3 : ");
		for (int k=0;k<array3.length;k++) {
			System.out.print(array3[k]+" ");
		}
	}

}
