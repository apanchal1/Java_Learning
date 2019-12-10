/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_image;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author Ajay
 */
public class image_create extends Canvas{

    public static void main(String[] args) {
        image_create ic=new image_create();
        JFrame jf = new JFrame();
        jf.add(ic);
        JPanel jp=new JPanel();
        jf.add(jp,BorderLayout.CENTER);
        JButton jb=new JButton();
        jp.add(jb);
        jf.setSize(500, 500);
        jf.setResizable(false);
       
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void paint(Graphics g){
        Toolkit k = Toolkit.getDefaultToolkit();
        Image i = k.getImage("D:\\RP\\GUI_Files\\LOGO.jpg");
     
          g.drawImage(i, 0, 0, this);
    
    }

}
