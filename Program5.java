//WAP to create a class Student having fields name, rollno, marks in 5 subjects.
//The class should contain 2 functions void accept and void display_result which 
//displays the average marks.

import java.util.*;

class Student{

	public String name;
	public long rollno;
	public int marks[]=new int[5];

	public void accept(){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Enter your roll no.: ");
		rollno = sc.nextLong();
		for(int i=0; i<5; i++){

			System.out.print("Enter the marks in 5 subjects: ");
			marks[i] = sc.nextInt();
		}

	}

	public display_result(){

		int sum=0;
		for(i=0; i<marks.length; i++){

			sum+=marks[i];
		}
		return (sum/5);

	}
}

public class Program5{

	public static void main(String args[]){

		Student Ap = new Student();
		Ap.accept();
		double input2 = Ap.display_result();
		System.out.println("Name of Student: "+Ap.name);
		System.out.println("Roll number of Student: "+Ap.rollno);
		System.out.println("Average Marks of Student: "+Ap.input2);

	}
}










