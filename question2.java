package Day01;
import java.util.Scanner;
public class question2 {
	
	
	public static void print(int arr[])
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		print(arr);
		
		

	}

}
