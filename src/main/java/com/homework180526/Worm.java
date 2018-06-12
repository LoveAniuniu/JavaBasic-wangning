package com.homework180526;

import java.util.LinkedList;

/**
 * Created by WangNing.
 * Date: 2018/5/30
 * Time: 14:45
 */
public class Worm {
    // /10 =-1, %1 =0, (-1,0)确定为向上运行
    public static final int UP = -10;
    // /10=1, %1=0,(1,0) 确定向下运行
    public static final int DOWN = 10;
    // /10=0, %1=-1,(0,-1) 确定向左运行
    public static final int LEFT = -1;
    //  /10=0, %1=-1,(0,1) 确定向右运行
    public static final int RIGHT = 1;

    //创建一个链表 来报存蛇的身体
    private LinkedList<Point> nodes = new LinkedList<Point>();
    private int direction;

    //无参的Worm构造函数,初始化蛇的身体、运行的方向,
    public Worm(){
        nodes.add(new Point(3,9));
        nodes.add(new Point(4,9));
        nodes.add(new Point(5,9));
        nodes.add(new Point(5,10));
        nodes.add(new Point(5,11));
        nodes.add(new Point(6,11));
        nodes.add(new Point(7,11));
        direction = UP;//自己定义蛇的方向
    }

    //判断坐标是否在蛇身上
    public boolean contains(int i,int j){ return nodes.contains(new Point(i,j)); }

    //蛇的运动
    public void step(){
        //从链表中获取蛇的第一个
        Point head = nodes.getFirst();
        //按照方向确定蛇运行的下一个位置
        Point next = new Point((head.getI()+direction/10),(head.getJ()+direction%10));
        Print p = new Print();
        //运动碰到边界
        if(next.getI()==0||next.getI()==p.getROW()||next.getJ()==0||next.getJ()==p.getCOL()){
            throw new RuntimeException("撞墙啦");
        }

        //运动时蛇吃自己
        if (nodes.contains(new Point(next.getI(),next.getJ()))){
            throw new RuntimeException("吃自己身体呀！");
        }

        //吃食物
        nodes.addFirst(next);
        //移除链表的最后一个结点，蛇的尾巴
        nodes.removeLast();


    }

    //通过方法的重载，根据传入的方向重新定义蛇的蛇的运动
    public void step(int direction){
        this.direction = direction;
        step();
    }

    public Worm(LinkedList<Point> nodes){
        this.nodes.clear();
        this.nodes.addAll(nodes);
        this.direction = UP;
    }


}
