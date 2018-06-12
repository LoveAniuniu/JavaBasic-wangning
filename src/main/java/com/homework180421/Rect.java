package com.homework180421;

/**
 * Created by WangNing.
 * Date: 2018/5/9
 * Time: 19:04
 */
public class Rect extends Shape{
    private Point up;
    private int x;
    private int y;

    @Override
    public double area() {
        return x*y;
    }

    @Override
    public boolean Contains(Point p) {
        int xx = up.getX()+this.x;
        int yy = up.getY()+this.y;
        return p.getX()>=up.getX() && p.getY()>=up.getY() && p.getX()<= xx && p.getY()<=yy;
    }

    public Point getUp() {
        return up;
    }

    public void setUp(Point up) {
        this.up = up;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}
