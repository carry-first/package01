package com.MyThread.demo1;

import com.MyThread.demo1.test.Pan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class newThread extends JFrame {
    public static void main(String[] args) {
//        调用子线程
        MyThread mt = new MyThread("Thread-小强");
        mt.start();
        mt.run();
        newThread t = new newThread();
        t.setVisible(true);
    }
    public newThread(){
        JLabel jl1 = new JLabel("账号：");
        JTextField jtf1 = new JTextField(10);

        JLabel jl2 = new JLabel("密码：");
        JPasswordField jpf1 = new JPasswordField(10);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        jtf1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jtf1.getText());
            }
        });

//        监听窗体的事件
        addWindowListener(getWin());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
//                super.windowIconified(e);
                System.out.println("jjklfja");
                JOptionPane.showMessageDialog(null,"缩小我干嘛再给你一个窗格","哼哼",JOptionPane.ERROR_MESSAGE);
//                System.out.println(e);
                Pan p = new Pan();

            }
        });
        c.add(jl1);
        c.add(jtf1);

        c.add(jl2);
        c.add(jpf1);


//        设置置顶
        setAlwaysOnTop(true);
//        设置不可更改大小
        setResizable(false);
//        清除默认样式
//        setUndecorated(true);
//        设置窗体的显示风格
//        getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
        setIgnoreRepaint(false);
        setBounds(600,300,320,100);
//        设置标题栏不可用
//        setEnabled(false);
//        设置窗口不可操作内容状态
        setFocusableWindowState(false);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
//          设置点击关闭时弹框
    public static WindowAdapter getWin(){
        return new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"你关不掉我","关闭",JOptionPane.ERROR_MESSAGE);
            }
        };
    }
}
