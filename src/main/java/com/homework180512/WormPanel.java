package com.homework180512;

/**
 * Created by WangNing.
 * Date: 2018/5/18
 * Time: 16:01
 */
public class WormPanel {
    private Worm worm;

    public WormPanel(Worm worm) {
        this.worm = worm;
    }

    public WormPanel() {
    }

    private static final int row = 10;
    private static final int col = 32;

    public static int getRow() {
        return row;
    }

    public static int getCol() {
        return col;
    }

    public void print(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||i==row-1){
                    System.out.print("-");
                }else if(j==0||j==col-1){
                    System.out.print("|");
                }else if(worm.contains(i,j)){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
