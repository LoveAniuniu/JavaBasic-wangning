package com.homework180504;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 15:20
 */
public abstract class SecQuestion {
    private String id;
    private String title;
    private String[] option;

    public SecQuestion(String id, String title, String[] option) {
        this.id = id;
        this.title = title;
        this.option = option;
    }

    public void display(){
        System.out.println(this.id+"、"+this.title);
        System.out.println(Arrays.toString(option));
    }

    public abstract boolean check(String[] answers);
}
