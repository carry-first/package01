package Swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayout01 extends JFrame {
    public static void main(String[] args) {
        FlowLayout01 fl = new FlowLayout01();
    }

    FlowLayout01(){

        Container c = getContentPane();

//        水平间距20，垂直间距30
        c.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));

        for (int i = 0; i < 10; i++) {

            JButton jbt1 = new JButton("按钮"+i);

            c.add(jbt1);
        }

        c.setBackground(Color.WHITE);

//        setResizable(false);
        setBounds(100,100,400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
