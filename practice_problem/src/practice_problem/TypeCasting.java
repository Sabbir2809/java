//Write a program to assign a value of 45 to a double variable and then convert it to int.
package practice_problem;

import java.util.Scanner;

public class TypeCasting {
    
    public static void main(String[] args) {
        
        double x;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        x = input.nextDouble();
        
        //input.close();
        
        System.out.println("The integer value of: "+(int)x);
        
        
    }
    
}
