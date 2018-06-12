package com.homework180526;

import java.util.Random;
import java.util.HashSet;
/**
 * Created by WangNing.
 * Date: 2018/5/30
 * Time: 15:22
 */
public class Print {
    //new一个随机对象
    Random ran = new Random();

    //通过HashSet创建一个foods对象
    private HashSet<Point> foods = new HashSet<Point>();

    public HashSet<Point> getFoods() {
        return foods;
    }

    //生成一个无参的构造方法
    public Print(){
    }


    //给面板上添加一个蛇
    private Worm worm;

    //生成get方法
    public Worm getWorm() {
        return worm;
    }
    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    //有参构造器
    public Print(Worm worm) {
        //添加一个蛇
        this.worm = worm;
        //生成食物
        initFood(3);

    }

    //定义面板的行数、列数
    private int ROW = 10;
    private int COL = 32;

    public int getROW() {
        return ROW;
    }
    public int getCOL() {
        return COL;
    }

    //打印蛇所在的面板
    public void print() {
        for(int i=0;i<=ROW;i++){
            for(int j=0;j<=COL;j++){
                if(i==0||i==ROW){
                    System.out.print("-");
                }else if(j==0||j==COL){
                    System.out.print("|");
                }else if(worm.contains(i,j)){
                    System.out.print("#");
                }else if(foods.contains(new Point(i,j))){
                    System.out.print("o");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /* 通过for循环往面板上添加foods*/
    public void initFood(int n){
        for(int i=0;i<n;i++){
            int fi = ran.nextInt(getROW()-1)+1;
            int fj = ran.nextInt(getCOL()-1)+1;
            if(worm.contains(fi,fj))  continue;
            if (foods.contains(new Point(fi,fj))) continue;
            foods.add(new Point(fi,fj));
        }
    }


}
