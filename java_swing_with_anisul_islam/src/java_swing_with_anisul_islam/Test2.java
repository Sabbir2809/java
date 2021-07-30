
package java_swing_with_anisul_islam;

import javax.swing.JOptionPane;

public class Test2 {
    
    public static void main(String[] args) {
        
        String f_name = JOptionPane.showInputDialog(null,"Enter your first name : ", "First Name",JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null,"Enter your last name : ", "Last Name",JOptionPane.QUESTION_MESSAGE);
        
        String name = f_name + " "+l_name;
        
        JOptionPane.showMessageDialog(null,"Your Full name : "+name,"Full Name",JOptionPane.QUESTION_MESSAGE);
  
    }
    
}
