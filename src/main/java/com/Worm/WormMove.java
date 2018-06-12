package com.Worm;
import java.util.Scanner;

/**
 * Created by WangNing.
 * Date: 2018/5/23
 * Time: 16:25
 */
public class WormMove {
    public void move(){
        WormStep wormStep = new WormStep();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("u")){
                wormStep.step(Worm.UP);
            }else if(str.equalsIgnoreCase("d")){
                wormStep.step(Worm.DOWN);
            }else if(str.equalsIgnoreCase("l")){
                wormStep.step(Worm.LEFT);
            }else if (str.equalsIgnoreCase("r")){
                wormStep.step(Worm.RIGHT);
           }else {
                System.out.println("请重新输入！");
            }
        }

    }
}