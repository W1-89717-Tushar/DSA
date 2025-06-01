package classwork;

import java.util.Arrays;

public class DescStack {
	
	public static void descStack(int arr[],int n) {
		int top = n;
		
		for(int i =0;i<n;i++) {
			top--;
			arr[top] = i;
		}
		System.out.println("array  : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[]= new int [6];
		
		int lenght = arr.length;
		
		descStack(arr, lenght);
	}

}
