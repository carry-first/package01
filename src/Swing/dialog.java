package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class dialog extends JFrame {
    public static void main(String[] args) {
        new dialog();
    }

    public dialog() {
//        保存this窗格
        JFrame this01 = this;
//        获取窗格对象
        Container contentPane = getContentPane();
//        设置窗体的背景色
        contentPane.setBackground(Color.black);
//        定义按钮
        JButton jbt = new JButton("点击弹框");
//        contentPane.setLayout(new FlowLayout());
//        将按钮添加到窗格中
        contentPane.add(jbt);
        jbt.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e);
                Dialog01(this01);
            }
        });
//        设置窗体参数
        setVisible(true);
        setBounds(100, 100, 300, 210);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    static void Dialog01(JFrame f) {
//        创建dialog对话框
        JDialog dl = new JDialog(f, "对话框标题", true);
//        获取对话框窗体
        Container c = dl.getContentPane();
//        添加窗体内容
        c.add(new JLabel("弹框内容"));
//        设置窗体规格
        dl.setSize(100, 100);
        dl.setVisible(true);
    }

}
