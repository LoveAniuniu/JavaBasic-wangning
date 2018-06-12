package com.homework180421;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/11
 * Time: 13:52
 */
public class Sort {
    public static void main(String[] args) {
/*==================================================================================*/
        int[] arr1={30, 6, 5, 15, 13, 18, 10, 36, 25};
        System.out.println("BubbleSort排序前的顺序："+Arrays.toString(arr1));
        BubbleSort s1 = new BubbleSort();
        s1.BubbleSort(arr1);
        System.out.println("BubbleSort排序后的顺序："+Arrays.toString(arr1));
/*==================================================================================*/
        int[] arr2={30, 6, 5, 15, 13, 18, 10, 36, 25};
        System.out.println("SelectSort排序前的顺序："+Arrays.toString(arr2));
        SelectSort s2=new SelectSort();
        s2.SelectSort(arr2);
        System.out.println("SelectSort排序后的顺序："+Arrays.toString(arr2));
/*==================================================================================*/
        int[] arr3={30, 6, 5, 15, 13, 18, 10, 36, 25};
        System.out.println("InsertSort排序前的顺序："+Arrays.toString(arr3));
        InsertSort s3 = new InsertSort();
        s3.InsertSort(arr3);
        System.out.println("InsertSort排序后的顺序："+Arrays.toString(arr3));
/*==================================================================================*/
        int[] arr4={30, 6, 5, 15, 13, 18, 10, 36, 25};
        System.out.println("QuckSort排序前的顺序："+Arrays.toString(arr4));
        QuckSort s4 = new QuckSort();
        int start =0;
        int end =arr4.length-1;
        s4.QuckSort(arr4,start,end);
        System.out.println("QuckSort排序后的顺序："+Arrays.toString(arr4));
    }
/*==================================================================================*/
}

class BubbleSort{
     public void BubbleSort(int[] arr){
        int temp;
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){//比较相邻的元素，如果前一个比后一个大，就把它们两个调换位置。
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

class SelectSort{
        /*
    * 1、直接选择排序（Straight Select Sort）算法思想：
    * 第一趟从n个元素的数据序列中选出关键字最小/大的元素并放在最前/后位置，
    * 下一趟从n-1个元素中选出最小/大的元素并放在最前/后位置。以此类推，经过n-1趟完成排序。
    * */
    public void SelectSort(int[] arr){
        //选择排序
        int temp;
        for(int i=0;i<arr.length;i++){
            //内层循环j=i+1,外层循环控制着循环次数。即每趟中a[i]这个值就是本趟的最小值。i位置上是最小值
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}


class InsertSort{
    public void InsertSort(int[] arr){
        //插入排序
        int i,j,tmp;
        for (i = 1; i < arr.length; i++) {
            tmp = arr[i];
            for (j = i-1;j >= 0 && arr[j]>tmp; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = tmp;
        }
    }
}


class QuckSort{
    public void QuckSort(int[] arr,int low,int high){
        //插入排序
        int start = low;
        int end = high;
        int key = arr[low];
        while(end>start){
            //从后往前比较
            while(end>start&&arr[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(arr[end]<=key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            //从前往后比较
            while(end>start&&arr[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if(arr[start]>=key){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if(start>low) QuckSort(arr,low,start-1);//左边序列。第一个索引位置到关键值索引-1
        if(end<high) QuckSort(arr,end+1,high);//右边序列。从关键值索引+1到最后一个
    }
}

