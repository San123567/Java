import java.util.*;

public class WsCube {
    public static void main(String[] args) {
        int a = 3, b = 7, c = 18;
        
        // Assume a is the largest
        int largest = a; 

        // Check if b is greater 
        // than current largest
        if(b > largest)
            largest = b;

        // Check if c is greater than 
        // current largest
        if(c > largest)
            largest = c;

        System.out.println("The largest number is: " 
                                         + largest);
    }
}
