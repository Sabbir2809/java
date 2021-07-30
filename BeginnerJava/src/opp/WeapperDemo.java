
package opp;

public class WeapperDemo {
    
    public static void main(String[] args) {
        
        //primitive -> object
        
        int x = 30;
        
        Integer y = Integer.valueOf(x); 
        System.out.println("Y = "+y);
        
        Integer z = x; //Intefer.valueOf(x); atuoboxing
        System.out.println("Y = "+z);
        
        Double d = new Double(10.215);
        System.out.println("D = "+d);
        
        Double e = d;//d.doubleValue(); unboxing
        System.out.println("e ="+e);
    }
    
}
