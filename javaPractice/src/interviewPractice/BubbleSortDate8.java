package interviewPractice;

import java.util.Arrays;

public class BubbleSortDate8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int[] a = {1,8,6,4};
		
		for (int i=0;i<a.length;i++) {
			
			for (int j=i+1;j<a.length;j++) {
				
				if (a[i] > a[j]) {
					max = a[i];
					a[i] = a[j];
					a[j] = max;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
