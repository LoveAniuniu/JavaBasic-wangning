package com.homework180504;

import java.util.Scanner;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 15:35
 */
public class SecTestQuestion {
    public static void main(String[] args) {
        SecQuestion q1 = new SecSigleAnswer("1","第二次做答题作业理解了么？",
                new String[]{"A.理解","B.不理解"},"A");
        String[] options = {"A.Java","B.Python","C.Selenium","D.Mysql"};
        String[] answers={"A","B","C","D"};
        SecQuestion q2 = new SecMulAnswer("2","仍需要学习的内容有哪些？",
                options,answers);
        SecQuestion[] sq = {q1,q2};
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< sq.length;i++){
            sq[i].display();
            System.out.println("请作答：");
            String str = sc.nextLine();
            String[] ans = str.split(",");
            if(sq[i].check(ans)){
                System.out.println("回答正确");
            }else {
                System.out.println("回答错误");
            }
        }

    }
}
