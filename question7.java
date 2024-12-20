package Day01;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enetr the array elements: ");
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Even elements: ");
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd Elements are: ");
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(!(arr[i]%2==0))
			{
				System.out.println(arr[i]);
			}
		}
		
		

	}

}
