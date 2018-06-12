package com.Worm;

import java.util.Objects;

/**
 * Created by WangNing.
 * Date: 2018/5/23
 * Time: 13:25
 */
public class Node {
    private int i;
    private int j;

    public Node() {
    }

    public Node(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Node{");
        sb.append("i=").append(i);
        sb.append(", j=").append(j);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return i == node.i &&
                j == node.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}
