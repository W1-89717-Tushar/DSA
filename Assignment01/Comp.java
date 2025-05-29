package Assignment01;

import java.util.Scanner;

public class Comp {
	
	public static void binarySearch(int arr[],int l ,int r,int key,int count) {
		int mid = (l+r)/2;
		
		if(l>r) System.out.println("not found");
		
		
		if(key == arr[mid]) {
			System.out.println("number of comparison in Binary search : " + count);
		}
		else if(key <= arr[mid]) {
			count++;
			binarySearch(arr, l, mid-1, key,count);
		}
		else {
			count++;
			binarySearch(arr, mid+1, r, key,count);
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]  = {10,12,23,43,45,67,87,90,99};
		
		
		System.out.println("Enter number to search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int length = arr.length;
		int count = 1;
		
		for(int i = 0;i<=length -1 ; i++) {
			if(arr[i] == key) {
				System.out.println("number of comparison in linear search : " + count);
			}
			else {
				count++;
			}
		}
		
		int left = 0;
		int right  = length-1;
		int bcount = 1;
	
		binarySearch(arr, left, right, key,bcount);
	}

}
