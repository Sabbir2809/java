
package beginnerjava;

import java.util.Scanner;

public class TriangleDemo {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        double base,height,Area;
      
        System.out.print("Enter Base : ");
        base = input.nextDouble();
        
        System.out.print("Enter Height : ");
        height = input.nextDouble();
        
        Area = 0.5 * base * height;
        System.out.println("Area of Triangle = "+Area);
        
        double pi=3.1416,r,area;
        System.out.print("Enter Radius : ");
        r = input.nextDouble();
        
        area = pi * r * r;
        System.out.println("Area of Circular = "+area);
    }
    
}
