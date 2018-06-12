package com.Worm;

import sun.awt.windows.WPageDialog;

/**
 * Created by WangNing.
 * Date: 2018/5/23
 * Time: 13:35
 */
public class WormStep {
    Worm worm = new Worm();
    public void step(){
        Node head =worm.getNodes().getFirst();
        int xx =head.getI() + Worm.direction/10;
        int yy = head.getJ() + Worm.direction%10;
        WormPanel wp = new WormPanel();
        if (xx==0 || xx==wp.getROW() || yy == 0 || yy == wp.getCOL()) {
            throw new RuntimeException("撞墙了！");
        }
        Node next = new Node(xx, yy);
        worm.getNodes().addFirst(next);
        worm.getNodes().removeLast();
    }

    public void step(int direction){
        Worm.direction = direction;
        step();
    }

}
