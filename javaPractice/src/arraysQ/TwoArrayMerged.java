package arraysQ;

import java.util.Arrays;

public class TwoArrayMerged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int[] a1 = {6,3,8};
		int[] a2 = {1,4};
		int[] a3 = new int[a1.length+a2.length];
		
		for(int i=0;i<a1.length;i++) {
			a3[i] = a1[i];
			count++;
		}
		
		for(int j=0;j<a2.length;j++) {
			a3[count++] = a2[j];
		}
		
		System.out.println(Arrays.toString(a3));
		Arrays.sort(a3);
		System.out.println(Arrays.toString(a3));
	}

}
