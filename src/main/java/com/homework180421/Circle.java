package com.homework180421;

import java.nio.channels.Pipe;
import java.util.Map;

/**
 * Created by WangNing.
 * Date: 2018/5/9
 * Time: 18:46
 */
public class Circle extends Shape {
    private Point center;
    private int r;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*this.r;
    }

    @Override
    public boolean Contains(Point p) {
        return center.distince(p)<=r;
    }
}
