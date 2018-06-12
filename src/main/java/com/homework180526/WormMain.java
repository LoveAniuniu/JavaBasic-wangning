package com.homework180526;
import java.util.Scanner;

/**
 * Created by WangNing.
 * Date: 2018/5/30
 * Time: 17:09
 */
public class WormMain {
    public static void main(String[] args) {
        Worm worm = new Worm();
        //创建打印面板print的对象
        Print p = new Print(worm);


        //创建一个Scanner对象
        Scanner sc = new Scanner(System.in);
        while (true) {
            //打印初始化的蛇
            p.print();
            //获取从控制台上输入的字符
            String str = sc.nextLine();
                 //当输入的字符等于U/u
            if(str.equalsIgnoreCase("u")){
                //根据控制台输入的方向来控制蛇向哪个方向走步
                worm.step(Worm.UP);
            }else if(str.equalsIgnoreCase("d")){
                worm.step(Worm.DOWN);
            }else if(str.equalsIgnoreCase("l")){
                worm.step(Worm.LEFT);
            }else if(str.equalsIgnoreCase("r")){
                worm.step(Worm.RIGHT);
                //当输入的字符等于Q/q，控制台输出友好提示、并结束游戏
            }else if(str.equalsIgnoreCase("q")){
                System.out.println("BYE!^_^");
                break;
                //当输入的字符是其他的，提示
            }else {
                worm.step();
            }
        }


    }
}
