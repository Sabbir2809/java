
package abstraction;

public abstract class MobileUser {
    
    void call(){
        System.out.println("Call method");//non-abstract
    }
    
    abstract void sendMessage();//abstract method
    
}
