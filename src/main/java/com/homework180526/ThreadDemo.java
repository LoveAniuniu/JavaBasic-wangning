package com.homework180526;

/**
 * Created by WangNing.
 * Date: 2018/6/5
 * Time: 14:15
 * 多线程：两种方法创建线程： * 1、继承Thread * 2、实现Runnable接口
 */
public class ThreadDemo {
    public static void main(String[] args) {
        AOO aoo = new AOO();
        aoo.setDaemon(true);//该线程标记为守护线程,当其他线程结束后，该线程也结束
        aoo.start();//线程执行

        Thread boo = new Thread(new BOO());//implements实现接口需要实例化这个类
        boo.start();
        System.out.println("end！");
    }
}
//继承Thread方式
class AOO extends Thread{
    public void run(){
        for(int i=0;i<10000000;i++){
            System.out.println("你是谁呀！");
            Thread.yield();//暂停当前正在执行的线程对象，并执行其他线程。
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
//通过实现Runnable
class BOO implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("修水管的！");
        }
    }
}
