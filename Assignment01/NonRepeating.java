package Assignment01;

import java.util.Scanner;

public class NonRepeating {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]  = {1,2,3,4,3,2,1,2,3,1,5,6,2};
		
		int length = arr.length-1;
		//System.out.println(length);
		boolean check=false;
		int res=0;
		for(int i = 0; i <=length ; i++) {
			for(int j=i+1;j<=length;j++) {
				if(arr[i] == arr[j]) {
					break;
				}
				else if(j == length){
					check=true;
					res=arr[i];
					break;
				}
			}
			if(check) {
				System.out.println("first non repeating element of array is :" + res);
				break;
			}
		}

	}

}
