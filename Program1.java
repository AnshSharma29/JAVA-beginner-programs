//WAP to accept 1D array, display the array elements and sum with only driver class and without making new class.

import java.util.*;
public class Program1
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the array elements: ");
			arr[i]=sc.nextInt();
		}
		
		int sum=0;

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			sum+=arr[i];
		}

		System.out.println("Sum= "+sum);
	}
}




