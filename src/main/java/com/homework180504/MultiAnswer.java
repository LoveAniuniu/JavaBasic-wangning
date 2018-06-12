package com.homework180504;

import java.util.Arrays;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 14:56
 */
public class MultiAnswer extends Question{
    String[] answers;

    public MultiAnswer(String id, String text, String[] options) {
        super(id, text, options);
    }

    public MultiAnswer(String id, String text, String[] options, String[] answers) {
        super(id, text, options);
        this.answers = answers;
    }

    @Override
    public boolean check(String[] answers) {
        return Arrays.equals(this.answers,answers);
    }
}
