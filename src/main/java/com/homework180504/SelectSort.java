package com.homework180504;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * 演示：选择排序
 * Time: 10:40
 */
public class SelectSort {
/*选择排序：依次用第i位的数和后面的数比较*/
    public static void main(String[] args) {
        int[] arr = {5,2,6,9,1,7,10,32,11};
        for(int i=0;i<arr.length-1;i++){ //
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
