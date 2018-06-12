package com.Recursion;

/**
 * Created by WangNing.
 * Date: 2018/5/25
 * Time: 17:25
 */
public class Stairs {
    //  **************************************************************
    public int climbStairs(int n) {
        int i=1;
        if(n<=0)//如果有0个台阶，那么有0种走法
            return 0;
        if(n==1){//如果有1个台阶，那么有1种走法
            return i;
        }
        if(n==2){//如果有2个台阶，那么有2种走法（一次走1个，走两次；一次走两个）；
            i++;
            return i;
        }
        else    //如果台阶数目多于2个，那么首先第一步就有两种选择：第一次走1个，或者第一次走两个。
            // 这样除了第一次后边的走法就有了两种情形：climbStairs(n-1)和climbStairs(n-2)
            return climbStairs(n-1)+climbStairs(n-2);
        }
    //**************************************************************
    public static void main(String []args){
            Stairs cs=new Stairs();
            int a =cs.climbStairs(4);
            System.out.println(a);
    }


}
