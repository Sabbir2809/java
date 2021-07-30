
package Inheritance;

public class Rectangle extends Shape{
    
    private int height;
    private int width;

    public Rectangle(int Location,int height, int width) {
        super(Location);
        this.height = height;
        this.width = width;
    }
    
    public void display(){
        
        super.display();
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
    }
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(5,10,15);
        r1.display();
        
    }
}
