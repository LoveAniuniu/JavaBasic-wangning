package com.homework180519;

/**
 * Created by WangNing.
 * Date: 2018/5/22
 * Time: 19:44
 * 异常种类：error、Exception、RuntimeException
 * 如果方法使用了throws声明了，必须使用try catch包裹；RuntimeException异常不用声明
 */


public class ExceptionDemo {
    public static void main(String[] args) {
        int x=10;
        try {
            ff(1,0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int ff(int x,int y) throws Exception{
        if(y==0){
            throw new Exception("0不能为除数！");
        }
        int z = x/y;
        return z;
    }
}


