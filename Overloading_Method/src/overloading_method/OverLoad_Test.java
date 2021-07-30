
package overloading_method;

public class OverLoad_Test {
    
    public static void main(String[] args) {
        
        OverLoad obj = new OverLoad();
        
        obj.add();
        
        obj.add(5,10);
        
        obj.add(5.5,10.5);
        
        obj.add(5,10,15);
        
    }
    
}
