package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by WangNing.
 * Date: 2018/5/21
 * Time: 12:49
 */
public class Clerk {
    public static void main(String[] args) throws IOException {


        //Emp emp2 = new Emp("Zhangsan","BQ002",2300f);
        EmpManage empm = new EmpManage();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("请选择你的操作");
            System.out.println("1、表示添加柜员");
            System.out.println("2、查找柜员");
            System.out.println("3、修改柜员工资");
            System.out.println("4、删除一个柜员");
            String opr = br.readLine();
            if(opr.equals("1")){
                System.out.println("请输入编号：");
                String empNo = br.readLine();
                System.out.println("请输入姓名：");
                String name = br.readLine();
                System.out.println("请输入薪水：");
                float salary = Float.parseFloat(br.readLine());
                Emp emp1 = new Emp(name,empNo,salary);
                empm.addEmp(emp1);
            }
            else if (opr.equals("2")){
                System.out.println("请输入编号：");
                String empNo = br.readLine();
                empm.showEmp(empNo);
            }
            else if (opr.equals("3")){
                System.out.println("请输入编号：");
                String empNo = br.readLine();
                System.out.println("请输入薪水：");
                float salary = Float.parseFloat(br.readLine());
                empm.updateEmp(empNo,salary);
            }
            else if (opr.equals("4")){
                System.out.println("请输入编号：");
                String empNo = br.readLine();
                empm.delEmp(empNo);
            }

        }
    }

}

class EmpManage{
    private ArrayList al=null;
    public EmpManage(){
        this.al= new ArrayList();
    }
    public void addEmp(Emp emp){
        al.add(emp);
    }
    public void showEmp(String empNo){
        for(int i=0;i<al.size();i++){
            Emp emp =(Emp) al.get(i);
            if (emp.getEmpNo().equals(empNo)){
                System.out.println("Find this EmpMessage:"+"EmpNo"+emp.getEmpNo()+"；name"+emp.getName()+"；Salary"+emp.getSalary());
            }
            System.out.println(emp);
        }
    }

    public void updateEmp(String empNo,float salary){
        for(int i=0;i<al.size();i++){
            Emp emp = (Emp)al.get(i);
            if (emp.getEmpNo().equals(empNo)) {
                emp.setSalary(salary);
            }
            System.out.println(emp);
        }
    }

    public void delEmp(String empNo){
        al.remove(empNo);
        for(int i=0;i<al.size();i++){
            Emp emp = (Emp) al.get(i);
            System.out.println(emp);
        }
    }

}

class Emp{
    private String name;
    private String empNo;
    private float salary;

    public Emp(String name, String empNo, float salary) {
        this.name = name;
        this.empNo = empNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
