package com.shunping;

import java.util.Scanner;

/**
 * Created by WangNing.
 * Date: 2018/4/26
 * Time: 14:04
 */
public class Demo05 {
    static Scanner input = new Scanner(System.in);

    int num1;
    int num2;
    public Demo05(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void add(){
        float sum = num1+num2;
        System.out.println("加法的结果是："+sum);
    }
    public void subduc(){
        float subduc = num1 - num2;
        System.out.println("减法的结果是："+subduc);
    }
    public void multi(){
        float multi = num1 * num2;
        System.out.println("乘法的结果是："+multi);
    }
    public void division(){
        float division = num1/num2;
        System.out.println("除法的结果是："+division);
    }

    public void acreage(){
        System.out.println("请输入两个运算数：");
        float acreage = num1 * num2;
        System.out.println("面积的结果是："+acreage);
    }

    public static void main(String[] args) {

        System.out.println("请输入运算种类：");
        System.out.println("1.四则运算：");
        System.out.println("2.计算面积：");
        int ran = input.nextInt();
        if(ran==1){
            System.out.println("1.加法");
            System.out.println("2.减法");
            System.out.println("3.乘法");
            System.out.println("4.除法");
            int ran1 = input.nextInt();
            System.out.println("请输入两个运算数：");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            Demo05 d5 = new Demo05(num1,num2);
            if (ran1==1){
                d5.add();
            }else if(ran1==2){
                d5.subduc();
            }else if(ran1==3){
                d5.multi();
            }else if(ran1==4){
                d5.division();
            }else {
                System.out.println("请重新输入!");
            }
        }else if (ran==2){
            System.out.println("请输入两个运算数：");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            Demo05 d5 = new Demo05(num1,num2);
            d5.acreage();
        }else{
            System.out.println("请重新输入1或者2");
        }
    }

}
