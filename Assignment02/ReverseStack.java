package classwork;

import java.util.Arrays;

public class ReverseStack {
	
	public static void reverceArray(int arr[],int n) {
		int arr2[] = new int [n];
		int top = -1;
		
		for(int i=0;i<n;i++) {
			top++;
			arr2[top] = arr[n-1-i];
		}
		System.out.println("array after reverse : " + Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		
		System.out.println("array : " + Arrays.toString(arr));
		
		int length  = arr.length;
		
		 reverceArray(arr, length);
		
	}

}
