// WAP to demonstrate Method overloading.

import java.util.*;

class OverloadDemo{
	void test(){
		
		System.out.println("No parameters.");
	}
	
	void test(int a){

		System.out.println("a : "+a);
	}

	void test(int a, int b){

		System.out.println("a and b: "+a+" "+b);
	}

	void test(double a){

		System.out.println("double a: "+a);
	}

}

class Program6{

	public static void main(String args[])
	{

		OverloadDemo ob = new OverloadDemo();
		double result;
		ob test;
		ob test1;
	}



}
