package com.homework180504;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 13:29
 * 演示：插入排序
 * 记不住啊记不住啊，多调几次多调几次
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr ={3,1,4,8,7,5,20,15,11};
        for(int i=1;i<arr.length;i++){
            int temp =arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(temp < arr[j]){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
