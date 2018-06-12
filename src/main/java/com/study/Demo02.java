package com.study;

import java.util.Scanner;


public class Demo02 {
    public static void main(String args[]){
/*编写一个Java程序，用if-else语句判断某年份是否为闰年。每月的天数*/
        boolean isRun;
        int days = 0;
        int totaldays = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Input a year:");
        int year = input.nextInt();
        if (year%400==0 || year%4==0&&year%100!=0){
            isRun = true;

        } else{
                isRun = false;
        }
        if (isRun){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }



/*计算输入的月份距离1990年1月1日的天数，求出输入当前月之前的总天数*/
/*计算输入月份的第一天是星期X（公式：星期X= 1+ 天数差%7）*/
/*格式化输出 XX年XX月日历（一行输出7个）*/
        for(int i = 1990;i<year;i++){
            if(isRun){
                totaldays = totaldays+366;
            }else {
                totaldays = totaldays+365;
            }
        }

        System.out.println("Please Input a month:");
        int month =input.nextInt();

        for (int i =1;i<=month;i++){
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if (isRun){
                        days = 29;
                    }else {
                        days = 28;
                    }
                    break;
                default:
                    System.out.println("输入的天数有误！");
            }
            //输入的月份的天数累加到总天数中
            if(i!=month) {
                totaldays = totaldays + days;
            }
        }
        System.out.println(year+"年"+month+"月"+"总的天数是"+totaldays);

        //求出星期几，其实就是前面的\t的个数
        int befordays;
        befordays = 1+ totaldays%7;//计算输入月份的第一天是星期X
        if(befordays == 7){
            befordays=0;//代表星期天
        }
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        //先打印\t
        for (int i=0;i<befordays;i++){
            System.out.println("\t");
        }
        for(int i=1;i<=days;i++){
            System.out.print(i+"\t");
            if((i+befordays)%7==0){
                System.out.println();
            }
        }

    }
}
