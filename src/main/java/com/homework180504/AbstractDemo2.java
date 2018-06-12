package com.homework180504;

/**
 * Created by WangNing.
 * Date: 2018/5/16
 * Time: 16:14
 */
public class AbstractDemo2 {
    public static void main(String[] args) {
        Salary sa = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        sa.mailCheck();

        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();

    }
}


class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number,double salary) {
        super(name, address, number);
    }
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + getName()
                + " " + getAddress());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if( salary >= 0.0) {
            this.salary = salary;
        }
    }

    public double computePay()
    {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }

}
/*----------------------------------------------------------------*/
abstract class Employee{
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computePay(){
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck()
    {
        System.out.println("Mailing a check to " + this.name
                + " " + this.address);
    }
    public String toString()
    {
        return name + " " + address + " " + number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }
}
