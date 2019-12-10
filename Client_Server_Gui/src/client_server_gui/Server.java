package client_server_gui;

import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Server extends Thread {

    public static void main(String[] args) throws Exception {

        server_connect sc = new server_connect();
    }

}

class server_connect {

    server_connect() throws Exception {
       // UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        JOptionPane.showMessageDialog(null, "Server Signing ON");
        ServerSocket ss = new ServerSocket(9081);
        Socket soc = ss.accept();
        
       
        JOptionPane.showMessageDialog(null, "Server Connected");
        BufferedReader nis = new BufferedReader(
                new InputStreamReader(
                        soc.getInputStream()
                )
        );
        PrintWriter nos = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                soc.getOutputStream()
                        )
                ), true
        );
        server_gui sg = new server_gui(nos, nis,ss);

        JOptionPane.showMessageDialog(null, "Server Signing OFF");
    }
}

class server_gui extends GUI_CLASS {

    PrintWriter nos;
    BufferedReader nis;
    ServerSocket ss;

    server_gui(PrintWriter nos, BufferedReader nis,ServerSocket ss) throws Exception {
        this.nos = nos;
        this.nis = nis;
        this.ss=ss;
        
        jf.setTitle("Server");
        String str = JOptionPane.showInputDialog("Enter Yout Name Server");
        
        jf.setVisible(true);
        L1 l1 = new L1(jta, jtf, nos, str,ss);
        jb.addActionListener(l1);
        jtf.addActionListener(l1);

        nos.println(str);
        String str1 = nis.readLine();
        String str2 = nis.readLine();

        while (!str2.equalsIgnoreCase("End")) {
            jta.append(str1 + " : " + str2 + "\n");
            //System.out.println("Client Recieved " + str1);
            str2 = nis.readLine();
        }
        jta.append("Client Signing OFF");
       
         ss.close();
    }

}

class L1 implements ActionListener {

    JTextField jtf;
    JTextArea jta;
    String str;
    PrintWriter nos;
    ServerSocket ss;
    L1(JTextArea jta, JTextField jtf, PrintWriter nos, String str,ServerSocket ss) {
        this.jtf = jtf;
        this.jta = jta;
        this.nos = nos;
        this.str = str;
        this.ss=ss;
    }

    public void actionPerformed(ActionEvent e) {
        String s = jtf.getText();
        
        if(!s.isEmpty()) {
            jta.append(str + " : " + s + "\n");
            jtf.setText("");
            nos.println(s);
            if (s.equalsIgnoreCase("End")) {
                nos.println("Server has closed the connection");
                try {
                    ss.close();
                } catch (IOException ex) {
                    System.out.println("Closed Connection");;
                }
                System.exit(0);
            }
        }
    }
}
