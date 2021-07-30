
package overloading_constructor;

public class Teacher {
    
    String name,gender;
    int phone;
    
    Teacher(){
//overloading constrctor     
        System.out.println("No information");
    }
    
    Teacher(String name,String gender){
//overloading constrctor       
        this.name = name;
        this.gender = gender;    
    }
    
    Teacher(String name,String gender,int phone){
//overloading constrctor   
       this.name = name;
       this.gender = gender;
       this.phone = phone;
        
    }
    
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("\n");
    }
}  
//overloading constrctor---data type or parameter change kore 