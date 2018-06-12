package com.study;

import java.util.Scanner;

public class Demo06{
    public static void main(String args[]){
        int []array = {1,3,9,12,16,25,33,41};
        int start = 0;
        int end = array.length -1;
        int index = -1;
        System.out.println("请输入需要查找的数据：");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (start <= end){
            int mid = (start+end)/2;
            if(number == array[mid]){
                index = mid+1;
                break;
            }
            if(number < array[mid]){
                end = mid -1;
            }
            if(number > array[mid] ){
                start = mid +1;
            }
        }
        if(index !=-1){
            System.out.println("找到数据，位置是"+index);
        }else {
            System.out.println("没有找到数据");
        }

    }
}