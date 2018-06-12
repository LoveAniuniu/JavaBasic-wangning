package com.shunping;
import java.util.Scanner;

/**
 *
 * Created by WangNing.
 * Date: 2018/4/26
 * Time: 9:46
 */
public class Demo01 {
    int sumMoney ;
    int avgMoney ;
    int recPrice ;
    int mp3Price ;
    int recNum ;
    int mp3Num ;
    int PersonNum ;

    public  Demo01(int recNum,int recPrice,int mp3Num,int mp3Price,int PersonNum){
        this.recNum = recNum;
        this.recPrice = recPrice;
        this.mp3Num = mp3Num;
        this.mp3Price = mp3Price;
        this.PersonNum = PersonNum;
    }

    public String Jisuan(){
        sumMoney = recNum * recPrice + mp3Num * mp3Price;
        avgMoney = sumMoney/PersonNum;
        return "总价为"+sumMoney+"公司平均给某人花费"+avgMoney;
    }

    public static void main(String[] args) {
        Demo01 d1 = new Demo01(5,320,13,260,18);
        String s1 = d1.Jisuan();
        System.out.println(s1);

        Scanner input = new Scanner(System.in);
        System.out.println("请输入手掌游戏机的价格：");
        int X = input.nextInt();//手掌游戏机的价格
        System.out.println("请输入mp3的价格：");
        int Y = input.nextInt();//mp3的价格
        Demo01 d2 = new Demo01(5,X,13,Y,30);
        String s2 = d2.Jisuan();
        System.out.println(s2);

        System.out.println("请输入手掌游戏机的台数：");
        int X1 = input.nextInt();//游戏机有X1台
        System.out.println("请输入Mp3的台数：");
        int Y1 = input.nextInt();//mp3有Y1台
        Demo01 d3 = new Demo01(X1,320,Y1,260,30);
        String s3 = d2.Jisuan();
        System.out.println(s3);

    }
}
