
package inheritance_concept;

public class SubClass extends SuperClass{
    
    String s = "Form Sub";
    
    @Override
    void Print(){
        
        super.Print();
        
        System.out.println(s);
        //System.out.println(super.s);
    }  
}
