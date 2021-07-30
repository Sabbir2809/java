
package swing;

import javax.swing.JFrame;

import javax.swing.ImageIcon;

import java.awt.Container;

import java.awt.Color;

public class FrameDemo extends JFrame{
    
    private ImageIcon icon;
    private Container c;
    
    FrameDemo(){
        initComponents();
    }
    public void initComponents(){
        
        c = this.getContentPane();
        c.setBackground(Color.RED);
       
        icon = new ImageIcon(getClass().getResource("youtube.png"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        
       FrameDemo fd = new FrameDemo();
       
       fd.setVisible(true);
       fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fd.setBounds(60,120,400,400);
       fd.setTitle("Youtube");
       fd.setResizable(false);
       
    }

}
