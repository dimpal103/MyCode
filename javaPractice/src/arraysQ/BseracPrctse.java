package arraysQ;

public class BseracPrctse {
	public static int doBinarySearch (int[] array, int first, int last, int element) {
		
		if (last>=first) {
			
			int mid = (first+last)/2;
			
			if (array[mid] == element) {
				return mid;
			}
			
			if (array[mid] > element) {
				return doBinarySearch(array, first, mid-1, element);
			}
			else {
				return doBinarySearch(array, mid+1, last, element);
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
