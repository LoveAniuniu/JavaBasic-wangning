package com.homwork180414;

import java.util.Arrays;
import java.util.Random;

/**
 * 双色球：红球：33选6，蓝球16选1
 * Created by WangNing.
 * Date: 2018/4/23
 * Time: 12:10
 */
public class ClassRoom_09 {
    public static void main(String[] args) {
        Demo_09 de = new Demo_09();
        de.blue();
        de.red();
    }
}

class Demo_09{
    public int blue(){
        Random ran = new Random();
        int bluenum = ran.nextInt(16)+1;
        System.out.println("蓝球为"+bluenum);
        return bluenum;
    }
    public String red(){
        Random ran = new Random();
        int[] red = new int[6];
        for (int i=0;i<red.length;i++){
            red[i] = ran.nextInt(33)+1;
            for(int j=0;j<i;j++){
                if(red[j] == red[i]){
                    i--;
                    break;
                }
            }
        }
        System.out.println("红球为"+Arrays.toString(red));
        return Arrays.toString(red);
    }
}