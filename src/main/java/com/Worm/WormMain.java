package com.Worm;

/**d
 * Created by WangNing.
 * Date: 2018/5/23
 * Time: 14:49
 */
public class WormMain {
    public static void main(String[] args) {
        Worm worm = new Worm();
        new WormPanel().display();
        new WormMove().move();
    }
}
