//8. Write a program to sort some number in ascending order.
package lab_exercise;

import java.util.Arrays;

public class Ascending_Order {
    
    public static void main(String[] args) {
        
        int[] number = {10,-20,30,50,60};
        
        Arrays.sort(number);
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ascending = "+number[i]);
            
        }
        
    }
    
}
