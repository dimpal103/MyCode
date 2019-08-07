package interviewPractice;

import java.util.Arrays;

public class BinarySearch {
	
	//public static void binarySearch(int arr[], int first, int last, int key){ 
		
	 // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    int binarySearch(int arr[], int first, int last, int x) 
    { 
        if (last >= first) { 
            int mid = first + (last - 1) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, first, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, last, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        //int x = 10; 
        int x = 4;
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result+" And element is : "+arr[result]); 
    } 
		

	}


