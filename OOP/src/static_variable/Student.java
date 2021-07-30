
package static_variable;

public class Student {
    
    static int count = 0;//object er sathe related na class er sathe related
    
    //int count = 0;   non static variable
        
    Student(){
        count++;    
    } 
    void totalStudent(){
        System.out.println("Total Student = "+count);
    }
}
