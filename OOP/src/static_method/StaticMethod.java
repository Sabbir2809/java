
package static_method;

public class StaticMethod {
    
    //int x = 10; 
    static int x = 10;
    
    void display1(){//non static method
        
        display2();//dite parbo
        System.out.println("I am non static method");  
    }
    
    static void display2(){//static method
//static method can not use non static member 
        
        //display1();
        System.out.println(" "+x);
        System.out.println("I am static method");  
    }
    
}
/*
-static method can not use non static member
-this and supur keyword can not be used here
*/
