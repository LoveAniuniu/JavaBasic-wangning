package com.study;

/*在数组中找到最大值、最小值*/
public class Demo05 {
    public static void main(String args[]){
        int [] array = {8,15,22,89,45,3,56,21,18};
        int max = array[0];
        int min = array[0];
        for (int i=0;i<array.length;i++){
            if( max < array[i]){
                max = array[i];
            }
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("数组中的最大值是"+max);
        System.out.println("数组中的最小值是"+min);

    }
}
