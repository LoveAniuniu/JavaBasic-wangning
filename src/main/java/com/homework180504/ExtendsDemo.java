package com.homework180504;

/**
 * Created by WangNing.
 * Date: 2018/5/16
 * Time: 11:03
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        Person tutor= new Tutor();
        tutor.Salary("Jolin",30,"教师",1000.98f);
        Person lec = new Lecturer();
        lec.Salary("Yoyo",40,"讲师",5000f);
        Person pro = new Professor();
        pro.Salary("Hardon",50,"教授",8000f);
    }
}

class Tutor extends Person{
    //作用域：
    // public     当前类 同一package 子孙类 其他package
    // protected  当前类 同一package 子孙类
    // 默认       当前类 同一package
    // private    当前类
    public void teach1(){
        System.out.println("助教不能教课！");
    }
}

class Lecturer extends Person{
    public void teach2(){
        System.out.println("只能讲基础课程！");
    }
}

class Professor extends Lecturer{
    public void teach3(){
        System.out.println("可以讲专业课程！");
    }
}


class Person{
    String name;
    int age;
    String post;
    float salary;
    public void Person(String name,int age,String post,float salary){
        this.name=name;
        this.age=age;
        this.post=post;
        this.salary=salary;
    }
    public void Salary(String name,int age,String post,float salary){
        System.out.println(name+"的年龄是"+age+";"+"职位是"+post+";"+"工资是"+salary);
    }
}
