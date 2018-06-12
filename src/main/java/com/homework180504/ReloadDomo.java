package com.homework180504;

/**
 * Created by WangNing.
 * Date: 2018/5/15
 * Time: 17:16
 */
public class ReloadDomo {
    public int add(int a,int b){
        return a+b;
    }

    public int add1(int a,int b,int c){
        return a+b+c;
    }

    public float fun1(int a,float b){
        return a+b;
    }
    //
    public float fun1(float a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        ReloadDomo re = new ReloadDomo();
        int s1 = re.add(3,5);
        int s2 = re.add1(4,5,6);
        float s3 = re.fun1(3.14f,5);
        float s4 = re.fun1(5,3.14f);
        System.out.println(s1+"；"+s2+"；"+s3+"；"+s4);
    }
}
