package com.homework180421;

/**
 * Created by WangNing.
 * Date: 2018/5/11
 * Time: 13:07
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Gog a =new Gog("花花",1);
        System.out.println(a); //b就是调用的b.toString()
        Gog b=new Gog("球球",2);
        Gog c=new Gog("球球",2);
        System.out.println(b.equals(c));//比较的是对象的地址，new出来的地方是不相等的
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

class Animal{
}

class Gog extends Animal{
    private String name;
    private int age;

    public Gog(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString(){
        return "[" +this.name+","+this.age+ "]" ;
    }

    public boolean equals(Object obj){
        if(this==obj)   //比较的是地址
            return true;
        if(obj==null)
            return false;
        if (obj instanceof Gog){
            Gog dog =(Gog)obj;
            return this.name.equals(dog.getName()) && this.age==dog.getAge();
        }
        return false;
    }

    public int hashCode(){  //
        return this.name.hashCode()+this.age;
    }

}
