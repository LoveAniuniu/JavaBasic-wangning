package com.homework180421;

/**
 * Created by WangNing.
 * Date: 2018/5/9
 * Time: 13:23
 */
public class Person {
    String name;
    int age;
    char gender;
    Person partner;


    public Person(){
    }

    public Person(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public  void marry(Person p){
        if(this.gender==p.gender){
            System.out.println(this.name+"和"+p.name+"不能结婚！");
            return;
        }else if((this.gender=='M'&&this.age<22) ||(this.gender=='F'&&this.age<20)){
            System.out.println("小孩子不能结婚！");
            return;
        }else if(this.partner !=null){
            System.out.println("已婚！");
            return;
        }else if(p.partner !=null){
            System.out.println("已婚！");
            return;
        }
        System.out.println("恭喜"+this.name+"和"+p.name+"结婚！");
        this.partner = p;
        p.partner = this;
    }
}

class TestPerson{
    public static void main(String[] args) {
        Person p = new Person();
        p.name="张三";
        p.age=30;
        p.gender='M';

        Person p1 = new Person("张三",20,'M');
        Person p2 = new Person("李四",25,'F');
        Person p3 = new Person("王五",30,'M');
        Person p4 = new Person("小小",19,'F');

        p1.marry(p2);
        p2.marry(p3);
        p2.marry(p1);
    }
}
