package arraysQ;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {3, 7, 1, 9};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		// manually
		
		int max = 0;
		
		for (int i=0; i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				
				if (array[i] > array[j]) {
					max = array[i];
					array[i] = array[j];
					array[j] = max;
				}
			}
		}

		System.out.println("manually array sorted : "+Arrays.toString(array));
	}

}
