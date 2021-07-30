
import java.util.Scanner;

public class MarathonClass7 {
    
    public void AgeCheck(){
        
        Scanner input = new Scanner(System.in);
        
        int age = input.nextInt();
        
        if(age < 10){
            System.out.println("Child");
            return;
        }
        System.out.println("Next Portion of This Method");
      
    }
    
    public static void main(String[] args) {
        
        MarathonClass7 obj = new MarathonClass7();
        obj.AgeCheck();
    }
    
}
