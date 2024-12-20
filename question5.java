package Day01;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		System.out.println("Enter "+size+" elements: ");
		
		int arr[] = new int[size];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("mid element is: ");
		
		if(size %2==0)
		{
			System.out.println(arr[(arr.length/2)-1] +" and "+arr[arr.length/2]);	
		}
		else
		{
			System.out.println(arr[arr.length/2]);	
		}
	}

}
