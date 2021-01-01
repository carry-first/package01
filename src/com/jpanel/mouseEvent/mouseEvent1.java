package com.jpanel.mouseEvent;

import javax.swing.*;
import java.awt.event.*;

public class mouseEvent1 extends JFrame {
    public static void main(String[] args) {
        mouseEvent1 me = new mouseEvent1();
    }
//    构造函数
    public mouseEvent1(){
        Mypanel1 mp = new Mypanel1();
        this.add(mp);
//        鼠标事件监听
        this.addMouseListener(mp);
//        鼠标移动和拖拽事件
        this.addMouseMotionListener(mp);
//        键盘监听
        this.addKeyListener(mp);
        this.setBounds(0,0,700,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Mypanel1 extends JPanel implements MouseListener,KeyListener,MouseMotionListener {
    int x,y;

    @Override
    public void mouseClicked(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        System.out.println("鼠标点击X:"+e.getX()+"Y:"+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下:"+e.getX()+"Y:"+e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标松开:"+e.getX()+"Y:"+e.getY());

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入:"+e.getX()+"Y:"+e.getY());

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标离开:"+e.getX()+"Y:"+e.getY());

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("s鼠标托拽至X:"+e.getX()+"Y:"+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("s鼠标移动至X:"+e.getX()+"Y:"+e.getY());

    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("键输入"+e.getKeyChar());

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("键被按下"+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("键被释放"+e.getKeyChar());

    }
}