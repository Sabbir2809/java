
package swing;

import javax.swing.JFrame;

public class Test extends JFrame{
    
    Test(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50,100,400,400);
        setTitle("This is a Title");
    }
    
    public static void main(String[] args) {
        
        Test jf = new Test();
        
        jf.setVisible(true);

    }
  
}
