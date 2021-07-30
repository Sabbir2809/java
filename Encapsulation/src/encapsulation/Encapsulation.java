
package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        
        Person p1 = new Person();
        
        p1.name = "Sabbir";
        p1.age = 22;
        p1.display();
        
    }
    static public class Person{
        
        String name;
        int age;
        /*
        1. how to do encapsulatin?
        ans: Declare the variables as private.
        ans: provide public setter ans getter method to modify  and get the variables value.
        */
        
        void display(){
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
        }
    }  
}
/*

*Packaging variables and methods into a single unit.
*Protecting data by declaring them as private.

1. provides data hiding 
2. reusability
3. code can be modified without breaking the code.
4. maintainabiliy: complexity.

*/
