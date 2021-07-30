package scanner;

import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x;
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        
        System.out.println("X = "+x);
        
        long y;
        System.out.print("Enter the value of y: ");
        y = sc.nextLong();
      
        System.out.println(" = "+y);
        
        double z;
        System.out.print("Enter the value of z: ");
        z = sc.nextDouble();
      
        System.out.println("X = "+z);
        
        String s = sc.next();
        System.out.println("You Entered :"+s);
    }
    
}
