package client_server_gui;

import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI_CLASS {

    JFrame jf;
    JPanel jp;
    JTextArea jta;
    JButton jb;
    JTextField jtf;
    PrintWriter nos;
    BufferedReader nis;

    GUI_CLASS() throws Exception {
        jf = new JFrame("Chat Messenger");
        Image image = ImageIO.read(new File("D:\\RP\\GUI_Files\\LOGO.jpg"));
        jf.setIconImage(image);
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        jp = new JPanel();
        jf.add(jp, BorderLayout.SOUTH);

        jta = new JTextArea(20, 20);
        Font font = new Font("Verdana", Font.BOLD, 15);
        jta.setFont(font);
        jta.setEditable(false);
        jf.add(jta);
        JScrollPane jsp = new JScrollPane();
        jsp.setViewportView(jta);
        jf.getContentPane().add(jsp);

        jtf = new JTextField(20);
        jb = new JButton("SEND");
        jp.add(jtf);
        jp.add(jb);
        jf.setSize(500, 500);
        jf.setResizable(false);
        jf.setLocation(100, 150);

        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
