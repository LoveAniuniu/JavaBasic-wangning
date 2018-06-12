package com.homework180421;

/**
 * Created by WangNing.
 * Date: 2018/5/9
 * Time: 12:45
 */
public class FunctionDemo {
    public static void main(String[] args) {
        int x =3;
        f(x);
        System.out.println(x);
        System.out.println("==========================");

        Student stu = new Student("小毒人",18,"S001");
        System.out.println(stu.name+":"+stu.age);
        change(stu);
        System.out.println(stu.name+":"+stu.age);
    }

    private static void f(int a) {
        a++;
    }

    public static void change(Student stu){
        stu.age=18;
        stu.name="张三";
    }

}
