//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.
package practice_problem;

import java.util.Scanner;

public class StudentMarks {
    
    public static void main(String[] args) {
        
        int roll,marks,sum=0;
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 2; i++) {
            
            System.out.printf("Enter Roll Number = ");
            roll=input.nextInt();
            
            for (int j = 1; j <= 3; j++) {
                
                System.out.printf("Enter Marks of Subject[%d] : ",j);
                marks = input.nextInt();
                sum = sum + marks;
            }
            System.out.println("");
            
            double average = (double)sum/3;
            
            System.out.println ("The Roll Number of Student "+": "+roll);
            System.out.println("Average Marks : "+average);
            
            System.out.println("");
  
        }
    }
}
