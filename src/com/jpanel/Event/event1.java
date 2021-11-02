package com.jpanel.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class event1 extends JFrame {
    mypanel mp = null;

    public static void main(String[] args) {
        event1 et = new event1();
    }

    public event1() {
        mp = new mypanel();
        this.add(mp.jp);
        this.setBackground(Color.BLUE);
        this.setBounds(0, 0, 700, 400);
        this.setVisible(true);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class mypanel extends JPanel implements ActionListener {
    JPanel jp = new JPanel();
    JButton jb1 = new JButton("黄色");
    JButton jb2 = new JButton("绿色");
    JButton jb3 = new JButton("蓝色");
    JButton jb4 = new JButton("红色");

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("yellow")) {

        } else {

        }
    }
}