
package java_swing_with_anisul_islam;

import javax.swing.JOptionPane;

public class MessageDialog1 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Wrong Password");
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", 0);//-1,0,1,2,3
        JOptionPane.showMessageDialog(null, "Enter correct password","This is a title",JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
/*
JOptionPane class

1.showMessageDialog();
2.showInputDialog();
3.showOptionDialog();
4.showConfirmDialog();

*/