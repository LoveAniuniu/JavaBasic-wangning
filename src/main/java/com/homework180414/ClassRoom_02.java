package com.homework180414;

/**
 * Created by WangNing.
 * Date: 2018/4/19
 * Time: 16:46
 * 编写一个程序，在控制台输出个人信息*
 */
public class ClassRoom_02 {
    String name;
    int age;
    String provice;
    String school;
    String major;

    public String student(){
        return "学生信息是："+"\n"+"姓名："+name+"\n"+"年龄："+age+"\n"+"省份"+provice+"\n"+"学校："+school+"\n"+"专业："+major;
    }
    public static void main(String[] args) {
        ClassRoom_02 stu = new ClassRoom_02();
        stu.name="小法";
        stu.age=23;
        stu.provice="北京市";
        stu.school="北京大学";
        stu.major="新闻播音主持";
        String str = stu.student();
        System.out.println(str);
    }
}




