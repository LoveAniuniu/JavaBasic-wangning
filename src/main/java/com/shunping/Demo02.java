package com.shunping;

/**
 * Created by WangNing.
 * Date: 2018/4/26
 * Time: 10:39
 */
public class Demo02 {
    public void print01(){
        for(int i=0; i<5;i++){
            for (int j=0;j<12;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void print02(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void print03(){
       for (int i=1;i<=5;i++){
           for (int k=5-i;k>=0;k--){
               System.out.print(" ");
           }
           for (int j=1;j<=2*i-1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }

    public static void main(String[] args) {
        Demo02 d2 = new Demo02();
        d2.print01();
        System.out.println("====================================");
        d2.print02();
        System.out.println("====================================");
        d2.print03();
    }
}
