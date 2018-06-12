package com.study;

/**
 * Created by WangNing.
 * Date: 2018/5/15
 * Time: 19:26
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] index = new int[4];
        index[0]=0;
        index[1]=1;
        index[2]=2;
        index[3]=3;
        String[] islands = new String[4];
        islands[0]="Boole";
        islands[1]="Frand";
        islands[2]="Azores";
        islands[3]="Cozoli";
        int i=0;
        int ref;
        while (i<4){
            ref = index[i];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            i++;
        }
    }
}
