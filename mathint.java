import java.util.*;
import java.lang.Math;

public class WsCube {
    public static void main(String[] args) {
        
        // Long value
        long longValue = 5000L;                        
        
        // Safe conversion
        int intValue = Math.toIntExact(longValue);     
        System.out.println("Converted: " + intValue);
    }
}
