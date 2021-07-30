
package abstract_and_interface;

public class Student extends Person implements Habits{
    
    public String id;
    private String name;
    Book book;

    public Student(int age,String id,String name,Book book) {
		super(age);
		this.id=id;
		this.name=name;
		this.book=book;
	}
    
    public void display(){
        System.out.println("Age: "+age);
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        book.display();
    }
    public void reading(){
        System.out.println(name+" Read the Book!");
    }
    
    public static void main(String[] args) {
        
        Book b1 = new Book("CSE-212","OOP");
		Student s1= new Student(21,"11820","Nurnobi Hosen",b1);
		s1.display();
		s1.reading();
        
    }
    
}
