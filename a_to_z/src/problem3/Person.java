
package problem3;

public class Person {
    
    private String name;
    private String phone;
    Address address;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void display(){
	System.out.println("\nName :"+name);
	System.out.println("Phone"+phone);
	address.display();
    }
    
}
