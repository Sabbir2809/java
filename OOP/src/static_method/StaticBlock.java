
package static_method;

public class StaticBlock {
    
    static int id;
    static String name;
    
    static{
        id = 2809;
        name = "Sabbir";
    }
    
    static void display(){
        
        //System.out.println("ID : "+id);
        //System.out.println("Name : "+name);
        System.out.println("Static block");
    }
    
    public static void main(String[] args) {
        
        System.out.println("Main method");
        
        StaticBlock.display();
    }
    
}
