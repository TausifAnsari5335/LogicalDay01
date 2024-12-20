package Day01;

import java.util.Random;
import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		Random r = new Random();
		
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = r.nextInt(100) + 1;
		}
		
		System.out.println("Array elements are : ");
		
		for(int i=0 ; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
