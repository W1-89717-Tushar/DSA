package Assignment01;

import java.util.Scanner;

public class Search {
	
	public static int last_occ(int arr[] , int length , int key) {
		
		int last_occ = 0;
		for(int i = 0;i<=length -1 ; i++) {
			if(arr[i] == key) {
			 last_occ = i;
			}
		}
		return last_occ;
	}

	public static void main(String[] args) {
		
			int arr[]  = {10,12,23,43,10,12,21,10,33};
		
			
			System.out.println("Enter number to search: ");
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			
			int length = arr.length;
			
			int last_occ = last_occ(arr,length,key);
			System.out.println("the last occurance of "+ key + " is index " + last_occ);
	}

}
