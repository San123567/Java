import java.util.*;
public class LEAP{
    public static void main(String[] args) {
        int year = 2016;
        
        // Ternary Operator
        int check = ((year % 4 == 0 && year % 100 != 0) 
                    || (year % 400 == 0)) ? 1 : 0;
        
        if(check == 1)
            System.out.println("Year " + year + 
                            " is a leap year");
        else
            System.out.println("Year " + year + 
                            " is not a leap year");
    }
}
