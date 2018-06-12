package com.Worm;
import java.util.LinkedList;

/**
 * Created by WangNing.
 * Date: 2018/5/23
 * Time: 13:26
 */
public class Worm {

    public static int direction;
    public static final int UP = -10;
    public static final int DOWN = 10;
    public static final int LEFT = -1;
    public static final int RIGHT = 1;

    private LinkedList<Node> nodes = new LinkedList<Node>();

    public LinkedList<Node> getNodes() {
        return nodes;
    }

    public Worm() {
        nodes.add(new Node(3,9));
        nodes.add(new Node(4,9));
        nodes.add(new Node(5,9));
        nodes.add(new Node(5,10));
        nodes.add(new Node(5,11));
        nodes.add(new Node(6,11));
        nodes.add(new Node(7,11));
        direction = UP;
    }

    public boolean contains(int i,int j){
        return nodes.contains(new Node(i,j));
    }

    public Worm(LinkedList<Node> nodes) {
        nodes.clear();
        this.nodes = nodes;
        direction = UP;
    }
}
