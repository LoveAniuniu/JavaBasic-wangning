package com.homework180414;

import java.util.Scanner;

/**
 * Created by WangNing.
 * Date: 2018/4/24
 * Time: 16:28
 */
public class Gobang {
    static char[][] arr = new char[15][15];
    static boolean isblock = true;

    public  static  void init(){        ////打印出五子棋的底盘
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) {
                arr[i][j] = '*';
            }
        }
    }

    public static char fromIntToChar(int x){    //把>9的数字转化成a,b,c,d,e
        if(x>=0 && x<=9){
            return (char) ('0' + x);
        }else {
            return (char)('a' + x -10);
        }
    }

    public static int fromCharToInt(char x){    //把字符型转化成int类型
        if(x>='0' && x<='9'){
            return x - '0';
        }else {
            return x -'a' +10;
        }
    }

    public static void Print(){
        System.out.print("   ");
        for (int i=0;i<arr.length;i++){
            System.out.print(fromIntToChar(i)+"  ");      //打印横向坐标
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(fromIntToChar(i) +"  ");   //打印纵向坐标
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {    //主函数
        init();
        Print();
        play();
//        isWin();
    }

    public static void play(){
        Scanner sca = new Scanner(System.in);
        while (true) {
            System.out.println("请"+(isblock?"黑":"白")+"方落子");
            String str = sca.nextLine();
            if (str.length()!=2){
                System.out.println("输入错误，请重新输入！");
                continue;
            }
            char cRow = str.charAt(0);
            char cCol = str.charAt(1);
            int row = fromCharToInt(cRow);
            int col = fromCharToInt(cCol);
            if (row < 0 || col < 0 || row >=arr.length || col>=arr.length){
                System.out.println("输入错误，请重新输入！");
                continue;
            }
            arr[row][col] = isblock?'@':'0';
            Print();
            isblock = !isblock;
        }
    }

   /*   public static boolean isWin(int row,int col){
        return isWinAtRt(row, col);
    }
    public static boolean isWinAtRt(int row,int col){      //向右方向查找
        int i = row;    // 保存横坐标
        char c = arr[row][col]; //取出落子方向
        while (i>=0 && c==arr[i][col]){     //循环向上查找
            i--;
        }
        i++;
        int count=0;
        while (i<arr.length && c==arr[i][col]){
            i++;
            count++;
        }
        return count>=5;
    }

  public static boolean isWinAtUp(int row, int col){      //向上方查找
        int j = col;
        char c = arr[row][col];
        while (j>=0 && c=arr[row][j]){
            j--;
        }
        j++;
        int count = 0;
        while (j<arr.length && c==arr[row][j]){
            j++;
            count++;
        }
        return count>=5;
    }
*/

}

