
package beginnerjava;

public class MatheDemo {
    
    public static void main(String[] args) {
        
        int x= 2;
        int y= 3;
        
        int max = Math.max(x,y);
        System.out.println("Maximum = "+max);
        
        int min = Math.min(x,y);
        System.out.println("Minimum = "+min);
        
        int absolute = Math.abs(y);
        System.out.println("Avsolute = "+absolute);
        
        double power = Math.pow(x, y);
        System.out.println("Power = "+power);
        
        int round = Math.round(8.4f);
        System.out.println("Round = "+round);
        
        System.out.println(Math.PI);
       
    }
    
}
