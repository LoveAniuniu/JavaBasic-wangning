package com.shunping;

import java.util.Scanner;

/**
 * Created by WangNing.
 * Date: 2018/4/26
 * Time: 11:19
 */
public class Demo03 {


    public void multiplication(int num){
        for(int i = 1; i<=num; i++){
            for (int j=1;j<=i;j++){
                if(i*j<10) {
                    System.out.print(j + " * " + i + " = " + i * j + "   ");
                }else {
                    System.out.print(j + " * " + i + " = " + i * j + "  ");
                }
            }
            System.out.println("");
        }
    }

    public void sumAndAvg(int num1,int num2){

        int sum = num1 + num2;
        System.out.println("两数的和是："+sum);
        int avg = (int)(sum/2);
        System.out.println("两数的平均数是："+avg);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Demo03 d3 = new Demo03();
        System.out.println("请输入1-9之间的数：");
        int num = input.nextInt();
        d3.multiplication(num);

        System.out.println("请分别输入两个整数值：");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        d3.sumAndAvg(num1,num2);


    }
}
