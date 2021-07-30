
package code_problem1;

public class Item {
    
    public int itemId;
    public String itemName;
    
    public Item(int itemId,String itemName){
        
        this.itemId = itemId;
        this.itemName = itemName;
    }
    public void display(){
        System.out.println("Item Id: "+itemId);
        System.out.println("Item Name: "+itemName);
    }
    
}
