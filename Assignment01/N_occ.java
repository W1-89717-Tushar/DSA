package Assignment01;

import java.util.Scanner;

public class N_occ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[]  = {1,2,3,4,3,2,1,2,3,1,5,6,2};
		
		System.out.println("Enter number to search: ");
		int key = sc.nextInt();
		System.out.println("enter nth occurance of number: ");
		int occ = sc.nextInt();
		
		int length = arr.length-1;
		int count = 0;
		for(int i=0;i<=length ;i++) {
			if(key == arr[i]) {
				count++;
				if(occ == count) {
					System.out.println(occ+"th occurance of " + key +"found at index :" + i);
				}
				if(occ > count) {
					System.out.println(occ+" th occurance of " + key +" not found ");
				}
			}
		}

	}

}
