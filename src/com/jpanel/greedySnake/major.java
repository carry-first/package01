package com.jpanel.greedySnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class major extends JFrame{
    public static void main(String[] args) {
        major m = new major();
    }
    public major(){
        Mypanel mp = new Mypanel();
        this.add(mp);
//        屏幕横像素
        int width = (Toolkit.getDefaultToolkit().getScreenSize().width - 800) / 2;
        int height = (Toolkit.getDefaultToolkit().getScreenSize().height - 700) / 2;
        this.setBounds(width,height,800,700);
        this.addKeyListener(mp);
        mp.setBackground(Color.BLACK);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Mypanel extends JPanel implements KeyListener {
     snake snake = new snake(0,0);
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        for (int i = 0; i < snake.getSnakeHeight(); i++) {
            g.fillRoundRect(snake.getX() + i * 20,snake.getY(),14,14,3,3);
        }

//        刷新
//        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        System.out.println(11);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        int step = 5;
        if(e.getKeyCode() == 37) {
            snake.setX(snake.getX() - step);
        } else if(e.getKeyCode() == 38){
            snake.setY(snake.getY() - step);
        } else if(e.getKeyCode() == 39){
            snake.setX(snake.getX() + step);
        } else if(e.getKeyCode() == 40){
            snake.setY(snake.getY() + step);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println(33);
    }
}