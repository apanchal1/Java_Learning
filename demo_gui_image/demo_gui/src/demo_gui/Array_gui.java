

package demo_gui;
import java.awt.*;
import javax.swing.*;
public class Array_gui {
    public static void main(String[] args) {
        int i=0,x=10,y=10,j=0;
        JFrame jf=new JFrame();
       
        JButton jb[]=new JButton[5];
        for (i=0;i<=4;i++) {
            jb[i]=new JButton();
            jb[i].setBounds(x, y, 50,20);
            jf.add(jb[i]);
            y=y+120;
            
        }
        
        
        
        
        
        
        
        jf.setLayout(null);
        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
