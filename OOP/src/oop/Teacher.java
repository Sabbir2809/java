
package oop;

public class Teacher {
//1.variable 2.methods
    
    String name,gender;
    int phone;
    
    /*
    void setInformation(String n,String g,int p){//return type mathods name(parameter){}
        name = n;
        gender = g;
        phone = p; 
    }
    */
    
    Teacher(){
//method ,construtor         
        System.out.println("No value");
    }
    
    Teacher(String n,String g,int p){
//method ,construtor        
        name = n;
        gender = g;
        phone = p;
    }
    
    void dispalyInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("");
        
    }
 
}
/*      
-constructor is a special type of method that used to initialize the object.

*properties of constructor:
-constrctor has the same name as that of the class it belongs.
-constructor is a special type of method.
-in has no return type not even void.
-it is called automatically.
-Defalt constructor(no parameter),parametixed constructor(parameter)
*/