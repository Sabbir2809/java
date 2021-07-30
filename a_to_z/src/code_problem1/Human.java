
package code_problem1;

public class Human {
    
    protected String scientificName;

    public Human(String scientificName) {
        this.scientificName = scientificName;
    }
    
    public void display(){
        System.out.println("Scientific Name : "+scientificName);
        
    }
}
