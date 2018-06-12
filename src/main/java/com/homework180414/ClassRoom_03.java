package com.homework180414;

/**
 * Created by WangNing.
 * Date: 2018/4/19
 * Time: 17:36
 */
public class ClassRoom_03 {
    public static void main(String[] args) {
        int x = 'a';//ASCII码对应数
        int y = 20;//整型
        long z = 33L;//整型-long类型
        float a = 3.5f;//浮点型-单精度
        double b = 5.67d;//浮点型-双精度，一个小数默认为双精度类型
        System.out.println("x="+x+"\n"+"y="+y+"\n"+"z="+z+"\n"+"a="+a+"\n"+"b="+b+"\b");
        int c = (int)3.5;//强制类型转换,
        // 字节长度（byte < short < int < long < float < double）
        // byte 8位、1个字节（取值范围）
        // short 16位、2个字节
        // int 32位、4个字节
        // long 64位、8个字节
        // float 32位、4个字节
        // double 64位、8个字节
        // char 16位、2个字节
        // boolean 4位、1个字节

        System.out.println("c="+c);

    }

}
