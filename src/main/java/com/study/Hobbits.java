package com.study;

/**
 * Created by WangNing.
 * Date: 2018/5/15
 * Time: 19:10
 */
public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z= -1;
        while (z<2){
            z++;
            h[z]=new Hobbits();
            h[z].name="Roblt";
            if(z==1){
                h[z].name="billz";
            }
            if(z==2){
                h[z].name="joln";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name;");

        }
    }
}