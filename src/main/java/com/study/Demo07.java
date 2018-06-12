package com.study;

public class Demo07 {
    public static void main(String []args){
        /*冒泡排序*/
        int [] array = {3,5,9,4,7,1,12,2,25,16,17};
        int temp;
        for(int i =0;i< array.length-1;i++){
            for ( int j =0;j<array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
