package com.homework180414;

import java.util.Scanner;

/**
 * 计算出租车的车费，车费由2部分组成，公里数和等待时间。
 * 0-3公里，收10元；4-15公里每公里2元；15公里以上部分，每公里3元。
 * 等候时间，每2分半收1元，不足2分半的不收钱。不足1公里的按1公里算1公里算。
 * 车费是公里数钱+等候时间的钱
 * 如，18公里299秒，应收费44元
 * 要求：输入公里数和秒数，输出车费
 * Created by WangNing.
 * Date: 2018/4/20
 * Time: 12:39
 */
public class ClassRoom_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入公里数：");
        double num1 = input.nextDouble();
        System.out.println("请输入等候时间（秒）：");
        int num2 = input.nextInt();
        ClassRoom_05 c5 = new ClassRoom_05();
        int sum1 = c5.ClassRoom_05(num1);
        int sum2 = c5.ClassRoom_05(num2);
        System.out.println("总车费是："+(sum1+sum2));
    }

    public int ClassRoom_05(double range) {
        int fare1 = 0;
        if (Math.ceil(range)>0 && Math.ceil(range)<=3) {
            fare1 = 10;
        } else if (Math.ceil(range)>=4 && Math.ceil(range)<=15) {
            fare1 = 2 * ((int) Math.ceil(range) - 4);
        } else {
            fare1 = 3 * ((int) Math.ceil(range) - 15) + 2 * 12 + 10;
        }
        return fare1;
    }

    public int ClassRoom_05(int secs){
        int fare2 = 0;
        if (secs > 0 && secs < 150){
            fare2 = 0;
        }else if(secs > 150){
            fare2 = (int)(secs/150);
        }
        return fare2;
    }

}
