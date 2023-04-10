#WAP to reverse an array.

import java.util.*;

public class Program3{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int arr[]= new int[10];

		for(int i=0;i<arr.length;i++){

			System.out.println("Enter array elements: ");
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);
			
		}

		for(int i= arr.length;i>=0;i--){

			System.out.print(arr[i]);
		}

	}


}
