
package beginnerjava;

import java.util.Scanner;

public class ConditionalDemo {
    
    public static void main(String[] args) {
        
        int num1,num2;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter Two number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        int large = ((num1 > num2)? num1 : num2);
        
        System.out.println("Large Number = "+large);
    }
    
}
