package Assignment01;

import java.util.Scanner;

public class Ranked {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]  = {1,2,3,4,3,2,1,2,3,1,5,6,2};
		
		System.out.println("Enter number to search: ");
		int key = sc.nextInt();
		
		int length = arr.length-1;
		int count = 0;
		for(int i =0;i<=length;i++) {
			if(arr[i] <= key)
				count++;
		}
		System.out.println("The rank of "+ key + " is " + count);
	}

}
