package Assignment01;

import java.util.Scanner;

public class DescSearch {
	
	public static int binarySearch(int arr[],int l ,int r,int key) {
		int mid = (l+r)/2;
		
		if(l>r) return -1;
		
		
		if(key == arr[mid]) {
			return mid;
		}
		else if(key <= arr[mid]) {
			return binarySearch(arr, mid+1, r, key);
		}
		else {
			return binarySearch(arr, l, mid-1, key);
		}
	}

	public static void main(String[] args) {
		
		int arr[]  = {99,87,76,65,54,43,33,21,10,6};
		
		System.out.println("Enter number to search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();

		int left = 0;
		int right = arr.length-1;
		
		int index = binarySearch(arr, left, right, key);
		if(index == -1) System.out.println("element is not in array ");
		else System.out.println("element is found at index "+ index);
	}

}
