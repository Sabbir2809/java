
package beginnerjava;

import java.util.Scanner;

public class LoopDemo {
    
    public static void main(String[] args) {
        
        int sum=0,m,n;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter initial number : ");
        m = input.nextInt();
        
        System.out.println("Enter Final number : ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            
            if (i%2==0) {
                sum= sum + i; 
                System.out.println(" "+i);
                
            }
            //sum= sum + i;
            
        }
        System.out.println("The Sum is = "+sum);
    }
    
}
