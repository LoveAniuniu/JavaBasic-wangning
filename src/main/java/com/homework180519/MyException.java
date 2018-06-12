package com.homework180519;

/**
 * Created by WangNing.
 * Date: 2018/5/22
 * Time: 20:13
 * 调用自己的异常
 */
public class MyException {
    public static void main(String[] args) {
           new MyException().g();
    }

    public void g() {
            f(1);
    }


        public void f(int x) {
//            if(x==1){
//                throw new MyExceptionDemo("我自己的异常！");
//                }
                System.out.println(x/0);

        }

}
