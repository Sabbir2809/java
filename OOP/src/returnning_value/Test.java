
package returnning_value;

public class Test {
    
    public static void main(String[] args) {
        
        ReturningValueDemo ob1 = new ReturningValueDemo();
        
        int result = ob1.square(5);
        
        System.out.println("Square of 5 : "+result);
        
        System.out.println("square of 6 : "+ob1.square(6));
    }
    
}
