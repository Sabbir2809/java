
package beginnerjava;

public class IncrementsDecrements {
    
    public static void main(String[] args) {
        
        int x = 25,y;
        
        y = --x;
        System.out.println("y= "+y); //24
        
        y = x--;
        System.out.println("y= "+y);//24
                
        y = ++x;
        System.out.println("y= "+y);//24
        
        y = x++;
        System.out.println("y= "+y);//25
        
    }
    
}
