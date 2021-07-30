
package lab_exercise;

import java.util.Scanner;

public class Test_Leap_Year {
    
    public static void main(String[] args) {
        
        int year;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any year : ");
        year = input.nextInt();
        
        if (((year % 4 == 0)&&(year % 100!= 0))||(year % 400 == 0)){
         System.out.println("Leap year");
        }
        else{
         System.out.println("Not a Leap year");
        }
    }
    
}
