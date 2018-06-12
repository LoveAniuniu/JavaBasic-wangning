package com.homework180512;

import java.util.Objects;

/**
 * Created by WangNing.
 * Date: 2018/5/18
 * Time: 15:54
 */
public class WormNode {
    private int i;
    private int j;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WormNode wormNode = (WormNode) o;
        return i == wormNode.i &&
                j == wormNode.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
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

    public WormNode() {

    }

    public WormNode(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
