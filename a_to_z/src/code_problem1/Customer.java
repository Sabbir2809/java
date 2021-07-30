
package code_problem1;

public class Customer extends Human{
    
    public int id;
    public String name;
    Item item;
    
    public Customer(String scientificName,int id,String name,Item item){
        
        super(scientificName);
        this.id = id;
        this.name = name;
        this.item = item;
        
    }
    public void display(){
        
        super.display();
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        super.display();
        
    }
    public static void main(String[] args) {
        
        Item itm = new Item(1210,"GPU");
        Customer cmr = new Customer("Graphics",825,"Sabbir",itm);
        cmr.display();
    }
}
