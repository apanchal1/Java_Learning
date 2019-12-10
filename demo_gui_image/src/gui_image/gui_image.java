package gui_image;

import javax.swing.*;
import java.awt.*;

public class gui_image extends JFrame {

    gui_image() throws Exception {
        add(new ContentPanel());
        pack();
        setSize(500, 300);

    }

    public static void main(String[] args) throws Exception {
       gui_image gui = new gui_image();
        gui.setVisible(true);
    }

}

class ContentPanel extends JPanel {

    Image i = null;

    ContentPanel() throws Exception {
        MediaTracker mt = new MediaTracker(this);
        i = Toolkit.getDefaultToolkit().getImage("D:\\RP\\GUI_Files\\AYM2015.jpg");
        mt.addImage(i, 0);
        mt.waitForAll();

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int imwidth = i.getWidth(this);
        int imheight = i.getHeight(this);
        g.drawImage(i, imwidth, imheight, this);
    }
}
