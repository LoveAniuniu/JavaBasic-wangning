package com.homework180421;

/**
 * Created by WangNing.
 * Date: 2018/5/9
 * Time: 17:46
 */
public class Point {
   private int x;
   private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distince(Point p){
        int x=this.x-p.x;
        int y=this.y-p.y;
        return Math.sqrt(x*x+y*y);
    }
}
