//Write a program to find the square of the number 4
package practice_problem;

import java.util.Scanner;

public class SquareDemo {
    
    public static void main(String[] args) {
        
        int x;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any integer number: ");
        x = input.nextInt();
        
        //input.close();
        
        int square = x*x;
        
        System.out.println("The Square number is: "+square);
 
    } 
}
