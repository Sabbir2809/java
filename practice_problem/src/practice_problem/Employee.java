
package practice_problem;

public class Employee {
    
    String name;
    
    Employee(){
        System.out.println("Not Known");
    }
    Employee(String name){
        this.name = name;
    }
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("");
    }
}
