package com.homework180414;


/**
 * Created by WangNing.
 * 1~100的质数(被1和本身正常)
 * Date: 2018/4/23
 * Time: 10:26
 */
public class ClassRoom_07{
    public static void main(String[] args) {
        for(int i=2;i<100;i++){
            boolean flag = true;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
