
package lab_exercise;

import java.util.Scanner;

public class Factorial_Number {
    
    public static void main(String[] args) {
        
        int n,fact=1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            fact = fact * i;
        }
        System.out.println("Factorial Number = "+fact);
    }
    
}

