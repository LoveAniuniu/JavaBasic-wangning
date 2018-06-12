package com.study;

import java.awt.print.Book;
import java.util.BitSet;

/**
 * Created by WangNing.
 * Date: 2018/5/15
 * Time: 19:02
 */
class Books {
    String title;
    String author;
}

class BooksTestDriive{
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();   //数组初始化
        myBooks[1]=new Books();
        myBooks[2]=new Books();
        myBooks[0].title="The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author="bob";
        myBooks[1].author="sue";
        myBooks[2].author="ian";

        int x=0;
        while (x<3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x++;
        }
    }
}
