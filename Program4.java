// WAP to create a class circle & calculate its area and circumference.

class Circle{
	public double r;

	public double circumference(){

		return 2*3.14*r;
	}

	public double area(){

	return 3.14*r*r;
	}
}

public class Program4{
	public static void main(String args[]){

		Circle aCircle = new Circle();
		aCircle.r =5;
		double area = aCircle.area();
		double circum = aCircle.circumference();
		System.out.println("Area = "+area);
		System.out.println("Circumference = "+circum);
	}

}



