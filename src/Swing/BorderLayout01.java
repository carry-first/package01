package Swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayout01 extends JFrame {
    public static void main(String[] args) {
        BorderLayout01 bl = new BorderLayout01();
    }

    BorderLayout01() {
        Container c = getContentPane();

//        设置容器为边界布局
        c.setLayout(new BorderLayout());

        c.add(new JButton("东"), BorderLayout.EAST);
        c.add(new JButton("西"), BorderLayout.WEST);
        c.add(new JButton("南"), BorderLayout.SOUTH);
        c.add(new JButton("北"), BorderLayout.NORTH);
        ImageIcon i1 = new ImageIcon("src/1.jpg");
        JLabel jl = new JLabel(i1);
        jl.setSize(5, 5);
//        c.add(new JButton("中"),BorderLayout.CENTER);
        c.add(jl, BorderLayout.CENTER);

//        c.setBackground(Color.WHITE);

//        setResizable(false);
        setBounds(100, 100, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
