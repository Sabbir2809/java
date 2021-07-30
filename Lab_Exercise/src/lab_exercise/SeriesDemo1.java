//2. Write a program to evaluate the following series 1^2+3^2+5^2+…. Up to n terms
package lab_exercise;

import java.util.Scanner;

public class SeriesDemo1 {
    
    public static void main(String[] args) {
        
        int n,sum=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i=i+2) {
            
            System.out.print(" "+i);
            sum = sum + i*i;
            
        }
        System.out.println(" Sum is = "+sum);
        
    } 
}
