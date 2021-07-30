//5. Write a program to find the power for a given base and exponent.
package lab_exercise;

import java.util.Scanner;

public class PowerBaseExponent {
    
    public static void main(String[] args) {
             
        int base,exponent;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a base : ");
        base=input.nextInt();
        
        System.out.print("Enter an exponent : ");
        exponent = input.nextInt();
        
        double power = Math.pow(base,exponent);
        
        System.out.println("Power is : "+power);
    
        
    }
  
}
