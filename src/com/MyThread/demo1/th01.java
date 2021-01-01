package com.MyThread.demo1;

public class th01 {
    public static void main(String[] args) {
      /*  Myth mt = new Myth();
        mt.run();
        mt.start();
        Thread.State state = mt.getState();
        System.out.println(state);*/
        System.out.println(Thread.currentThread().getName());
    }

}
class Myth extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("i="+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
