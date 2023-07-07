//WAP to check whether a given number exists in the array or not.


import java.util.*;

public class Program2{


	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[10];

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter array elements: ");
			arr[i]=sc.nextInt();
		}

		System.out.print("Enter the value to be found: ");
		int number=sc.nextInt();
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(int number == arr[i])
			{
				System.out.print("Number found. ");
				temp=1;
				break;
			}

		}
		
		if(temp==0)
		{
			System.out.print("Number not found.");

		}


	}

}





