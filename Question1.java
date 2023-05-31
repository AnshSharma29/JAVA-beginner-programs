//WAP to find out factorial of a number through recursion.

package question1;
import java.util.*;
public class Question1 {
    
    static int factorial(int a){
        if(a==0)
            return 1;
        else{
            return (a*factorial(a-1));
        }
    }

    public static void main(String[] args) {
        
        int i,fact=1;
        int number=6;
        fact=factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
        
    }
}





//

