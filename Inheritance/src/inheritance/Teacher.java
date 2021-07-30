
package inheritance;

public class Teacher extends Person{
    
    //name,age,displayInformation() era cole eseche
    String qualification;
    
    void displayInformation2(){
        
        //System.out.println("Name : "+name);
        //System.out.println("Age : "+age);
        displayInformation1();
        System.out.println("qualification : "+qualification);
        
        
    }
    
}
