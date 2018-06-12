package com.homework180414;

import java.util.Scanner;

/**
 * 输入一串字符串，在控制台反向输出
 * Created by WangNing.
 * Date: 2018/4/20
 * Time: 14:31
 */
public class ClassRoom_06 {
    public static void main(String[] args) {
        ClassRoom_06 ca = new ClassRoom_06();
        ca.ClassRoom_06();
        String a = ca.ClassRoom_06("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.println(a);
        String b = ca.class_01("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.println(b);
     }

     /**逆序遍历*/
    public void ClassRoom_06(){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char [] stringArr =str.toCharArray();
        int len = stringArr.length;
        String temp = "";
        for (int i=len-1;i>=0;i--)
        {
            temp= temp + stringArr[i];
        }
        System.out.println(temp);
    }

    /** 将字符串转换为char数组，遍历循环给char数组赋值*/
    public String ClassRoom_06(String str){
         char [] temp =str.toCharArray();
         int len = temp.length;
         for (int i=0;i<len;i++){
             temp[i] = str.charAt(len-i-1);
         }
        return new String(temp);
    }

    /**逆序遍历，使用StringBuilder */
    public static String class_01(String string){
        if(string==null||string.length()==0) return string;
        StringBuilder sb = new StringBuilder();
        for(int i = string.length()-1;i>=0;i--){
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }


}
