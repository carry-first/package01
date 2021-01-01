package com.jpanel.drawGar;

import javax.swing.*;
import java.awt.*;

public class draw1 extends JFrame {
    public static void main(String[] args) {
        draw1 dw = new draw1();
    }
    public draw1(){
        Mypanel mp = new Mypanel();
        this.add(mp);
        this.setBounds(0,0,700,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imi = new ImageIcon("C:\\Users\\Tang A Biao\\OneDrive\\图片\\dlam.jpg");
        String s = (String) JOptionPane.showInputDialog(null,"content","title",JOptionPane.INFORMATION_MESSAGE,imi,null,"kkk");
        System.out.println(s);
    }
}

class Mypanel extends JPanel{
public void paint(Graphics g){
    Image im1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Tang A Biao\\OneDrive\\图片\\1.jpg");
    g.drawImage(im1,0,0,50,50,this);
}
}