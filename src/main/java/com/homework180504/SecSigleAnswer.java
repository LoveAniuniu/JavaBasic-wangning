package com.homework180504;

/**
 * Created by WangNing.
 * Date: 2018/5/17
 * Time: 15:24
 */
public class SecSigleAnswer extends SecQuestion {
    String answer;

    public SecSigleAnswer(String id, String title, String[] option) {
        super(id, title, option);
    }

    public SecSigleAnswer(String id, String title, String[] option, String answer) {
        super(id, title, option);
        this.answer = answer;
    }

    @Override
    public boolean check(String[] answers) {
        if(this.answer.length()!=1){
            return false;
        }else {
            return answer.equals(answers[0]);
        }

    }
}
