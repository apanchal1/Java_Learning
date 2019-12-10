/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

/**
 *
 * @author Ajay
 */
public class Demo_gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       A a=new A();
    }

}

class A {

    A() {
        JFrame jf = new JFrame();
        JLabel jlb=new JLabel(new ImageIcon("D:\\RP\\GUI_Files\\LOGO.jpg"));
        jf.add(jlb);
        JButton jb=new JButton();
        jlb.add(jb,BorderLayout.NORTH);
        jb.setBounds(50, 50, 150, 150);
        jf.setSize(500, 500);
        jf.setResizable(false);
        jf.setLocation(100, 150);
        L l=new L(jb);
        jb.addMouseMotionListener(l);
      

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
class L implements MouseMotionListener{
    JButton jb;
    L(JButton jb){
        this.jb=jb;
    }
public void mouseDragged(MouseEvent e){

  

}
public void mouseMoved(MouseEvent e){
jb.setBackground(Color.red);   
if(jb.isCursorSet())
 jb.setBackground(Color.CYAN);
}
}