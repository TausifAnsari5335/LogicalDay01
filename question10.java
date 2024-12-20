package Day01;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		
		for(int i=0 ;  i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		
		System.out.println("Reverse array: ");
		for(int i=(arr.length)-1 ; i>=0 ; i--)
		{
			System.out.println(arr[i]);
		}

	}

}
