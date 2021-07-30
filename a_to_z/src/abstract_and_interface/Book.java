
package abstract_and_interface;

public class Book {
    
    public String bId;
    public String bName;

    public Book(String bId, String bName) {
        this.bId = bId;
        this.bName = bName;
    }
    
    public void display(){
        
	System.out.println("Book ID:"+bId+"\tBook Name:"+bName);
    }
    
}
