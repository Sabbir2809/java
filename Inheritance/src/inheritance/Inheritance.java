
package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        
       Teacher t1 = new Teacher();
       t1.name = "Sabbir Khan";
       t1.age = 22;
       t1.qualification = "Bsc in CSE";
       t1.displayInformation2();
       
       Teacher t2 = new Teacher();
       t2.name = "Ruble Khan";
       t2.age = 28;
       t2.qualification = "Doctor";
       t2.displayInformation2();
    
    }
    
}

//extends kay word
// inviasubal thakote

/*

1.What is inheritance?
ans: 
Inheritance can be defined as the process where one class acquires the 
properties(methods and fields) of another.

2.Why do we need inheritance?
ans: 
1. for code resablility
2. for method overriding 
3. to implement parent child relationship

*/
