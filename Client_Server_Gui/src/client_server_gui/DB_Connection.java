package client_server_gui;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DB_Connection extends Login_Form {

    int k;
    Statement stmt;
    Connection con;

    DB_Connection() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/Chat", "Ajay", "Ajay");

    }

    DB_Connection(String s1, String s2, String s3, int k) throws Exception {
        this();
        stmt = con.createStatement();
//      stmt.execute("TRUNCATE TABLE LOGIN");

        try {
            stmt.execute("Insert into LOGIN values('" + s1 + "','" + s2 + "','" + s3 + "'," + k + ")");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UserName or PassWord already exists", "Invalid tYPE", JOptionPane.ERROR_MESSAGE);

            Register_class rc = new Register_class();
        }

    }

    DB_Connection(String user, String password) throws Exception {

        //this();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/Chat", "Ajay", "Ajay");

       PreparedStatement stmt = con.prepareStatement("SELECT PASSWORD FROM LOGIN WHERE USERNAME = ?");
       stmt.setString(1, user);
       ResultSet rs = stmt.executeQuery();
      
        while (rs.next()) {
            if (rs.getString("PASSWORD").equals(password)) {
                JOptionPane.showMessageDialog(null, "Successfully LogIn");
                client_server_gui.Login_Form.jf.setVisible(false);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid UserName or PassWord");
               jtf1.setText("");
               jtf2.setText("");
            }
        }

    }

}
