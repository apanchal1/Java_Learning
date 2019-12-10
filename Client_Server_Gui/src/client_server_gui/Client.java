package client_server_gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Client extends Thread {

    public static void main(String[] args) throws Exception {
        Login_Form lf=new Login_Form();
      
    }

}

 class client_connect {

    client_connect() throws Exception {
        //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        JOptionPane.showMessageDialog(null, "Client Signing ON");
        Socket soc = new Socket("127.0.0.1", 9081);
        JOptionPane.showMessageDialog(null, "Client Connected");
        PrintWriter nos = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                soc.getOutputStream()
                        )
                ), true
        );
        BufferedReader nis = new BufferedReader(
                new InputStreamReader(
                        soc.getInputStream()
                )
        );
        client_gui cg = new client_gui(nos, nis, soc);

        JOptionPane.showMessageDialog(null, "Client Signing OFF");
    }
}

class client_gui extends GUI_CLASS {

    PrintWriter nos;
    BufferedReader nis;
    Socket soc;

    client_gui(PrintWriter nos, BufferedReader nis, Socket soc) throws Exception {
        this.nos = nos;
        this.nis = nis;
        this.soc = soc;

        jf.setTitle("Client");
        String k = JOptionPane.showInputDialog("Enter Your Name Client");
        
        jf.setVisible(true);
        L l = new L(jta, jtf, nos, k, soc);
        jb.addActionListener(l);
        jtf.addActionListener(l);
        
        nos.println(k);
        String str1 = nis.readLine();
        String str2 = nis.readLine();

        while (!str2.equalsIgnoreCase("End")) {
            jta.append(str1 + " : " + str2 + "\n");
            str2 = nis.readLine();
        }
        jta.append("Server Signing OFF");
        soc.close();
    }
}

class L implements ActionListener {

    JTextField jtf;
    JTextArea jta;
    PrintWriter nos;
    String k;
    Socket soc;

    L(JTextArea jta, JTextField jtf, PrintWriter nos, String k, Socket soc) {
        this.jtf = jtf;
        this.jta = jta;
        this.nos = nos;
        this.k = k;
        this.soc = soc;
    }

    public void actionPerformed(ActionEvent e) {
        String s = jtf.getText();
        if (!s.isEmpty()) {
            jta.append(k + " : " + s + "\n");
            jtf.setText("");
            nos.println(s);
            if (s.equalsIgnoreCase("End")) {
                nos.println("Client has closed the connection");
                try {
                    soc.close();
                } catch (IOException ex) {
                    System.out.println("Closed Connection");;
                }
                System.exit(0);
            }
        }

    }

}
