package com.homework180512;
import java.util.*;
/**
 * Created by WangNing.
 * Date: 2018/5/18
 * Time: 17:34
 */
public class WormMain {
    public static void main(String[] args) {
        Worm worm =new Worm();
        WormPanel wp = new WormPanel(worm);
        Scanner sc = new Scanner(System.in);
            while (true){
                wp.print();
                String str = sc.nextLine();
                if(str.equalsIgnoreCase("u")){
                    worm.step(Worm.UP);
                }else if(str.equalsIgnoreCase("d")){
                    worm.step(Worm.DOWN);
                }else if(str.equalsIgnoreCase("l")){
                    worm.step(Worm.LEFT);
                }else if(str.equalsIgnoreCase("r")){
                    worm.step(Worm.DOWN);
                }else if(str.equalsIgnoreCase("q")){
                    System.out.println("Bye ^_^");
                    break;
                }else {
                    worm.step();
                }
            }
    }

}
