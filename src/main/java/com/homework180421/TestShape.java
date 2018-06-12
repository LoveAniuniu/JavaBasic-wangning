package com.homework180421;

/**
 * Created by WangNing.
 * Date: 2018/5/9
 * Time: 19:32
 */
public class TestShape {
    public static void main(String[] args) {
        System.out.println("测试圆形：");
        Circle c = new Circle();
        c.setR(5);
        c.setCenter(new Point(2,3));
        Point p = new Point(1,3);
        System.out.println(c.getCenter().distince(p));
        System.out.println(c.area());
        System.out.println(c.Contains(p));

        System.out.println("测试长方形：");
        Rect r = new Rect();
        r.setUp(new Point(3,5));
        r.setX(3);
        r.setY(4);

        System.out.println(r.area());
        System.out.println(r.Contains(new Point(4,5)));
    }
}
