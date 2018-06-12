package com.homework180504;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 14:27
 */
public class SingleAnswer extends Question{
    String answer;

    public SingleAnswer(String id, String text, String[] options) {
        super(id, text, options);
    }

    public SingleAnswer(String id, String text, String[] options, String answer) {
        super(id, text, options);
        this.answer = answer;
    }

    @Override
    public boolean check(String[] answers) {
        if(answers.length!=1) {
            return false;
        }else{
            return answer.equals(answers[0]);
        }
    }
}
