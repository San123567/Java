import java.util.*;

public class WsCube {
    public static void main(String[] args) {
        
        // Invalid double
        String str[] = {"abc", "11.1"};  
        
        // Iterate over string array
        for(int i = 0; i < 2; i++){
            try {
                
                // May throw error
                double value = Double.parseDouble(str[i]);  
                System.out.println("Safely Converted: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + str[i]);
            }
        }
    }
}
