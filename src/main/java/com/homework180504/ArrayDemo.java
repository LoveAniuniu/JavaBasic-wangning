package com.homework180504;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/15
 * Time: 13:57
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //数组的长度都是固定的
        //静态初始化 int[] arr ={1,2,3,4,5}
        //动态初始化 int[] arr = new int[]{2,3,4};
        // int[] arr;
        // arr = new int[]{2,3,4}
        //区别：静态初始化只能在声明的同时进行初始化操作
        int[] str = {1,3,5,8,10};//静态初始化
        int[] str1 = new int[]{2,5,1,7,10};//动态初始化
        int[] str2;
        str2 = new int[]{5,6,7,8};//动态初始化
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
    }
}
