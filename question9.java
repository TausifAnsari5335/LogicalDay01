package Day01;

import java.util.Scanner;

public class question9 {

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
		
		
		int sum = 0 ;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum +=arr[i];
		}
		
		int avg = sum /size;
		System.out.println("Average is : "+avg);

	}

}
