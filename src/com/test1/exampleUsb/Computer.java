package com.test1.exampleUsb;

public class Computer {
    public void powerOn(){
        System.out.println("计算机开机");
    }
    public void powerOff(){
        System.out.println("计算机关机");
    }
    public void useDivice(USB usb){
        usb.open();
//        判断当前是鼠标还是键盘
        if(usb instanceof Mouse){
//           向下转型
            Mouse ms = (Mouse) usb;
            ms.click();
        }else if(usb instanceof Keyborad){
//            向下转型
            Keyborad key = (Keyborad) usb;
            key.keyDown();
        }

        usb.close();
    }
}
