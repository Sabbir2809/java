
class Vehicle{
    
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }
    public void display(){
        System.out.println("Model: "+model);
    }
    
}
interface Drive{
    
    public void startEngine();
    public void stopEngine();
    
}

public class Volvo extends Vehicle implements Drive{
    
    private double price;

    public Volvo(double price, String model) {
        super(model);
        this.price = price;
    }
    public void startEngine(){
        System.out.println("Star Engine");
    }
    public void stopEngine(){
        System.out.println("Stop Engine");
    }
    
    public static void main(String[] args) {
        
        Volvo obj=new Volvo(100,"A");
        obj.startEngine();
        obj.stopEngine();
        
        obj.display(); 
        
    }
   
}
