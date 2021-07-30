//7. Write a program to find the largest number in a list of Array.
package lab_exercise;

import java.util.Scanner;

public class Largest_Number_Array {
    
    public static void main(String[] args) {
        
        int[] number = new int[100];
        
        System.out.print("How many number : "); 
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Input the "+i+ "number:");
            number[i] = input.nextInt();  
        }
        int min = number[0];
        
        for (int i = 1; i < n; i++) {
            
            if(min > number[i]){
                
                min = number[i];
            }  
        }
        System.out.println("The smallest value is "+min);
    }   
}
