package com.homework180414;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randnum = rand.nextInt(1000);//1000是随机数的上限,产生的随机数为0-1000的整数,不包括1000
        //System.out.println(randnum);
        Scanner input = new Scanner(System.in);
        System.out.print("请输入0-999之前的数:");
//        for (int sum=0;sum<10;sum++) {
//            int num = input.nextInt();
//            if (randnum<num) {
//                System.out.println(num + "太大了，再小一点");
//            } else if (num<randnum) {
//                System.out.println(num + "太小了，再大一点");
//            } else {
//                System.out.println("恭喜你，猜对了！");
//            }
//        }
//        System.out.println("你太笨了，下次再来吧！");
    }

}
