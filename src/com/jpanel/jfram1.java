package com.jpanel;

import javax.swing.*;
import java.awt.*;

public class jfram1 extends JFrame {
    public static void main(String[] args) {
        jfram1 jf1 = new jfram1();
    }

    public jfram1() {
        Mypanel2 mp = new Mypanel2();
        this.add(mp);
        this.setBounds(300, 300, 700, 500);
        this.setBackground(Color.black);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Mypanel extends JPanel {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(30, 30, 100, 100);
        g.fillOval(30, 40, 20, 30);
    }
}