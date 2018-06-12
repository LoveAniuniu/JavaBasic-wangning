package com.homework180512;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * 包装类的方法
 *  Time: 16:16
 */
public class FengDemo {
    public static void main(String[] args){
        int x=2;//被static定义的可以通过
        Integer x2 =3;
        String str = "123";
        String str1 = "3.14d";
        //将字符串转换成对应的int类型
        int x3 = Integer.parseInt(str);
        System.out.println("Integer.parseInt(str):"+x3);
        //将字符串转换成对应的double类型
        System.out.println("Double.parseDouble(str):"+Double.parseDouble(str));
        //识别以d结尾的字符串
        System.out.println("Double.parseDouble(str1):"+Double.parseDouble(str1));
        //以16进制的形式将int输出
        System.out.println("Integer.toHexString(x3):"+Integer.toHexString(x3));
        //以10进制的形式将int输出
        System.out.println("Integer.toString(x3):"+Integer.toString(x3));
        //以2进制的形式将int值输出
        System.out.println("Integer.toBinaryString(x3):"+Integer.toBinaryString(x3));


        /* 数组扩容 */
        int[] arr ={};
        for(int i=0;i<5;i++){
            Random r = new Random();
            arr = Arrays.copyOf(arr,arr.length+1);//在原有数组基础上复制出一个长度+1的数组
            arr[arr.length-1 ] =r.nextInt(5); //arr.length-1 => 0
        }
        System.out.println(Arrays.toString(arr));

    }
}
