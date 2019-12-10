package client_server_gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.io.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Login_Form {

    static JFrame jf;
    JPanel jp;
    JButton jb, jr;
    JLabel jlabel1, jlabel2, jlabel3, background;
    JTextField jtf1, jtf2;

    Login_Form()throws Exception {

        jf = new JFrame("LOGIN Form");
    // Image image = ImageIO.read(new File("D:\\RP\\GUI_Files\\AYM2015.jpg"));
      //  jf.setIconImage(image);
        //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        /*
        UIManager present in javax.swing package. Capable of performing look and feel operation
        setLookAndFeel : an overloaded method that takes the class name or Look And Feel object and the sets of the
        corresponding look to the components
         */

        jp = new JPanel();
        jp.setBackground(Color.DARK_GRAY);
        jf.add(jp, BorderLayout.CENTER);

        jlabel3 = new JLabel("Welcome To Chat Messenger");
        jlabel3.setForeground(Color.pink);
        jp.add(jlabel3, BorderLayout.CENTER);

        jlabel1 = new JLabel("USERNAME  :");
        jlabel1.setForeground(Color.WHITE);
        jtf1 = new JTextField(10);
        jp.add(jlabel1);
        jp.add(jtf1);

        jlabel2 = new JLabel("PASSWORD :");
        jlabel2.setForeground(Color.WHITE);
        jtf2 = new JPasswordField(10);
        jp.add(jlabel2);
        jp.add(jtf2);

        jb = new JButton("Login");
        jb.setBackground(Color.WHITE);
        jp.add(jb);

        jr = new JButton("Create New Account");
        jr.setBackground(Color.WHITE);
        jp.add(jr);

        LR l1 = new LR(jtf1, jtf2,jf);
        jb.addActionListener(l1);
        L2 l2 = new L2(jf);
        jr.addActionListener(l2);

        jf.setSize(250, 200);
        jf.setResizable(false);
        jf.setLocation(250, 250);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class LR implements ActionListener {

    JTextField jtf1, jtf2;
    JFrame jf;

    LR(JTextField jtf1, JTextField jtf2,JFrame jf) {
        this.jtf1 = jtf1;
        this.jtf2 = jtf2;
        this.jf = jf;
    }

    public void actionPerformed(ActionEvent e) {
        String s = jtf1.getText();
        String s1 = jtf2.getText();
        if (!(s.isEmpty() && s1.isEmpty())) {
          
            try {
              
          client_server_gui.DB_Connection db = new client_server_gui.DB_Connection(s, s1);
          //jf.setVisible(false);
        //  client_server_gui.client_connect c=new client_server_gui.client_connect();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Some Error Occured Please try again","Error Messege",JOptionPane.ERROR_MESSAGE);
            }
           
        }
        
  

    }
   
   

}

class L2 implements ActionListener {

    JFrame jf;

    L2(JFrame jf) {
        this.jf = jf;
    }

    public void actionPerformed(ActionEvent e1) {
        try {
            Register_class rc = new Register_class();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sorry Some Error Ocuured", "Error,Try Again", JOptionPane.ERROR_MESSAGE);
        }
        jf.setVisible(false);
    }
}
