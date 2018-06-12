package com.homework180519;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by WangNing.
 * Date: 2018/5/22
 * Time: 14:23
 */
public class WormPanel {
    Random ran = new Random();
    private Worm worm;

    public int getCount() {
        return count;
    }

    private int num=0;
    private int count=0;

    public Worm getWorm() {
        return worm;
    }

    public WormPanel() {
        this.worm = this.new Worm();
        initFood(1);
    }

    private final static int ROW=10;
    private final static int COL = 32;
    private HashSet<Node> foods = new HashSet<Node>();

    public static int getROW() {
        return ROW;
    }

    public static int getCOL() {
        return COL;
    }


    public void initFood(int n){
        /* 通过for循环往面板上添加foods*/
//        for(int i=0;i<n;i++){
//            int fi = ran.nextInt(getROW()-1)+1;
//            int fj = ran.nextInt(getCOL()-1)+1;
//            if(worm.contains(fi,fj))  continue;
//            if (foods.contains(new Node(fi,fj))) continue;
//            foods.add(new Node(fi,fj));
//        }

         /* 通过while循环往面板上添加foods*/
        int i=0;
        while (i<n){
            int fi = ran.nextInt(getROW()-1)+1;
            int fj = ran.nextInt(getCOL()-1)+1;
            foods.add(new Node(fi,fj));
            num = ran.nextInt(9)+1; //随机产生1-9之间的数
            i++;
        }
    }

    public void print(){
        for (int i=0;i<=ROW;i++){
            for(int j=0;j<=COL;j++){
                if(i==0||i==ROW){
                    System.out.print("-");
                }else if(j==0||j==COL){
                    System.out.print("|");
                }else if(worm.contains(i,j)){
                    System.out.print("#");
                }else if (foods.contains(new Node(i,j))){
                    System.out.print(num);//随机产生0-9之间的数当做食物
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    class Worm{
        public static final int UP = -10;
        public static final int DOWN = 10;
        public static final int LEFT = -1;
        public static final int RIGHT = 1;

        private LinkedList<Node> nodes = new LinkedList<Node>();
        private int direction;

        public Worm() {
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
            //吃食物
            nodes.addFirst(next);//头+1
            if(foods.contains(next)){
                //移除食物
                foods.remove(next);
                //吃掉食物后总和加上移除的随机数
               // count = count + num;
                //移除食物后再次创建一个新的食物
                initFood(1);
                //return结束所有层循环
                return;
            }
            nodes.removeLast();
        }

        public void step(int direction){
            this.direction = direction;
            step();
        }

        public Worm(LinkedList<Node> nodes) {
            this.nodes.clear();
            this.nodes = nodes;
            this.direction = UP;
        }
    }
}
