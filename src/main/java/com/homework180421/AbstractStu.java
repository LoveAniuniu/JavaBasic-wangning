package com.homework180421;

/**
 * Created by WangNing.
 * Date: 2018/5/11
 * Time: 11:27
 */
public class AbstractStu {
    static AbstractStuManage sm = new AbstractStuManageImpl();
    public static void main(String[] args) {
        sm.addStudent(new Student("张三",18,"S001"));
        sm.getStuInfobyId();
        sm.removeStubyId("S001");
    }
}

abstract class AbstractStuManage{
    public abstract void getStuInfobyId();
    public abstract void addStudent(Student s);
    public abstract void removeStubyId(String id);
    //public abstract void addStudent(String 张三, int i, String s001);
}

class AbstractStuManageImpl extends AbstractStuManage{

    @Override
    public void getStuInfobyId() {
        System.out.println("查询学生信息");
    }

    @Override
    public void addStudent(Student s) {
        System.out.println("添加学生"+s.getName()+"成功");
    }

    @Override
    public void removeStubyId(String id) {
        System.out.println("删除成功"+id);

    }
}