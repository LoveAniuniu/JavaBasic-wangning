package com.homework180519;

import java.util.Scanner;

/**l
 * Created by WangNing.
 * Date: 2018/5/22
 * Time: 17:17r
 */
public class WormMain {
    public static void main(String[] args) {
        WormPanel wp = new WormPanel();
        Scanner sc = new Scanner(System.in);;
        while (true){
            System.out.println("您现在的分数是："+wp.getCount());
            wp.print();
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("u")){
                wp.getWorm().step(Worm1.UP);
            }else if(str.equalsIgnoreCase("d")){
                wp.getWorm().step(Worm1.DOWN);
            }else if(str.equalsIgnoreCase("l")){
                wp.getWorm().step(Worm1.LEFT);
            }else if(str.equalsIgnoreCase("r")){
                wp.getWorm().step(Worm1.RIGHT);
            }else{
                System.out.println();
            }
        }
    }
}
