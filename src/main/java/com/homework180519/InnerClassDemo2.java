package com.homework180519;


/**
 * Created by WangNing.
 * Date: 2018/5/23
 * Time: 19:51
 * 成员内部类
 * 1、Coo.Doo doo = new Coo().new Doo()
 * 2、可以创建接口类
 */
public class InnerClassDemo2 {
    public static void main(String[] args) {
        //Coo coo = new Coo();
        //System.out.println(coo.z);
        Coo.Doo doo = new Coo().new Doo();
        doo.f();
    }

}

class Coo{
    int z = 5;
    int h = 8;
    class Doo{
        int z =9;
        int x =7;
        static final int y=4;
        public void f(){
            System.out.println(z);//打印的是Doo.z
            System.out.println(this.z);// 打印的是Doo.z
            System.out.println(Coo.this.z); //打印的是Coo.z
        }
    }
}
