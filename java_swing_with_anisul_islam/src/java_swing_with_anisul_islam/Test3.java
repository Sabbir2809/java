
package java_swing_with_anisul_islam;

import javax.swing.JOptionPane;

public class Test3 {
    
    public static void main(String[] args) {
        
       int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit this program?","Quit",JOptionPane.YES_NO_OPTION);
       
       if(choice == JOptionPane.YES_OPTION){
           
           System.exit(0);  
       }
       else{
           System.out.println("You have clicked no option"); 
       }
       
    }
    
}
