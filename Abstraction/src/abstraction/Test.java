
package abstraction;

public class Test {
    
    public static void main(String[] args) {
        
        //MobileUser ob = new MobileUser(); jay na
        
        MobileUser mu; //Refrence variable
        
        mu = new Sabbir();
        mu.call();
        mu.sendMessage();
        
        mu = new Shafa();
        mu.call();
        mu.sendMessage();
        
    }
    
}
