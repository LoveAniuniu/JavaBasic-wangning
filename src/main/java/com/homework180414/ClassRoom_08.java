package com.homework180414;

/**
 * 36个人搬36块砖，男人一个人搬4，女3，小孩2个人搬1块，所有的人一次办完。几男几女几小孩?
 * Created by WangNing.
 * Date: 2018/4/23
 * Time: 10:26
 */
public class ClassRoom_08 {
    public static void main(String[] args) {
        for (int i=0;i<36;i++){
            for(int j=0;j<36;j++){
                for (int k=0;k<36;k++){
                    if(4*i+3*j+0.5*k==36 && i+j+k==36){
                        System.out.println("i="+i+"  j="+j+"  k="+k);
                    }
                }
            }
        }

    }
}
