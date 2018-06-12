package com.homework180526;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by WangNing.
 * Date: 2018/5/29
 * Time: 14:46
 * 广度优先算法：根据迷宫数组，获取起始点
 *
 */
public class BreadthFA {
    public static int[][] direction ={{-1,0},{0,-1},{1,0},{0,1}};//定义4个方向
    public static void main(String[] args)  throws Exception {
        String filename = "D:/wangning/Demo/java/com/homework180526/bf.in";
        int[][] mg = readFileToArray(filename);
        print(mg);
        System.out.println("=============");
        int[][] steps = walk(mg,new Point(0,0),new Point(mg.length-1,mg[0].length-1));
        print(steps);
        System.out.println("============");
        System.out.println(find(steps,new Point(mg.length-1,mg[0].length-1)));
    }

    //打印出二维数据方法
    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    //根据迷宫数组，获得起始点与每个点相差的步数
    //arr 迷宫数组
    //start 起始点
    //end 出口
    //返回一个二维数组，标记了每一个点与起始点相差的步数 点的坐标就是二维数组的下标
    public static int[][] walk(int[][] arr,Point start,Point end){
        //声明一个动态数组，大小和迷宫一样，用于记录每个点与起始点的步数
        int[][] steps = new int[arr.length][arr[0].length];
        //创建一个LinkList队列，用于保存需要探索的点
        LinkedList<Point> q = new LinkedList<Point>();
        //将起点加入到探索队列中
        q.push(start);
        //循环从探索队列中取出探索点进行探索，直到探索队列中没有探索点
        while (q.size() >0 ){
            //从探索队列中取出第一个，并从探索队列中删除
            Point current = q.poll();
            //探索点与出口一致，结束循环
            if (current.equals(end))    break;
            //根据探索点进行探索,分别探索点 上 左 下 右 4个方向
            for (int i=0;i<direction.length;i++){
                //根据探索点找到需要探索的下一个点坐标
                Point next = current.add(direction[i][0],direction[i][1]);
                //下个探索点坐标超出数组范围，不向下进行探索
                if(next.getI()< 0 || next.getI() >= arr.length ||next.getJ()<0 ||next.getJ() >= arr[0].length) continue;
                //下个探索点坐标是墙，在原来的二维数组中根据坐标查看值是否为1
                if (arr[next.getI()][next.getJ()] == 1) continue;
                //下一个需要探索的点坐标是否已经走过，steps二维数组中根据点坐标查看值是不是不要等0，因为走过的点会记录与起始点相差的步数
                if (steps[next.getI()][next.getJ()] != 0) continue;
                //需要探索的点 是否和起始点相等, 若相等则不探索
                if (next.equals(start)) continue;
                //如果以上都通过，那么我们记录下一个需要探索的点与起始点的步数
                int currentStep = steps[current.getI()][current.getJ()];
                //记录当前探索的点与起始点相差的步数，当前探索点的步数+1 等于下一个需要探索的点与起始点相差的步数，
                // 并根据下一个探索点的坐标保存到steps二维数据中
                steps[next.getI()][next.getJ()] = currentStep+1;
                //将下一个需要探索的点加入探索队列
                q.add(next);
            }
        }
        return steps;
    }

    //
    public static List<Point> find(int[][] arr,Point end){
        LinkedList<Point> points = new LinkedList<Point>();
        int step = arr[end.getI()][end.getJ()];
        points.push(end);
        while (true){
            Point current = points.peek();
            step --;
            for (int i=0;i<direction.length;i++){
                Point next = current.add(direction[i][0],direction[i][1]);
                if(next.getI()< 0 || next.getI() >= arr.length ||next.getJ()<0 ||next.getJ() >= arr[0].length) continue;
                if (arr[next.getI()][next.getJ()] == step){
                    points.push(next);
                    break;
                }
            }
            if (step==0) break;
        }
        return points;
    }

    public static int[][] readFileToArray(String fileName) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String str = br.readLine(); //读取文件中的第一行
        String[] ss = str.split("\\s+");    //根据空白进行拆分，\s+ 1个以上的空白
        int row = Integer.parseInt(ss[0]);  //获取行数
        int col = Integer.parseInt(ss[1]);  //获取列数
        int[][] mg =new int[6][5];
        for(int i=0;i<row;i++){     //分别读取行
            str=br.readLine();      //读取文件中的i行
            ss = str.split("\\s+"); //继续拆分成字符串数据
            for(int j=0;j<ss.length;j++){   //分别读取列
                mg[i][j] = Integer.parseInt(ss[j]); //把第i列的字符，赋值为数组mg[i][j]
            }
        }
        return mg;
    }
}
