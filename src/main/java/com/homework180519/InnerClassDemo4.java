package com.homework180519;

/**
 * Created by WangNing.
 * Date: 2018/5/24
 * Time: 11:32
 * 匿名内部类
 * 是一种搞特殊的局部内部类，没有类名
 * 语法：Student s =new Student(){匿名内部类的类体};
 * 内名内部类一定是在new后面，而且只能在声明时同事初始化，只有一次创建实例的机会
 */
public class InnerClassDemo4 {
    public static void main(String[] args) {
        new InnerClassDemo4().f();
    }
    public void f(){
        Koo koo = new Koo(){//匿名内部类
            public void f(){
                System.out.println("匿名内部类");
            }
        };
        koo.f();
        Xoo xoo = new Xoo() {//匿名内部类
            @Override
            public void g() {
            }
        };
    }

}

class Koo{
    public void f(){
        System.out.println("Koo");
    }
}

interface Xoo{
    void g();
}
