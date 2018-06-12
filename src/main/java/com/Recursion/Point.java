package com.Recursion;

import java.util.Objects;

/**
 * Created by WangNing.
 * Date: 2018/5/29
 * Time: 14:49
 */
public class Point {
    private int i;
    private int j;

    public Point(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public Point() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Point add(int i, int j){
        return new Point(this.i+i,this.j+j);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Point{");
        sb.append("i=").append(i);
        sb.append(", j=").append(j);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return i == point.i &&
                j == point.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}
