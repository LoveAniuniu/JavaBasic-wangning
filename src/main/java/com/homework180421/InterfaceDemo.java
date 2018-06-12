package com.homework180421;

/**
 * Created by WangNing.
 * Date: 2018/5/11
 * Time: 11:53
 */
public class InterfaceDemo {

}

interface Joo{
    //接口不能被实例化
    public static  final int x =3;
    //接口中的变量，静态常量
    //接口中方法都是抽象的
    public abstract void g();
}

interface Ioo{
    public  abstract void s();

}
class Too implements Joo,Ioo{

    @Override
    public void g() {

    }

    @Override
    public void s() {

    }

}
