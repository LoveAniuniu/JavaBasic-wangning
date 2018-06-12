package com.homework180504;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * 演示：冒泡排序
 * Time: 10:55
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,3,1,44,6,9,7,56,32};
        for(int i=0;i<arr.length-1;i++){//执行了几轮
            for(int j=0;j<arr.length-1-i;j++){//每轮的排序次数
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
