package com.homework180504;

import java.util.Scanner;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 15:00
 */
public class TestQuestion {
    public static void main(String[] args) {
        Question q1 = new SingleAnswer("1","今天几号？",new String[]{"A.20180517","B.20180518"},"A");
        String[] options = {"A.Java","B.Python","C.Selenium","D.Mysql"};
        Question q2 = new MultiAnswer("2","你需要学习的内容有哪些？",options ,new String[]{"A","B","C","D"});

        Question[] paper = {q1,q2};
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<paper.length;i++){
            paper[i].print();
            System.out.println("请作答：");
            String str = sc.nextLine();
            String[] answers = str.split(",");
            boolean b = paper[i].check(answers);
            if(b){
                System.out.println("回答正确！");
            }else {
                System.out.println("答案错误！");
            }
        }
    }
}
