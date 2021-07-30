
package association;

public class Rectangle {
    
    private int heigth,width;
    Circle c;
    Line l;
    
    
    public Rectangle(int heigth,int width,Circle c,Line l){
        
        this.heigth = heigth;
        this.width = width;
        this.c = c;
        this.l = l;
        
    }
    
    public void display(){
        
        System.out.println("Heigth : "+heigth);
        System.out.println("Width : "+width);
        c.display();
        l.display();
        
    }
    public static void main(String[] args) {
        
        Circle c1 = new Circle(12.0);
        Line l1 = new Line(20);
        
        Rectangle r1 = new Rectangle(10,20,c1,l1);
        r1.display();

    }
    
}
