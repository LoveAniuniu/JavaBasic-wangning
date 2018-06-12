package com.study;/*在数组中线性查找一个数字*/
import java.util.Scanner;
public class Demo01{
    public static void main(String args[]){
        //在数组中查找某个数
        int [] array = {60,20,40,70,30,50,90};
        System.out.println("请输入一个数字：");
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int index = -1;
        for (int i=0;i<array.length;i++){
            if( array[i]==number){
                index=i+1;
                break;
            }
        }
        if (index!=-1){
            System.out.println("找到数据，"+"对应的位置是 "+index);
        }else{
            System.out.println("没有找到数据");
        }
    }
}