//(a)Write a Java program to convert temperature from Fahrenheit to Celsius degree.
package lab_exercise;

import java.util.Scanner;

public class TemperatureConversion {
    
    public static void main(String[] args) {
        
        double fahrenheit,celsius;
        
        Scanner input = new Scanner(System.in);
            
        System.out.print("Input a degree in Fahrenheit : ");
        fahrenheit = input.nextInt();
        
        celsius = (fahrenheit-32)/1.8;
        
        System.out.println(fahrenheit+ " degree Fahrenheit is equal to "+celsius+ " in Celsius.");
    } 
}
