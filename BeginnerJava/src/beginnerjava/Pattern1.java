
package beginnerjava;

import java.util.Scanner;

public class Pattern1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("How many number:");
        
        num = input.nextInt();
        
        for (int row = 0; row <= num; row++) {
            
            for (int col = row; col <= num; col++) {
                System.out.print(" "+col);
            }
            System.out.println("");
            
        }
        
    }
    
}
