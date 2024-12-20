package Day01;
import java.util.Scanner;
public class DynamicarrayExample {
	
	public static void print(int[] arr)
	{
		System.out.println("Array elements are: ");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		
		int[] arr = new int[size];
		
		System.out.println("Enter array elements: ");
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		print(arr);
		
	}
}
