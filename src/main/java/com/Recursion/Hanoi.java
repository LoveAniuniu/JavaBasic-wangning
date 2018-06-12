package com.Recursion;

/**
 * Created by WangNing.
 * Date: 2018/5/25
 * Time: 17:32
 */
public class Hanoi {
    static int count=1;
    public static void move(char j,char k){
        //System.out.println("第"+(super1.count++)+"步：把一个杯子从桌子"+j+"拿到杯子"+k);
    }

    public static void hanoi(char a,char b,char c,int n){
            if(n==1)move(a,c);
            else{hanoi(a,c,b,n-1);
            move(a,c);
            hanoi(b,a,c,n-1);
            }
         }
         public static void main(String[] args){
         char a='A',b='B',c='C';
         int num=3;//杯子的个数
          hanoi(a,b,c,num);
    }
}
