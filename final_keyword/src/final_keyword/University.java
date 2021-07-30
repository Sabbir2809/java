
package final_keyword;

public class University {
    
    final String UNIVERCITY_NAME = "DIU";
    //int fees = 37000;
    final int fees;//blank final variable
    
    University(){//blank final variable
        fees = 17000;
    }
    
    void display(){
        
        System.out.println(UNIVERCITY_NAME);
        System.out.println(fees);
        
    } 
}
