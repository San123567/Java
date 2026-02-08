import java.util.*;

public class EvenOdd {

    public static void main(String[] args){
        int n = 7;

        // We use bitwise (&) operator
        if ((n & 1) == 1) 
            System.out.print("Number is Odd");
        else
            System.out.print("Number is Even");
    }
}
