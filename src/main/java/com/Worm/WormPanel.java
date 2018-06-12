package com.Worm;

/**
 * Created by WangNing.
 * Date: 2018/5/23
 * Time: 14:50
 */
public class WormPanel {
    Worm worm = new Worm();
    private int ROW = 8;
    private int COL = 32;

    public WormPanel() {
    }

    public WormPanel(int ROW, int COL) {
        this.ROW = ROW;
        this.COL = COL;
    }

    public int getROW() {
        return ROW;
    }

    public int getCOL() {
        return COL;
    }

    public void display() {

        for (int i = 0; i<=ROW; i++) {
            for (int j = 0; j<=COL; j++) {
                if (i == 0 || i == ROW) {
                    System.out.print("-");
                } else if (j == 0 || j == COL) {
                    System.out.print("|");
                } else if (worm.contains(i, j)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
