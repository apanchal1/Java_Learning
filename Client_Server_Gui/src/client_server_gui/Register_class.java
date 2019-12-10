
package client_server_gui;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Register_class {

    JFrame jf1;
    JPanel jp1;
    JLabel jl1, jl2, jl3, jl4, jl5;
    JTextField jtf1, jtf2, jtf3, jtf4, jtf5;
    JButton jb1, jb2;

    Register_class() throws Exception {
        jf1 = new JFrame("Register");
        jp1 = new JPanel();
        jp1.setBackground(Color.DARK_GRAY);
        jf1.add(jp1, BorderLayout.CENTER);
        Image image = ImageIO.read(new File("D:\\RP\\GUI_Files\\AYM2015.jpg"));
        jf1.setIconImage(image);
        //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        jl1 = new JLabel("Username                 :");
        jl1.setForeground(Color.WHITE);
        jl2 = new JLabel("Password                 :");
        jl2.setForeground(Color.WHITE);
        jl3 = new JLabel("Confirm Passowrd  :");
        jl3.setForeground(Color.WHITE);
        jl4 = new JLabel("Email Address           :");
        jl4.setForeground(Color.WHITE);
        jl5 = new JLabel("Mobile No.                  :");
        jl5.setForeground(Color.WHITE);

        jtf1 = new JTextField(20);
        jtf2 = new JTextField(20);
        jtf3 = new JTextField(20);
        jtf4 = new JTextField(20);
        jtf5 = new JTextField(20);

        jb1 = new JButton("Save");
        jb2 = new JButton("Login");

        jp1.add(jl1);
        jp1.add(jtf1);
        jp1.add(jl2);
        jp1.add(jtf2);
        jp1.add(jl3);
        jp1.add(jtf3);
        jp1.add(jl4);
        jp1.add(jtf4);
        jp1.add(jl5);
        jp1.add(jtf5);
        jp1.add(jb1);
        jp1.add(jb2);

        jf1.setSize(380, 240);
        jf1.setResizable(false);
        jf1.setLocation(300, 300);
        
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
