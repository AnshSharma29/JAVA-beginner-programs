// WAP to Create a class box having height, width , depth as the instance variables & 
//calculate its volume. Implement constructor overloading in it. Create a subclass 
//named box_new that has weight as an instance variable. Use super in the box_new 
//class to initialize members of the base class

package program11;

class Box {
private double height;
private double width;
private double depth;

public Box() {
this.height = 0;
this.width = 0;
this.depth = 0;
}

public Box(double value) {
this.height = value;
this.width = value;
this.depth = value;
}

public Box(double height, double width, double depth) {
this.height = height;
this.width = width;
this.depth = depth;
}

public double getVolume() {
return (height * width * depth);
}
}




class Box_new extends Box {
private double weight;

Box_new(double height, double width, double depth, double weight) {
super(height, width, depth);
this.weight = weight;
}
}
public class Program11 {

    public static void main(String[] args) {
        
        Box_new a = new Box_new(5,10,12,6);
        System.out.println("The  Volume is: "+a.getVolume());
    }
}





