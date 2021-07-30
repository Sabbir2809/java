
package swing;

import java.awt.Color;

import java.awt.Container;

import java.awt.Font;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

public class LabelDemo1 extends JFrame {
    
    private Container c;
    private JLabel imgLabel;
    private ImageIcon img;
    
    LabelDemo1(){
        initComponents();
    }
    public void initComponents(){
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        img = new ImageIcon(getClass().getResource("takeoff.jpg"));
        
        imgLabel = new JLabel(img);
        imgLabel.setBounds(50,30,img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);
    
    }
    
    public static void main(String[] args) {
        
        LabelDemo1 LD = new LabelDemo1();
        
        LD.setVisible(true);
        LD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LD.setBounds(200,50,1000,1000);
        LD.setResizable(false);
        LD.setTitle("Demo");
    }
    
}
