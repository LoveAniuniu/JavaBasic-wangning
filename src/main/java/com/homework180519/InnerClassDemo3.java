package com.homework180519;

/**
 * Created by WangNing.
 * Date: 2018/5/24
 * Time: 10:24
 * 局部内部类
 * 1、局部内部类中不能创建接口类
 * 2、可以访问局部类外部的变量
 * 3、jdk1.7中，可以访问内部类外的值，但是该值必须要被final修饰；
 *      dk1.8可以不需要final修饰，但是不能修改
 * 4、局部内部类只能在在Foo类的后面创建
 */
public class InnerClassDemo3 {
    static int x=3;
    public static void main(String[] args) {
        f();
    }

    public  static void f(){
        final int y =5;
        class Foo{
            public void g(){
                System.out.println(x);//可以访问局部类外部的变量
                System.out.println(y);//jdk1.7中，可以访问内部类外的值，但是该值必须要被final修饰；jdk1.8可以不需要final修饰，但是不能修改
                // y++;//会报错，final修饰的变量不能修改
            }
        }
        Foo foo = new Foo();//局部内部类只能在一个地方创建对象，且必须在Foo类的后面创建
        foo.g();
    }
}
