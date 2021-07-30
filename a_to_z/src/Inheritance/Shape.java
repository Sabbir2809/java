
package Inheritance;

public class Shape {
    
    protected int Location;

    public Shape(int Location) {
        this.Location = Location;
    }
    
    public void display(){
        System.out.println("Location: "+Location);
    }
    
}
