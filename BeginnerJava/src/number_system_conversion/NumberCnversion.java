
package number_system_conversion;

import java.util.Scanner;

public class NumberCnversion {
    
    public static void main(String[] args) {
        
        String hax = "A";//binary,octal,hexadecimal-----decimal 
        
        Integer decimal = Integer.parseInt(hax, 16);
        
        System.out.println(decimal);
        

        int decimal1;// decimal----binary,octal,hexadecimal
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any decimal number: ");
        
        decimal1 = input.nextInt();
        
        String binary1 = Integer.toBinaryString(decimal1);
        System.out.println(binary1);
        
    }
    
}