package com.homework180421;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Created by WangNing.
 * Date: 2018/5/8
 * Time: 14:30
 */
public class Student {
    String name;
    int age;
    String id;

    public Student(String name, int age,String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class TestStudent{
    public static void main(String[] args) {
        Student s1  = new Student("小毒人",18,"S001");
        s1.age =18;
        System.out.println(s1.name+":"+s1.age);

        Student s2 = new Student("萌新",18,"S001");
    }
}
