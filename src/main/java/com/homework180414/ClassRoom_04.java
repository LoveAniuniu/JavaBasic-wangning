package com.homework180414;

import java.util.Scanner;

/**
 * 从控制台输入5个整数，然后输出最小值。
 * Created by WangNing.
 * Date: 2018/4/20
 * Time: 11:13
 */
public class ClassRoom_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5个整数：");
        Integer[] readNums = new Integer[5];
        for(int i=0; i<5; i++){
            readNums[i] = input.nextInt();
        }
        int min = readNums[0];
        for (int i=0;i<readNums.length;i++) {
            if (min > readNums[i]){
                min = readNums[i];
            }
        }
        System.out.println("控制台输入的5个整数中，最小值为："+min);
    }
}
