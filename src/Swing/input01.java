package Swing;

import javax.swing.*;
import java.awt.*;

public class input01 extends JFrame {
    public static void main(String[] args) {
        input01 n = new input01();
    }

    public input01() {

        Container c = getContentPane();

        c.setLayout(null);

        JButton jbt1 = new JButton("按钮1");
        jbt1.setBounds(70, 70, 50, 23);

        c.setBackground(Color.WHITE);

//        c.add(jt);
        c.add(jbt1);

        setResizable(false);
        setBounds(100, 100, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
