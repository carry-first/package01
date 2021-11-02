package Swing;

import javax.swing.*;
import java.awt.*;

public class GridLayout extends JFrame {
    public static void main(String[] args) {
        GridLayout gl = new GridLayout();
    }

    GridLayout() {
        Container c = getContentPane();

//       定义一个5行4列的网格布局容器，水平、垂直间隔10
        c.setLayout(new java.awt.GridLayout(5, 4, 10, 10));

        for (int i = 0; i < 17; i++) {

            JButton jbt1 = new JButton("按钮" + i);

            c.add(jbt1);
        }

        c.setBackground(Color.WHITE);

//        setResizable(false);
        setBounds(100, 100, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
