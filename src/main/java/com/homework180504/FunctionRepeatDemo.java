package com.homework180504;
/**
 * Created by WangNing.
 * Date: 2018/5/16
 * Time: 13:56
 */
public class FunctionRepeatDemo {
    public static void main(String[] args) {

        Aoo aoo = new Coo();
        aoo.f();    //Coo
        Aoo a = new Aoo();//Aoo
        a.f();
        Aoo b = new Boo();//Aoo
        b.f();

    }
}

class Aoo{
    Aoo f(){
        System.out.println("Aoo");
        return null;
    }
}

class Boo extends Aoo{}

class Coo extends Boo{
    //重写
    //1、推翻重写
    //2、扩展父类的功能， 使用super.f()把父类的方法执行一遍
    //3、父类是抽象类和接口，子类需要实现抽象方法
    public Coo f(){
        super.f();
        System.out.println("Coo");
        return null;
    }
}
