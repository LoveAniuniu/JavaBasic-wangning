package com.study;

/**
 * Created by WangNing.
 * Date: 2018/5/15
 * Time: 18:48
 */
public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Frad";
        myDogs[1].name = "Marge";

        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);
        Dog d = new Dog();
        for(int i=0;i<myDogs.length;i++){
            myDogs[i].bark();
        }
        int j=0;
        while (j<myDogs.length){
            myDogs[j].eat();
            j++;
        }

    }

    public void bark(){
        System.out.println(name+" says Ruff!");
    }

    public void eat(){
        System.out.println(name+" 吃骨头！");
    }
}
