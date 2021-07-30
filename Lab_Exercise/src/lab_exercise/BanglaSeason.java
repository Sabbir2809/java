
package lab_exercise;

import java.util.Scanner;

public class BanglaSeason {
    
    public static void main(String[] args) {
        
        String month;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Plese enter a Month : ");
        month = input.next();
        
        switch(month){
            
            case "baishakh":
                System.out.println("Grishmo");
                break;
                
            case "joishtho":
                System.out.println("Grishmo");
                break;
                
            case "ashaarh":
                System.out.println("Borsha");
                break;
                
            case "shrabon":
                System.out.println("Borsha");
                break;
                
            case "bhadro":
                System.out.println("Shorot");
                break;
                
            case "ashwin":
                System.out.println("Shorot");
                break;
                
            case "kartik":
                System.out.println("Hemonto");
                break;
                
            case "ogrohaeon":
                System.out.println("Hemonto");
                break;
                
            case "poush":
                System.out.println("Sheet");
                break;
                
            case "magh":
                System.out.println("Sheet");
                break;
                
            case "falgun":
                System.out.println("Boshonto");
                break;
                
            case "choitro":
                System.out.println("Boshonto");
                break;
 
        }
  
    }   
}
