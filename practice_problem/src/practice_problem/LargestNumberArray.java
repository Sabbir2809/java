//Write a program in java to Find Largest Number in an array.
package practice_problem;

import java.util.Scanner;

public class LargestNumberArray {
    
    public static void main(String[] args) {
        
        int number;
        Scanner input = new Scanner(System.in);
        
        System.out.print("How Elements in the array: ");
        number = input.nextInt();
        
        int[] array = new int[number];
        System.out.print("Enter elements of array: ");
        
        for (int i = 0; i < number; i++) {
            
            array[i] = input.nextInt(); 
            
        }
        int largest = array[0];
        
        for (int i = 0; i < number; i++) {
            
            if(largest < array[i]){
                
                largest = array[i];
            }
            
        }
        System.out.println("Largest Number in an Array = "+largest);
        
    }
    
}
