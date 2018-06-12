package com.homework180421;

/**
 * Created by WangNing.
 * Date: 2018/5/9
 * Time: 15:42
 */
public class ExtendDemo {
    public static void main(String[] args) {
        Persons p1 = new Teacher();
        Teacher p2 =  (Teacher)p1;
        System.out.println("----------------------");
        Persons p3 = new Persons();
        Persons p4 = new Teacher();
        System.out.println(p3 instanceof Persons);
        System.out.println(p3 instanceof Teacher);
        System.out.println("=============-========");
        System.out.println(p4 instanceof Persons);
        System.out.println(p4 instanceof Teacher);
        if(p3 instanceof Teacher){
            Teacher t3 = (Teacher) p3;
        }
        Teacher t4 =new Teacher();
        t4.eat();
    }

}

class Persons{
    public void eat(){
        System.out.println("吃饭！");
    }

}
class Teacher extends Persons{
    public Teacher(){
        System.out.println("Teacher");
    }

}
