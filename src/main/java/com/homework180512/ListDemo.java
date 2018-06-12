package com.homework180512;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 16:02
 * 集合：某些指定的对象集在一起
 * 接口的2个方法：* list：1、集合中的元素可以重复，2、按添加的顺序存放
 *                          ArrayList：是线程不安全的，执行效率比Vector快
 *                          Vector：是线程安全的（Stack继承于Vector）
 *                * set：1、集合中元素不能重复，2、没有顺序
 * 接口不能被实例化
 *
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        List list1 = new ArrayList();
//        list.add("aaa");
//        list.add("bbbb");//将元素obj添加到集合的尾部
//        list.add(456);
//        System.out.println(list);
//        list.remove(1);//通过下标进行删除
//        System.out.println(list);
//        list.remove(new Integer(456));//从集合中删除首次出现的obj元素,如果存在则删除同时返回true，不存在返回false。
//        System.out.println(list);
//        System.out.println(list.get(0));//从集合中取出下标为index的那个元素
//        System.out.println(list.size());//返回集合的大小
//        System.out.println(list.isEmpty());//验证集合是否没有元素，如果没有返回true，反之返回false
//       // System.out.println(list.add(1,123));
//        boolean a = list.size()==0?true:false;
//        System.out.println("a="+a);
//
//        System.out.println(list.contains(1));//list中是否包含obj元素
//
        list.add(new Coo(1));
        list.add(new Coo(3));
        System.out.println(list.contains(new Coo(1)));
        //判断一个元素在不在集合中，调用equals方法进行比较
        //Object中的equal是根据地址进行判断2个值是否相等。
        // 实际应用时会想根据值判断，此时需要重写equal方法
    }
}

class Coo{
    private int x;
    public Coo(int x) {
        this.x = x;
    }

    //重写equal，目的是为了判断2个值是否相等，有点不理解!!!!
    public boolean equals(Object obj){
        if(obj==null) return false; //模式化写法
        if(this==obj) return true;  //模式化写法
        if(obj instanceof Coo){ //模式化写法，判读obj是不是Coo的对象
            Coo c2 = (Coo)obj;
            return c2.x==this.x;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return x;
    }
}