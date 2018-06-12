package com.homework180504;

/**
 * Created by WangNing.
 * Date: 2018/5/16
 * Time: 16:35
 */
interface InterfaceDemo {
    int age =0; //接口中变量都是公开静态常量
    String name =null;
    abstract void aa();

    public abstract void display();   //接口中方法都是抽象的
}

class Ioo implements InterfaceDemo{

    @Override
    public void display() {

    }

    public void aa(){

    }
}
/*
接口与类相似点：
1、一个接口可以有多个方法。
2、接口文件保存在 .java 结尾的文件中，文件名使用接口名。

接口与类的区别
1、接口不能实例化
2、接口没有构造方法。
3、接口不能包含成员变量，除了 static 和 final 变量。
4、接口中所有的方法必须是抽象方法。public abstract
5、接口不是被类继承了，而是要被类实现。
6、接口支持多继承。
抽象类和接口的区别
1. 抽象类中的方法可以有方法体，就是能实现方法的具体功能，但是接口中的方法不行。
2. 抽象类中的成员变量可以是各种类型的，而接口中的成员变量只能是 public static final 类型的。
3. 接口中不能含有静态代码块以及静态方法(用 static 修饰的方法)，而抽象类是可以有静态代码块和静态方法。
4. 一个类只能继承一个抽象类，而一个类却可以实现多个接口。
*/



