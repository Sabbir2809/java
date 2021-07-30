
package Code_problem2;

public class Food extends Item{
    
    private String color;
    private double price;
    
    public Food(int itemId,String color,double price){
        
        super(itemId);
        this.color = color;
        this.price = price;
        
    }
    public void display(){
        super.display();
        System.out.println("Color : "+color);
        System.out.println("Price : "+price);
    }
    
}
