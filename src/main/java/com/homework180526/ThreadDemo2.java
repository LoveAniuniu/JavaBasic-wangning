package com.homework180526;

/**
 * Created by WangNing.
 * Date: 2018/6/5
 * Time: 14:32
 * 内部类实现多线程
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Thread");
            }
        };
        t1.start();

        //方法2：
        new Thread(){
            public void run(){
                System.out.println("Thread1");
            }
        }.start();


        //方法3：
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        }).start();
    }
}
