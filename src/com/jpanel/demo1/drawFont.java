package com.jpanel.demo1;

import javax.swing.*;
import java.awt.*;

public class drawFont extends JFrame {
    public static void main(String[] args) {
        drawFont dw = new drawFont();
    }
    public drawFont(){
        Mypanel mp = new Mypanel();
        this.add(mp);
        this.setBounds(300,400,700,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Mypanel extends JPanel{
    public void paint(Graphics g){
        g.setFont(new Font("华文彩云",12,32));
        g.drawString("唐阿彪",200,300);
    }
}
