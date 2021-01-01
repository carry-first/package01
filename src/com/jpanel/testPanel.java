package com.jpanel;

import javax.swing.*;
import java.awt.*;

public class testPanel extends JFrame{
    public static void main(String[] args) {
        testPanel tp = new testPanel();
    }
    public testPanel(){
        Mypanel2 m2 = new Mypanel2();
        this.add(m2);
        this.setBounds(200,300,300,200);
        this.setBackground(Color.blue);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Mypanel2 extends JPanel {
    @Override
    public void print(Graphics g) {
        super.print(g);
        g.fillRect(10,20,100,200);
    }
}
