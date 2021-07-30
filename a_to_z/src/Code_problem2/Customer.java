
package Code_problem2;

public class Customer {
    
    Food food;
    protected int cusId;
    
    public Customer(Food food,int cusId){
        this.food = food;
        this.cusId = cusId;
        
    }
    public void display(){
        
        food.display();
        System.out.println("Cus Id: "+cusId);
    }
    
}
