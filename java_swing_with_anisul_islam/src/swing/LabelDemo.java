
package swing;

import javax.swing.JFrame;

import javax.swing.JLabel;

import java.awt.Container;

import java.awt.Color;

import java.awt.Font;


public class LabelDemo extends JFrame{
    
    private Container c;
    private JLabel userL,passL;
    private Font f;
    
    LabelDemo(){
        
        initComponents();
    }
    public void initComponents(){
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        f = new Font("Arial",Font.BOLD,16);
        
        userL = new JLabel();
        
        userL.setText("UserName : ");
        userL.setBounds(50,20,200,50);
        userL.setFont(f);
        
        userL.setOpaque(true);
        userL.setBackground(Color.RED);
        userL.setToolTipText("Enter your username");
        c.add(userL);
        
        String s = userL.getToolTipText();
        System.out.println(" "+s);
        
        passL = new JLabel();
        
        passL.setText("Password : ");
        passL.setBounds(50,70,200,50);
        passL.setFont(f);
        
        passL.setOpaque(true);
        passL.setBackground(Color.RED);
        userL.setToolTipText("Enter your password");
        c.add(passL);
        
    }
    
    public static void main(String[] args) {
        
        LabelDemo LD = new LabelDemo();
        
        LD.setVisible(true);
        LD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LD.setBounds(200,50,500,400);
        LD.setTitle("Label Demo");
        
    }
    
}
