package com.shunping;

import java.util.Scanner;

/**
 * 渔夫出海大鱼,收获若干
 * 1.渔夫卖掉一半的鱼,然后送给邻居的海伦3条。 
 * 2.渔夫又卖掉剩下的鱼的3分之2,自己又吃了一条
 * 3.海伦来看渔夫,问他那天打了多少鱼,渔夫数了数,家里还剩下4条,渔夫对海伦怎么说呢?
 * Created by WangNing.
 * Date: 2018/4/26
 * Time: 13:06
 */
public class Demo04{
    public void fish(){
        int total =8;//   至少有8条=邻居的海伦3条+又吃了1条+剩下4条
        int left = 0;
        do{
            int sold = total/2;
            int fistleft = sold -3;
            if(fistleft % 3 ==0){
                left = fistleft/3 -1;
                if (left ==4){
                    System.out.println("共有"+total+"鱼");
                }
            }
            total=total+2;//刚开始能平均2份,因此鱼数必定是偶数,步长为2
        }while (left!=4);
    }

    public void monkey(){
        int day,x2;
        int x1 =0;
        day=9;
        x2=1;
        while(day>0){
            x1=(x2+1)*2;/*第一天的桃子数是第2天桃子数加1后的2倍*/
            x2=x1;
            day--;
        }
        System.out.println("桃子总共有："+x1+"个");
    }

    public void sum(int num){
        int sum=0;
        for(int i=0;i<num;i++){
            sum = sum +i;
        }
        System.out.println("累加和为:"+sum);
    }

    public static void main(String[] args) {
        Demo04  d4 = new Demo04();
        d4.fish();
        d4.monkey();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要累加的最后一个数字：");
        int num = input.nextInt();
        d4.sum(num);
    }


}
