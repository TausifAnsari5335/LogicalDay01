package Day01;

import java.util.Scanner;

public class question6 {
	
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The first and last elements sum is: ");
		System.out.println(arr[0]+arr[arr.length-1]);
		

		
		
		
		
		

	}

}
