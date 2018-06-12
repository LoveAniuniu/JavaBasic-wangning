package com.homework180504;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 15:29
 */
public class SecMulAnswer extends SecQuestion{
    String[] answers;

    public SecMulAnswer(String id, String title, String[] option) {
        super(id, title, option);
    }

    public SecMulAnswer(String id, String title, String[] option, String[] answers) {
        super(id, title, option);
        this.answers = answers;
    }

    @Override
    public boolean check(String[] answers) {
        return Arrays.equals(this.answers,answers);
    }
}
