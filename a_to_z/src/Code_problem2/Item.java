
package Code_problem2;

public class Item {
    
    protected int itemId;
    
    public Item(int itemId){
        
        this.itemId = itemId;
    }
    public void display(){
        
        System.out.println("Item Id : "+itemId);
    }
    
}
