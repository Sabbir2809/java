
package Code_problem2;

public class Rahim extends Customer{
    
    protected String email;
    
    public Rahim(Food food,int cusId,String email){
        
        super(food,cusId);
        System.out.println("Email : "+email);
    }
    public static void main(String[] args) {
        
        Food fd = new Food(1002,"Red",499);
        Rahim r = new Rahim(fd,22,"sabbirto13@email.com");
        
        r.display();
        
    }
    
}
