
package guilearn1;
import java.awt.*;
import javax.swing.*;

public class Guilearn1 {

    public static void main(String[] args) {
     learngui l=new learngui();
     
    }
    
}
    class learngui
    {
        JFrame jf;
        JButton jb;
        JPanel jp;
        JRadioButton rd;
        JTextArea jta;
         JTextField jtf;
         
    learngui() {
         jf = new JFrame("PROJECT");
         jp = new JPanel();
         jf.add(jp);
         rd= new JRadioButton();
         jp.add(rd);
         
    
       
         
         
       
         
         jtf=new JTextField(10);
         jp.add(jtf,BorderLayout.NORTH); jb=new JButton("ok");
         jp.add(jb);
             jta=new JTextArea(2,2);
         jf.add(jta,BorderLayout.SOUTH);
        
         jf.setSize(200,300);
         jf.setResizable(true);
         jf.setLocation(250,200);
         jf.setVisible(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
         
         
          
         
         
         
         
         
         
    }
    
    
    }
        
        
   
    
    
    
    

