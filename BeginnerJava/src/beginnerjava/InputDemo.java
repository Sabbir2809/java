package beginnerjava;

import java.util.Scanner;

public class InputDemo {  
    
    public static void main(String[] args) {
        
        int i;
        String name;
        double d;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Interger number = "); 
        i = input.nextInt();
        
        System.out.println("Number = "+i);
        
        System.out.print("Enter any Double number = ");
        d = input.nextDouble();
        
        System.out.println("Number = \n"+d);

        System.out.print("Enter your name :");
        name = input.nextLine();
        
        System.out.println("Welcome:   "+name);

    }  
}
/*
import java.util.Scanner;

Scanner input = new Scanner (System.in);

int number;

number = input.nextInt();
*/