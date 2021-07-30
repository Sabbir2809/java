
import java.util.Scanner;


public class Apollo extends SpaceCraft implements Shuttle{
    
    private int gear;
    Scanner sc = new Scanner(System.in);
    
    public Apollo(int gear, String model) {
        super(model);
        this.gear = gear;
    }
    public void drive(){
        
        System.out.println("This Space Craft can be drive");
    }
    public void stop(){
        
        System.out.println("Press '0' for stopping this stop craft");
        
        int a = sc.nextInt();
        
        if(a == 0){
            System.out.println("This space craft is stopping soon");
        }
    }
    public void turn(){
        System.out.println("Press 1 for turnning On");
        int b = sc.nextInt();
        
        if(b == 1){
            System.out.println("This space craft is Truning on");
        }
        else{
            System.out.println("Invalid keyword");
            turn();
        }
    }
    public void startShuttle(){
        
    }
    @Override
    public void stopShuttle(){
        
    }
   
    public static void main(String[] args) {
         Apollo obj = new Apollo(4,"Apollo 1004 ");
         
         obj.drive(); 
         obj.turn();
         obj.stop(); 
    }
    
}
