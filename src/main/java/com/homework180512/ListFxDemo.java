package com.homework180512;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * 集合中存放相同数据类型
 * Time: 18:12
 */
public class ListFxDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        System.out.println(list);
        List<Integer> list2=new ArrayList<Integer>();
        //集合中不能使用基本数据类型，只能使用封装类
        list2.add(123);
        System.out.println(list2);


    }
}
