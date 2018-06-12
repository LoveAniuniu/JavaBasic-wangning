package com.homework180512;
import java.util.*;

/**
 * Created by WangNing.
 * Date: 2018/5/18
 * Time: 12:33
 */

/*
* LinkedList底层是双向循环列表实现的，删除、插入比较快
* Arraylist底层是数组实现的，查找、遍历的速度比较快
* */
public class ArrayListDemo {
    public static void main(String[] args) {
        /* Set 1、集合中元素不能重复，2、没有顺序 */
        //Set不能通过循环取出集合中的元素，Interator迭代获取，没有下标没有元素
        Set<String> set = new HashSet<String>();
        set.add("123");
        set.add("123");
        set.add("324");
        set.add("aaa");
        set.add("4234");
        set.add("jkld");
        System.out.println(set);
        //增强型for循环，又叫for-each
        //String str:list   分别是变量的类型 变量名 集合类型
        for(String str:set){
            System.out.println(str);
        }

        //迭代器的使用
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        /* Map 1、集合中元素不能重复且无序，如果key重复会覆盖原来元素并更新value值。 */
        Map<String,String> map = new HashMap<String, String>();
        map.put("a","zhangsan");
        map.put("b","lisi");
        map.put("c","jkjaf");
        map.put("c","234d");
        System.out.println(map.get("a"));
        System.out.println(map);


        List<String> list = new ArrayList();
        list.add("1212");
        list.add("2132");
        list.add("adsf");
        list.add("dzxcv");
        System.out.println(list);
        //通过遍历打出元素值
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //增强型for循环，又叫for-each
        //String str:list   分别是变量的类型 变量名 集合类型
        for(String str:list){
            System.out.println(str);
        }

    }
}
