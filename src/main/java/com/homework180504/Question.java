package com.homework180504;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 14:14
 */
public abstract class Question {
    String id;
    String text;
    String[] options;

    public Question(String id, String text, String[] options) {
        this.id = id;
        this.text = text;
        this.options = options;
    }

    public void print(){
        System.out.print(this.id+"、"+this.text);
        System.out.println("\t");//缩进
        System.out.println(Arrays.toString(options));
    }

    public abstract boolean check(String[] answers);
}
