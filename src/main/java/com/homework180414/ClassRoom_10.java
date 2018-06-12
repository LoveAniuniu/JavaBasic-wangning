package com.homework180414;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 从控制台输入一个整数，然后输出这个数是几位数，如12345 输出5
 * Created by WangNing.
 * Date: 2018/4/23
 * Time: 12:11
 */
public class ClassRoom_10 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String str = sca.next();
        char[] arr = str.toCharArray();//把一个字符串变为字符数组；
        System.out.println("数的长度是："+arr.length);

    }
}
