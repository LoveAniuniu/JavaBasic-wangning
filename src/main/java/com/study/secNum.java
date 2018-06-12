package com.study;

/**
 * Created by WangNing.
 * Date: 2018/6/7
 * Time: 14:55
 */
public class secNum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 4, 8};
        int max = arr[0];
        int smax = arr[1];
        for (int i = 1; i<arr.length; i++) {
            if (arr[i]> max) {
                smax = max;
                max = arr[i];
            } else if (arr[i]<max && arr[i]>smax) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }

}
