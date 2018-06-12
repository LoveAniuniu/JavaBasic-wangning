package com.homework180519;

/**
 * Created by WangNing.
 * Date: 2018/5/23
 * Time: 19:26
 * 静态内部类
 * static class Aoo{}
 * Boo.Aoo aoo = new Boo.Aoo();
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        Boo.Aoo aoo = new Boo.Aoo();
        aoo.f();
    }
}

class Boo{
    int z = 6;
    static int w =2;
    //定义静态内部类Aoo
    //静态内部类的好处：将Koo封装到Foo内部
    //Foo类相当于Koo的包，为Koo声明了一个命名空间
    //静态内部类的作用域类似静态变量
    static class Aoo{
        static int x=3;
        int y=5;
        public void f(){
            //在静态内部类中可以直接访问外部类的静态成员
            System.out.println(w);
            //不能直接访问外部类的实例成员，但可以通过外部类的实例来访问
            System.out.println(new Boo().z);
        }

    }
}
