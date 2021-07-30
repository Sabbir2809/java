//Write a Java method to find the smallest number among three numbers.
package lab_exercise;

import java.util.Scanner;

public class SmallestNumber {
    
    public static void main(String[] args) {
        
        double a,b,c;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        a = input.nextDouble();
        
        System.out.print("Input the Second number: ");
        b = input.nextDouble();
        
        System.out.print("Input the third number: ");
        c = input.nextDouble();
        
        double small = smallest(a, b, c);
        System.out.println("The smallest value is :" +small+" ");
    }

    static double smallest(double x, double y, double z){
        
        double min = Math.min(Math.min(x, y), z);
        
        return min;
    } 
}