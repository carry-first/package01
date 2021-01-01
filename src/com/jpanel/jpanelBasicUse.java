package com.jpanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class jpanelBasicUse extends JFrame implements ActionListener {
    JScrollPane jsb =null;
    JTextArea jta = null;
    public static void main(String[] args) {
        jpanelBasicUse dm = new jpanelBasicUse();
    }
    public jpanelBasicUse(){
//        导航条
        JMenuBar jbr = new JMenuBar();
//        导航目录
        JMenu jm1 = new JMenu("文件（F）");
        JMenu jm2 = new JMenu("编辑（E）");
//        文本框
        jta = new JTextArea();
        jsb = new JScrollPane(jta);
//        导航目录子菜单
        JMenuItem jmi1 = new JMenuItem("打开（o）");
        JMenuItem jmi2 = new JMenuItem("导入（I）");

//        注册监听
        jmi1.addActionListener(this);
        jmi2.addActionListener(this);

//        添加注册监听提示命名
        jmi1.setActionCommand("打开");
        jmi2.setActionCommand("导入");

//        添加panel面板内容
        jm1.add(jmi1);
        jm1.add(jmi2);
        jbr.add(jm1);
        jbr.add(jm2);

//        Jpanel面板
        this.setJMenuBar(jbr);
        this.add(jsb);
        this.setBounds(200,200,700,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("打开")){
//            打开选择窗口
            JFileChooser jfc = new JFileChooser();
//            设置标题
            jfc.setDialogTitle("请选择打开的文件");
//
            jfc.showOpenDialog(null);
//            显示窗口
            jfc.setVisible(true);
//            获得文件的存放路劲
            String filePath = jfc.getSelectedFile().getPath();
            System.out.println(filePath);
//            创建buffer流
            BufferedReader br = null;
            try{
//                创建读取流
                br = new BufferedReader(new FileReader(filePath));
//                创建缓冲流
                String s = "",all="";
//                只要文件不是最后一行
                while((s=br.readLine())!=null){
                    all+=s+="\n";
                }
//                将文件写入到文本框中
                jta.setText(all);
            }catch (Exception e2){
                e2.printStackTrace();
            }finally {
//                如果br流没有关闭则关闭buffer流
                try {
                    if(br!=null)
                        br.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }else if(e.getActionCommand().equals("导入")){
            System.out.println("点击导入命令");
        }
    }
}
