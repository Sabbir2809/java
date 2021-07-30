
package encapsulation;

public class Main {
    
    public static void main(String[] args) {
        
        NewClass obj=new NewClass();
        
        //System.out.println(obj.getName());
        obj.setName("Sabbir");
        obj.setAge(21);
        obj.setHeigth(5.7);
        
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getHeigth ());
    }
    
}
 