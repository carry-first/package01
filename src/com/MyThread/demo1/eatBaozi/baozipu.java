package com.MyThread.demo1.eatBaozi;

public class baozipu extends Thread{
    private Baozi baozi;
    int count = 0;
    public baozipu(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
//        包子铺一直生产包子
        while(true){
            //       使用同步技术保证包子生产和吃货吃包子只有一个在执行
            //        使用包子作为锁对象
            synchronized(baozi){
//            判断是否有包子
                if(baozi.flag){
//                如果有包子，则将同步锁中的包子对象进行等待,表示没有包子，等待包子做好之后进行唤醒
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                提示没有包子
                System.out.println("包子铺没有包子，生产包子中");
//            如果没有包子则生产包子,如果%2等于0，生产第一种包子
                if(count %2 ==0){
                    baozi.pi = "薄皮";
                    baozi.xian = "虾仁馅";
                }else{
                    baozi.pi = "厚皮";
                    baozi.xian = "牛肉馅";
                }
//            包子有3秒的制作时间
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            包子生产信息
                System.out.println("包子铺正在生产："+baozi.pi+baozi.xian+"味道的包子");
//            换一种口味
                count++;
//            修改包子的状态
                baozi.flag = true;
//            唤醒对象
                baozi.notify();
//            包子生产好了
                System.out.println("包子已生产完毕");
            }
        }
    }
}
