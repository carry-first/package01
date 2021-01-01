package com.test2.stringBuilder.test01;

import javax.swing.*;

public class demo03 {
    public static void main(String[] args) {
        be.ui b =  new be().new ui();
        b.u01();
        JOptionPane.showConfirmDialog(null,"我是提示信息","标题",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
    }
}

class q{
    static int c=0;
    public static int me(){
        return c;
    }
}
class be{
    int c =10;
    class ui{
        public void u01(){
            System.out.println("u01方法被调用");
        }

        public void u02(){
            System.out.println("u02方法被调用");
        }
    }
}