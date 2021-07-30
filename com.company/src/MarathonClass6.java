
import java.util.Scanner;


public class MarathonClass6 {
    
    public void monthCheck(){
        
        Scanner input = new Scanner(System.in);
        
        int month = input.nextInt();
        
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Agust");
                break;
            case 9:
                System.out.println("Septembar");
                break;
            case 10:
                System.out.println("Octobar");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("No Month Found");
    
        }
    }
    
    public static void main(String[] args) {
        
        MarathonClass6 obj = new MarathonClass6();
        obj.monthCheck();
        
    }
    
}
