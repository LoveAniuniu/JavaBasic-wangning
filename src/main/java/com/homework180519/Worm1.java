package com.homework180519;
import java.util.LinkedList;

/**
 * Created by WangNing.
 * Date: 2018/5/22
 * Time: 14:25
 */
public class Worm1 {
    public static final int UP = -10;
    public static final int DOWN = 10;
    public static final int LEFT = -1;
    public static final int RIGHT = 1;

    private LinkedList<Node> nodes = new LinkedList<Node>();
    private int direction;

    public Worm1() {
        nodes.add(new Node(3,9));
        nodes.add(new Node(4,9));
        nodes.add(new Node(5,9));
        nodes.add(new Node(5,10));
        nodes.add(new Node(5,11));
        nodes.add(new Node(6,11));
        nodes.add(new Node(7,11));
        direction = UP;//自己定义蛇的方向
    }

   public boolean contains(int i,int j){
       return nodes.contains(new Node(i,j));
   }

    public void step(){
        Node head = nodes.getFirst();
        int xx = head.getX()+direction/10;
        int yy =head.getY()+direction%10;
        WormPanel wp = new WormPanel();
        //撞墙！
        if(xx == 0 || xx==wp.getROW() || yy==0 || yy==wp.getCOL() ){
            throw new RuntimeException("撞墙了！");
        }
        Node next = new Node(xx,yy);
        if(nodes.contains(next)){
            throw new RuntimeException("残忍啊！");
        }
        nodes.addFirst(next);
        nodes.removeLast();
    }

    public void step(int direction){
        this.direction = direction;
        step();
    }

    public Worm1(LinkedList<Node> nodes) {
        this.nodes.clear();
        this.nodes = nodes;
        this.direction = UP;
    }
}
