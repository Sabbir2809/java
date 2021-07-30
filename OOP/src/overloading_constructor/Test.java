package overloading_constructor;

public class Test {
    
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        teacher1.displayInformation();
        
        Teacher teacher2 = new Teacher("sabbir khan","male");
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher("shafa","female",1829723692);
        teacher3.displayInformation();
    }
 
}
