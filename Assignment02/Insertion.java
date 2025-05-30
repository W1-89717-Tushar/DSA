package classwork;

import java.util.Arrays;

public class Insertion {
	
	
	public static void insertionSort(int arr[],int n) {
		int i;
		for(i =1; i<n; i++) {
			int key,j;
			j = i-1;
			key = arr[i];
			while( j>=0 && key > arr[j] ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		int arr[] = {10,20,33,26,12,56,45,9};
		
		
		System.out.println("array before sorting" +Arrays.toString(arr));
		int length  = arr.length;
		
		insertionSort(arr,length);
		System.out.println("array after sorting" + Arrays.toString(arr));
	}

}
