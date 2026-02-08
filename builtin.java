import java.util.*;
import java.time.*;
import java.util.*;

public class LEAP{
    public static void main(String[] args) {
        int year = 2016;
        boolean check = false;
        Year yearCheck = Year.of(year);
        
   
        check = yearCheck.isLeap();
        
        
        if(check)
            System.out.println("Year " + year + 
                            " is a leap year");
        else
            System.out.println("Year " + year + 
                            " is not a leap year");
    }
}
