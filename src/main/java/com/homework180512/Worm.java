package com.homework180512;

import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by WangNing.
 * Date: 2018/5/18
 * Time: 15:56
 */
public class Worm {


    public static final int UP = -10;
    public static final int DOWN = 10;
    public static final int LEFT = -1;
    public static final int RIGHT = 1;

    private int direction;

    private LinkedList<WormNode> nodes = new LinkedList<WormNode>();


    public Worm(){
        nodes.add(new WormNode(3,9));
        nodes.add(new WormNode(4,9));
        nodes.add(new WormNode(5,9));
        nodes.add(new WormNode(5,10));
        nodes.add(new WormNode(5,11));
        nodes.add(new WormNode(6,11));
        nodes.add(new WormNode(7,11));
        direction = UP;
    }

    public void step(){
        WormNode head = nodes.getFirst();
        WormNode tail = nodes.getLast();
        WormPanel wp = new WormPanel();
        int ni = head.getI()+direction/10;
        int nj = head.getJ()+direction%10;
        /*判断蛇的下一个节点是否会撞墙*/
        if(ni<=0||ni>wp.getRow() ||nj<=0||nj>=wp.getCol()){
            System.exit(0);
            System.out.println("Game Over！！！");
        }else {
            WormNode next = new WormNode(ni,nj);
            nodes.addFirst(next);
            nodes.removeLast();
        }
    }


    public void step(int direction){
        this.direction = direction;
        step();
    }

    public boolean contains(int i,int j){
        return nodes.contains(new WormNode(i,j));
    }

    public Worm(LinkedList<WormNode> nodes){
        this.nodes.clear();
        this.nodes.addAll(nodes);
        this.direction = direction;
    }
}
