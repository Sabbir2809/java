//(3) Write a program to evaluate the following series 1-2+3-4+.........+ Up to n terms
package lab_exercise;

import java.util.Scanner;

public class SeriesDemo2 {
    public static void main(String[] args) {
        
        int n,sum=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(" "+i);
            sum = sum + i;
            
        }
        System.out.println("\nThe Sum is = "+sum);
    }   
}
