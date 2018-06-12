package com.homework180504;

/**
 * Created by WangNing.
 * Date: 2018/5/16
 * Time: 15:21
 */
public class AbstractDemo {
    /*关键字 final、static、abstract
    1、被final修饰的类不能被继承
    2、被final修改的方法不能被重写
    3、被final修饰的变量不能被修改
    */
    final float rate=3.15f;

    /*被static修饰的方法、变量属于类的，通过类名来调用，Arrays.toString()
    * 被static修改变量，意味着类中调用的都是同一个，*/

    /*1、abstract 不能有{}
    * 2、抽象方法一定是在抽象类中；抽象类中可以有非抽象方法；
    * 3、抽象类中有构造器，给子类使用；
    * 4、但是抽象类不能被实例化，需要对子类进行实例化
    * */
    abstract class Doo{//抽象类
        int age;
        String name;

        public Doo(int age, String name) {
            this.age = age;
            this.name = name;
        }

        abstract void f();//抽象方法
        public void g(){}//非抽象方法
    }
    class Eoo extends Doo{
        public Eoo(int age, String name) {
            super(age, name);
        }
        void f(){ }
    }


    public static void main(String[] args) {
        //Doo doo = new Doo();
    }


}
