package com.homework180421;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/8
 * Time: 13:20
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "1234567890abcdef";
        String s1 = str.concat("ABC"); // 类似str + "ABC"
        System.out.println(s1);
        boolean b1 = str.startsWith("123");//判断字符串的开头
        System.out.println(b1);
        boolean b2 = str.endsWith("ABCD");//判断字符串的结尾
        System.out.println(b2);
        String s2 = str.substring(3);//，字符串也有下标，从第三个开始截取
        System.out.println(s2);
        String s3 = str.substring(3,9);//截取第3位到第9位
        System.out.println(s3);
        String ss = "   123  45  6  ";
        System.out.println(ss.trim());//去除字符串两头的空白，空白=空格+换行+回车
        String sss = "A1B1cd2e1f";
        String[] strs = sss.split("1");//字符串拆分成字符数组
        System.out.println(Arrays.toString(strs));
        strs = sss.split("\\d");
        System.out.println(Arrays.toString(strs));
        str.length();
        char c = str.charAt(1);//取字符的
        System.out.println("c="+c);
        char[] cc = str.toCharArray();//把字符串转换成字符数组
        System.out.println("cc="+Arrays.toString(cc));
        int x1 = str.indexOf("34");//找出字符串中34第一次出现的位置
        System.out.println(x1);
        int x2 = str.lastIndexOf("34");
        System.out.println(x2);
        boolean r1 = str.equals("234");//字符串的比较要用equals
        System.out.println(r1);
        boolean r2 = str.equalsIgnoreCase("ABC");//忽略字符的大小写进行比较
        System.out.println(r2);

    }
}
